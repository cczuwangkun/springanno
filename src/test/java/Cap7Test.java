import com.enjoy.cap7.config.Cap7ConfigOfBeanLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:waken
 * @Date: Created in 2019/4/27 21:49
 * @Description:
 */

public class Cap7Test {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap7ConfigOfBeanLifeCycle.class);

        System.out.println("IOC 容器创建完成。。。");

        //销毁 调用map的clear方法。
        context.close();


    }
}
