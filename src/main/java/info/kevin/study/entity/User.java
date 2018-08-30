/**  
 * Project Name:sharding-jdbc-mybatis  
 * File Name:User.java  
 * Package Name:info.kevin.study.entity  
 * Date:2018年8月23日上午10:41:00  
 * Copyright (c) 2018
 *  
*/  
  
package info.kevin.study.entity;

import java.io.Serializable;

/**  
 * ClassName:User <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2018年8月23日 上午10:41:00 <br/>  
 * @author   YangGuangFeng  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */
public class User implements Serializable{

	/**  
	 * @since JDK 1.8  
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer userId;
	private String name;
	private Integer age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
		return "User [id=" + id + ", userId=" + userId + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
  
