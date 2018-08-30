/**  
 * Project Name:sharding-jdbc-mybatis  
 * File Name:SingleSelect.java  
 * Package Name:info.kevin.study  
 * Date:2018年8月28日下午5:28:13  
 * Copyright (c) 2018
 *  
*/

package info.kevin.study;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

import com.dangdang.ddframe.rdb.sharding.api.ShardingDataSource;
import com.dangdang.ddframe.rdb.sharding.api.rule.DataSourceRule;
import com.dangdang.ddframe.rdb.sharding.api.rule.ShardingRule;
import com.dangdang.ddframe.rdb.sharding.api.rule.TableRule;
import com.dangdang.ddframe.rdb.sharding.api.strategy.database.DatabaseShardingStrategy;
import com.dangdang.ddframe.rdb.sharding.api.strategy.table.TableShardingStrategy;

/**
 * ClassName:SingleSelect <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年8月28日 下午5:28:13 <br/>
 * 
 * @author YangGuangFeng
 * @version
 * @since JDK 1.8
 * @see
 */
public final class SingleSelect {

	public static void main(final String[] args) throws SQLException {
		DataSource dataSource = getOrderShardingDataSource();
		printSingleSelect(dataSource);
	}

	private static ShardingDataSource getOrderShardingDataSource() {
		DataSourceRule dataSourceRule = new DataSourceRule(createDataSourceMap());
		TableRule orderTableRule = new TableRule("t_order", Arrays.asList("t_order_0", "t_order_1"), dataSourceRule);
		// TableRule orderTableRule =
		// TableRule.builder("t_order").actualTables(Arrays.asList("t_order_0",
		// "t_order_1")).dataSourceRule(dataSourceRule).build();
		// ShardingRule shardingRule =
//	    ShardingRule shardingRule = ShardingRule.builder().dataSourceRule(dataSourceRule).tableRules(Arrays.asList(orderTableRule))
//                .databaseShardingStrategy(new DatabaseShardingStrategy("user_id", new ModuloDatabaseShardingAlgorithm()))
//                .tableShardingStrategy(new TableShardingStrategy("order_id", new ModuloTableShardingAlgorithm())).build();
		ShardingRule shardingRule = new ShardingRule(dataSourceRule, Arrays.asList(orderTableRule),
				new DatabaseShardingStrategy("user_id", new ModuloDatabaseShardingAlgorithm()),
				new TableShardingStrategy("order_id", new ModuloTableShardingAlgorithm()));
		return new ShardingDataSource(shardingRule);
	}

	private static void printSingleSelect(final DataSource dataSource) throws SQLException {
		String sql = "SELECT * FROM t_order where user_id=? and order_id=?";
		try (Connection conn = dataSource.getConnection();
				PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
			preparedStatement.setInt(1, 10);
			preparedStatement.setInt(2, 1001);
			try (ResultSet rs = preparedStatement.executeQuery()) {
				while (rs.next()) {
					System.out.println(rs.getInt(1));
					System.out.println(rs.getInt(2));
					System.out.println(rs.getInt(3));
				}
			}
		}
	}

	private static DataSource createDataSource(final String dataSourceName) {
		BasicDataSource result = new BasicDataSource();
		result.setDriverClassName(com.mysql.jdbc.Driver.class.getName());
		result.setUrl(String.format("jdbc:mysql://127.0.0.1:3306/%s", dataSourceName));
		result.setUsername("root");
		result.setPassword("mysql");
		return result;
	}

	private static Map<String, DataSource> createDataSourceMap() {
		Map<String, DataSource> result = new HashMap<>(2);
		result.put("ds_jdbc_0", createDataSource("ds_jdbc_0"));
		result.put("ds_jdbc_1", createDataSource("ds_jdbc_1"));
		return result;
	}
}