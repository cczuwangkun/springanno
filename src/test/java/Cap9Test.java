import com.enjoy.cap8.bean.Bird;
import com.enjoy.cap8.config.Cap8MainConfig;
import com.enjoy.cap9.Dao.TestDao;
import com.enjoy.cap9.Service.TestService;
import com.enjoy.cap9.config.Cap9MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Author:waken
 * @Date: Created in 2019/4/27 21:49
 * @Description:
 */

public class Cap9Test {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap9MainConfig.class);

        TestService bean = context.getBean(TestService.class);
        bean.print();

        TestDao testDao = context.getBean(TestDao.class);
        System.out.println(testDao);

        context.close();


    }
}
