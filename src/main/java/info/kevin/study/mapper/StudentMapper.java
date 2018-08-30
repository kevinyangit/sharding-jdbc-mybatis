/**  
 * Project Name:sharding-jdbc-mybatis  
 * File Name:Student.java  
 * Package Name:info.kevin.study.mapper  
 * Date:2018年8月23日上午10:49:14  
 * Copyright (c) 2018
 *  
*/

package info.kevin.study.mapper;

import java.util.List;

import info.kevin.study.entity.Student;

/**
 * ClassName:Student <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年8月23日 上午10:49:14 <br/>
 * 
 * @author YangGuangFeng
 * @version
 * @since JDK 1.8
 * @see
 */
public interface StudentMapper {
	Integer insert(Student s);

	List<Student> findAll();

	List<Student> findByStudentIds(List<Integer> studentIds);

}
