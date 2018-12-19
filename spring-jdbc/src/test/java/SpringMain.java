

import java.util.List;
import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringMain {

    public static void main(String[] args) throws InterruptedException {
        //Get the Spring Context
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        //Get the EmployeeDAO Bean
        EmployeeDAO employeeDAO = ctx.getBean("employeeDAO", EmployeeDAO.class);

        //Run some tests for JDBC CRUD operations
        Employee emp = new Employee();
        int rand = new Random().nextInt(1000);
        emp.setId(rand);
        emp.setName("Pankaj");
        emp.setRole("Java Developer");

        //Create
        employeeDAO.save(emp);

        //Read
        Employee emp1 = employeeDAO.getById(rand);
        System.out.println("Employee Retrieved::"+emp1);

        //Update
        emp.setRole("CEO");
        employeeDAO.update(emp);

        //Get All
        List<Employee> empList = employeeDAO.getAll();
        System.out.println(empList);

        //Delete
//        employeeDAO.deleteById(rand);
        Thread.sleep(10000);

        //Close Spring Context
        ctx.close();

        System.out.println("DONE");
    }

}
