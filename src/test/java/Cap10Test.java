import com.enjoy.cap10.AOP.Calculator;
import com.enjoy.cap10.Config.Cap10MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:waken
 * @Date: Created in 2019/5/28 21:07
 * @Description:
 */
public class Cap10Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap10MainConfig.class);

        Calculator calculator = context.getBean(Calculator.class);

        int div = calculator.div(4, 1);

        System.out.println(div);

        context.close();

    }
}
