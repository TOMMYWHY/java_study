package com.tommy.why;

import static org.junit.Assert.assertTrue;

import com.tommy.why.dao.StudentDao;
import com.tommy.why.entity.Student;
import com.tommy.why.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   @Test
    public void test01(){
       String config = "applicationContext.xml";
       ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
       String[] names = ctx.getBeanDefinitionNames();
       for (String na:names){
           System.out.println("container obj:"+na + " | "+ctx.getBean(na).getClass().getCanonicalName());
       }
   }
   @Test
    public void  testDaoInsert(){
       String config="applicationContext.xml";
       ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
       StudentDao dao = (StudentDao) ctx.getBean("studentDao");
       System.out.println("dao:"+dao);
//       Student gay = new Student(2010, "gay",18, 59, null, null);
       Student gay = new Student(2020,"shabi",73,59,null,null);
       int result=  dao.insertStudent(gay);
       System.out.println("result:"+result);
   }

   @Test
   public void testService(){
      String config="applicationContext.xml";
      ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

      StudentService service = (StudentService) ctx.getBean("studentService");
      Student gay = new Student(2021,"gayby",82,39,null,null);
      int result=  service.addStudent(gay);
      System.out.println("result:"+result);
   }

   @Test
   public void testSelectService(){
      String config="applicationContext.xml";
      ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
      StudentService service = (StudentService) ctx.getBean("studentService");
      List<Student> students = service.queryStudents();
      System.out.println("---------");
      for(Student stu : students){
         System.out.println(stu);
      }
   }
}
