package data;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.List;
import java.util.Random;

@Configuration
@ComponentScan
//@Controller
//@EnableAutoConfiguration
public class SpringMain {

    public static void main(String[] args) {
        //Get the Spring Context
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMain.class);

        //Get the data.EmployeeDAO Bean
        EmployeeDAO employeeDAO = ctx.getBean(EmployeeDAO.class);

        //Run some tests for JDBC CRUD operations
        Employee emp = new Employee();
        int rand = new Random().nextInt(1000);
        emp.setId(rand);
        emp.setName("Pankaj");
        emp.setRole("Java Developer123");

        //Create
        employeeDAO.save(emp);

        //Read
        Employee emp1 = employeeDAO.getById(rand);
        System.out.println("data.Employee Retrieved::" + emp1);

        /**

         //Update
         emp.setRole("CEO");
         employeeDAO.update(emp);
         */
        //Get All
        List<Employee> empList = employeeDAO.getAll();
        System.out.println(empList.size());

        //Delete
        //        employeeDAO.deleteById(rand);
//         Thread.sleep(10000);


        //Close Spring Context
        ctx.close();

        System.out.println("DONE");
    }

//    @Bean
//    public DataSource dataSource() {
//        return new EmbeddedDatabaseBuilder()
//                .setType(EmbeddedDatabaseType.H2)
//                .setName("TEST")
//                .addScript("classpath:jdbc/schema.sql")
////                .addScript("classpath:jdbc/test-data.sql")
//                .build();
//    }
}
