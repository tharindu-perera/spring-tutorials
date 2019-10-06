package data;

import java.util.List;


//CRUD operations
public interface EmployeeDAO {

    //Create
    void save(Employee employee);
    //Read
    Employee getById(int id);
    //Update
    void update(Employee employee);
    //Delete
    void deleteById(int id);
    //Get All
    List<Employee> getAll();
}
