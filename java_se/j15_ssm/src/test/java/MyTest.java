import com.tommy.why.pojo.Books;
import com.tommy.why.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01(){

        ApplicationContext cx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookServiceImpl = cx.getBean("bookServiceImpl", BookService.class);
        for (Books books:bookServiceImpl.queryAllBooks()
             ) {
            System.out.println(books);
        }
    }
}
