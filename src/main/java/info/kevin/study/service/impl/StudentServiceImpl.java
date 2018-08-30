/**  
 * Project Name:sharding-jdbc-mybatis  
 * File Name:StudentServiceImpl.java  
 * Package Name:info.kevin.study.service.impl  
 * Date:2018年8月23日上午10:59:33  
 * Copyright (c) 2018
 *  
*/  
  
package info.kevin.study.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import info.kevin.study.entity.Student;
import info.kevin.study.mapper.StudentMapper;
import info.kevin.study.service.StudentService;

/**  
 * ClassName:StudentServiceImpl <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2018年8月23日 上午10:59:33 <br/>  
 * @author   YangGuangFeng  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */
@Service  
public class StudentServiceImpl implements StudentService{  
      
    @Resource  
    public StudentMapper studentMapper;  
  
    public boolean insert(Student student) {  
        return studentMapper.insert(student) > 0 ? true : false;  
    }  
  
}