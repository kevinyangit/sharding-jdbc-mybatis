/**  
 * Project Name:sharding-jdbc-mybatis  
 * File Name:ModuloDatabaseShardingAlgorithm.java  
 * Package Name:info.kevin.study  
 * Date:2018年8月28日下午5:35:29  
 * Copyright (c) 2018
 *  
*/  
  
package info.kevin.study;

import java.util.Collection;

import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.database.SingleKeyDatabaseShardingAlgorithm;

/**  
 * ClassName:ModuloDatabaseShardingAlgorithm <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2018年8月28日 下午5:35:29 <br/>  
 * @author   YangGuangFeng  
 * @version    
 * @since    JDK 1.8  
 * @see        
 */
public final class ModuloDatabaseShardingAlgorithm implements SingleKeyDatabaseShardingAlgorithm<Integer> {

    @Override
    public String doEqualSharding(final Collection<String> dataSourceNames, final ShardingValue<Integer> shardingValue) {
        for (String each : dataSourceNames) {
            if (each.endsWith(shardingValue.getValue() % 2 + "")) {
                return each;
            }
        }
        throw new IllegalArgumentException();
    }

    @Override
    public Collection<String> doInSharding(final Collection<String> dataSourceNames, final ShardingValue<Integer> shardingValue) {
        return null;
    }

    @Override
    public Collection<String> doBetweenSharding(final Collection<String> dataSourceNames, final ShardingValue<Integer> shardingValue) {
        return null;
    }
}