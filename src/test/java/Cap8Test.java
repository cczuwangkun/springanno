import com.enjoy.cap7.config.Cap7ConfigOfBeanLifeCycle;
import com.enjoy.cap8.bean.Bird;
import com.enjoy.cap8.config.Cap8MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Author:waken
 * @Date: Created in 2019/4/27 21:49
 * @Description:
 */

public class Cap8Test {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap8MainConfig.class);

        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        Bird bird = (Bird) context.getBean("bird");

        System.out.println(bird);
        System.out.println("IOC 容器创建完成。。。");

        ConfigurableEnvironment environment = context.getEnvironment();
        System.out.println(environment.getProperty("bird.name"));

        context.close();


    }
}
