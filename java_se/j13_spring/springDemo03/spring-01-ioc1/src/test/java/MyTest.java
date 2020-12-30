import com.tommy.why.dao.UserDao02Impl;
import com.tommy.why.dao.UserDaoImpl;
import com.tommy.why.service.UserService;
import com.tommy.why.service.UserServiceImpl;
import org.junit.Test;

public class MyTest {

    @Test
    public void test01(){
        UserService userService = new UserServiceImpl();

//        userService.getUser();
        ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
        userService.getUser();

        System.out.println("-------");
        ((UserServiceImpl) userService).setUserDao(new UserDao02Impl());
        userService.getUser();


    }
}
