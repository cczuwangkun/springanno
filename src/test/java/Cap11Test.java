import com.enjoy.cap11.Service.OrderService;
import com.enjoy.cap11.config.Cap11MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:waken
 * @Date: Created in 2019/6/16 18:32
 * @Description:
 */

public class Cap11Test {

    @Test
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap11MainConfig.class);

        OrderService bean = context.getBean(OrderService.class);

        bean.addOrder();

        context.close();
    }
}
