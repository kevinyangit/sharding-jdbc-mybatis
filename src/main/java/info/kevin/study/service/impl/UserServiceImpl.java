/**  
 * Project Name:sharding-jdbc-mybatis  
 * File Name:UserServiceImpl.java  
 * Package Name:info.kevin.study.service.impl  
 * Date:2018年8月23日上午10:58:01  
 * Copyright (c) 2018
 *  
*/  
  
package info.kevin.study.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import info.kevin.study.entity.Student;
import info.kevin.study.entity.User;
import info.kevin.study.mapper.StudentMapper;
import info.kevin.study.mapper.UserMapper;
import info.kevin.study.service.UserService;

/**  
 * ClassName:UserServiceImpl <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2018年8月23日 上午10:58:01 <br/>  
 * @author   YangGuangFeng  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */
@Service  
@Transactional  
public class UserServiceImpl implements UserService {  
  
    @Resource  
    public UserMapper userMapper;  
      
    @Resource  
    public StudentMapper studentMapper;  
  
    public boolean insert(User u) {  
        return userMapper.insert(u) > 0 ? true :false;  
    }  
  
    public List<User> findAll() {  
        return userMapper.findAll();  
    }  
  
    public List<User> findByUserIds(List<Integer> ids) {  
        return userMapper.findByUserIds(ids);  
    }  
  
    @Transactional(propagation=Propagation.REQUIRED)  
    public void transactionTestSucess() {  
        User u = new User();  
        u.setUserId(13);  
        u.setAge(25);  
        u.setName("war3 1.27");  
        userMapper.insert(u);  
          
        Student student = new Student();  
        student.setStudentId(21);  
        student.setAge(21);  
        student.setName("hehe");  
        studentMapper.insert(student);  
    }  
  
    @Transactional(propagation=Propagation.REQUIRED)  
    public void transactionTestFailure() throws RuntimeException {  
        User u = new User();  
        u.setUserId(13);  
        u.setAge(25);  
        u.setName("war3 1.27 bad");  
        userMapper.insert(u);  
          
        Student student = new Student();  
        student.setStudentId(21);  
        student.setAge(21);  
        student.setName("hehe1");  
        studentMapper.insert(student);  
        throw new RuntimeException();  
    }  
      
} 