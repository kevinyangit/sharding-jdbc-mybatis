/**  
 * Project Name:sharding-jdbc-mybatis  
 * File Name:Student.java  
 * Package Name:info.kevin.study.entity  
 * Date:2018年8月23日上午10:45:44  
 * Copyright (c) 2018
 *  
*/  
  
package info.kevin.study.entity;

import java.io.Serializable;

/**  
 * ClassName:Student <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2018年8月23日 上午10:45:44 <br/>  
 * @author   YangGuangFeng  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */
public class Student implements Serializable {

	/**  
	 * @since JDK 1.8  
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer studentId;
	private String name;
	private Integer age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentId=" + studentId + ", name=" + name + ", age=" + age + "]";
	}
	
}
  
