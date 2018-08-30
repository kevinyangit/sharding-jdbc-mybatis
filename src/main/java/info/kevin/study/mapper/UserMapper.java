/**  
 * Project Name:sharding-jdbc-mybatis  
 * File Name:UserMapper.java  
 * Package Name:info.kevin.study.mapper  
 * Date:2018年8月23日上午10:48:17  
 * Copyright (c) 2018
 *  
*/

package info.kevin.study.mapper;

import java.util.List;

import info.kevin.study.entity.User;

/**
 * ClassName:UserMapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年8月23日 上午10:48:17 <br/>
 * 
 * @author YangGuangFeng
 * @version
 * @since JDK 1.8
 * @see
 */
public interface UserMapper {
	Integer insert(User u);

	List<User> findAll();

	List<User> findByUserIds(List<Integer> userIds);

}
