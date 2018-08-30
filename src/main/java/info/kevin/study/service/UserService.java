/**  
 * Project Name:sharding-jdbc-mybatis  
 * File Name:UserService.java  
 * Package Name:info.kevin.study.service  
 * Date:2018年8月23日上午10:55:45  
 * Copyright (c) 2018
 *  
*/  
  
package info.kevin.study.service;

import java.util.List;

import info.kevin.study.entity.User;

/**  
 * ClassName:UserService <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2018年8月23日 上午10:55:45 <br/>  
 * @author   YangGuangFeng  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */
public interface UserService {

    public boolean insert(User u);  
      
    public List<User> findAll();  
      
    public List<User> findByUserIds(List<Integer> ids);  
      
    public void transactionTestSucess();  
      
    public void transactionTestFailure() throws IllegalAccessException;
}
  
