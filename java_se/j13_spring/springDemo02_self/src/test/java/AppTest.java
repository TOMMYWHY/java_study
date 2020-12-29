import com.tommy.why.dao.UserDao;
import com.tommy.why.factory.MyClazzPathXmlApplication;
import com.tommy.why.factory.MyFactory;
import org.junit.Test;

public class AppTest {

    @Test
    public void test01() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        MyFactory myFactory = new MyClazzPathXmlApplication("spring.xml");

        UserDao userDao = (UserDao) myFactory.getBean("userDao");
        userDao.test();
    }

}
