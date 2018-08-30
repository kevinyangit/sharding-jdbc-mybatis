/**  
 * Project Name:sharding-jdbc-mybatis  
 * File Name:ShardingJdbcMybatisTest.java  
 * Package Name:info.kevin.study  
 * Date:2018年8月23日上午11:46:13  
 * Copyright (c) 2018
 *  
*/  
  
package info.kevin.study;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import info.kevin.study.entity.Student;
import info.kevin.study.entity.User;
import info.kevin.study.service.StudentService;
import info.kevin.study.service.UserService;

/**  
 * ClassName:ShardingJdbcMybatisTest <br/>  
 * Function: 测试分库分表规则. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2018年8月23日 上午11:46:13 <br/>  
 * @author   YangGuangFeng  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath*:config/spring/spring-database.xml", "classpath*:config/spring/spring-sharding.xml" })  
public class ShardingJdbcMybatisTest {  

   @Resource  
   public UserService userService;  
     
   @Resource  
   public StudentService studentService;  

   @Test  
   public void testUserInsert() {  
       User u = new User();  
       u.setUserId(11);  
       u.setAge(25);  
       u.setName("github");  
       Assert.assertEquals(userService.insert(u), true);  
   }  
     
   @Test  
   public void testStudentInsert() {  
       Student student = new Student();  
       student.setStudentId(21);  
       student.setAge(21);  
       student.setName("hehe");  
       Assert.assertEquals(studentService.insert(student), true);  
   }  

   @Test  
   public void testFindAll(){  
       List<User> users = userService.findAll();  
       if(null != users && !users.isEmpty()){  
           for(User u :users){  
               System.out.println(u);  
           }  
       }  
   }  
     
   @Test  
   public void testSQLIN(){  
       List<User> users = userService.findByUserIds(Arrays.asList(1));  
       if(null != users && !users.isEmpty()){  
           for(User u :users){  
               System.out.println(u);  
           }  
       }  
   }  
     
   @Test  
   public void testTransactionTestSucess(){  
       userService.transactionTestSucess();  
   }  
     
   @Test(expected = RuntimeException.class)  
   public void testTransactionTestFailure() throws IllegalAccessException{  
       userService.transactionTestFailure();  
   }  
}  
  
