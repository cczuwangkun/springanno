import com.enjoy.BeanLifeCycle.ConfigOfBeanLifeCycle;
import com.enjoy.BeanLifeCycle.Student;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author:waken
 * @Date: Created in 2019/5/27 21:07
 * @Description:
 */

public class LifeCycleTest {
    @Test
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigOfBeanLifeCycle.class);

        Student student = (Student) context.getBean("student");

        student.play();

        System.out.println(student);
        //关闭容器
        context.close();
    }
}
