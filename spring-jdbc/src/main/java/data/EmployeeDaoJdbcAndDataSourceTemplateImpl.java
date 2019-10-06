package data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
@ConditionalOnProperty(name = "f", havingValue = "true")

public class EmployeeDaoJdbcAndDataSourceTemplateImpl implements EmployeeDAO {

    @Autowired
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void save(Employee employee) {
        String query = "insert into Employee (id, name, role) values (?,?,?)";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        Object[] args = new Object[] {employee.getId(), employee.getName(), employee.getRole()};

        int out = jdbcTemplate.update(query, args);

        if(out !=0){
            System.out.println("data.Employee saved with id=" + employee.getId());
        } else System.out.println("data.Employee save failed with id=" + employee.getId());
    }


    public Employee getById(int id) {
        String query = "select id, name, role from Employee where id = ?";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        //using RowMapper anonymous class, we can create a separate RowMapper for reuse
        Employee emp = jdbcTemplate.queryForObject(query, new Object[]{id}, new RowMapper<Employee>(){

            public Employee mapRow(ResultSet rs, int rowNum)
                    throws SQLException {
                Employee emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setRole(rs.getString("role"));
                return emp;
            }});

        return emp;
    }


    public void update(Employee employee) {
        String query = "update Employee set name=?, role=? where id=?";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        Object[] args = new Object[] {employee.getName(), employee.getRole(), employee.getId()};

        int out = jdbcTemplate.update(query, args);
        if(out !=0){
            System.out.println("data.Employee updated with id=" + employee.getId());
        } else System.out.println("No data.Employee found with id=" + employee.getId());
    }


    public void deleteById(int id) {

        String query = "delete from Employee where id=?";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        int out = jdbcTemplate.update(query, id);
        if(out !=0){
            System.out.println("data.Employee deleted with id=" + id);
        } else System.out.println("No data.Employee found with id=" + id);
    }


    public List<Employee> getAll() {
        String query = "select id, name, role from Employee";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        List<Employee> empList = new ArrayList<Employee>();

        List<Map<String,Object>> empRows = jdbcTemplate.queryForList(query);

        for(Map<String,Object> empRow : empRows){
            Employee emp = new Employee();
            emp.setId(Integer.parseInt(String.valueOf(empRow.get("id"))));
            emp.setName(String.valueOf(empRow.get("name")));
            emp.setRole(String.valueOf(empRow.get("role")));
            empList.add(emp);
        }
        return empList;
    }

}
