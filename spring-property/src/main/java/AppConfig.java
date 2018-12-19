import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:some.properties")
@Component
public class AppConfig {

    @Value("${a:aDefaultUrl}")
    private String jdbcUrl;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        new AppConfig().print();
    }

    public void print() {
        System.out.println(jdbcUrl);
    }
}
