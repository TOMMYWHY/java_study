import com.tommy.why.d3.entity.User;
import com.tommy.why.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    @Test
    public void test01(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Person people = ac.getBean("person", Person.class);
        people.getCat().shout();
        people.getDog().shout();
    }

    @Test
    public void test02(){
        String config = "beans_annotation.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans_annotation.xml");
        Person people = ac.getBean("person", Person.class);
        people.getCat().shout();
        people.getDog().shout();
    }

    @Test
    public void test03(){
        String config = "beans_scan.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        User user = ac.getBean("user", User.class);
        System.out.println(user.name);

    }
}
