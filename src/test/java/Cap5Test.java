import com.enjoy.cap5.config.Cap5MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:waken
 * @Date: Created in 2019/4/25 20:59
 * @Description:
 */

public class Cap5Test {
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap5MainConfig.class);


    }
}
