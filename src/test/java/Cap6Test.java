import com.enjoy.cap5.config.Cap5MainConfig;
import com.enjoy.cap6.config.Cap6MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:waken
 * @Date: Created in 2019/4/25 20:59
 * @Description:
 */

public class Cap6Test {
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap6MainConfig.class);

        Object factoryBean = context.getBean("factoryBean");
        System.out.println(factoryBean.getClass()+"---------");

        String[] names = context.getBeanDefinitionNames();
        for (String name:names){
            System.out.println(name);
        }

    }
}
