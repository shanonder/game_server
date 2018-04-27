//package com.icday.game.configs;
//
//import org.redisson.Redisson;
//import org.redisson.api.RedissonClient;
//import org.redisson.config.Config;
//import org.redisson.config.SentinelServersConfig;
//import org.redisson.config.SingleServerConfig;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
//import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * redisson auto configuration
// *
// */
//@SuppressWarnings("SpringJavaAutowiringInspection")
//@Configuration
//@AutoConfigureAfter(RedisAutoConfiguration.class)
//public class RedissonAutoConfiguration {
//    @Autowired
//    private RedisProperties redisProperties;
//
//
//    @Bean
//    public RedissonClient redissonClient() {
//
//        Config config = new Config();
//        //sentinel
//        if (redisProperties.getSentinel() != null) {
//            SentinelServersConfig sentinelServersConfig = config.useSentinelServers();
//            sentinelServersConfig.setMasterName(redisProperties.getSentinel().getMaster());
//            redisProperties.getSentinel().getNodes();
//            for(int i = 0 , len = redisProperties.getSentinel().getNodes().size(); i < len ; ++i){
//                sentinelServersConfig.addSentinelAddress(redisProperties.getSentinel().getNodes().get(i));
//            }
////            sentinelServersConfig.addSentinelAddress(redisProperties.getSentinel().getNodes().split(","));
//            sentinelServersConfig.setDatabase(redisProperties.getDatabase());
//            if (redisProperties.getPassword() != null) {
//                sentinelServersConfig.setPassword(redisProperties.getPassword());
//            }
//        } else {
//            //single server
//
////            SingleServerConfig serverConfig = config.useSingleServer()
////                    .setAddress(redssionProperties.getAddress())
////                    .setTimeout(redssionProperties.getTimeout())
////                    .setConnectionPoolSize(redssionProperties.getConnectionPoolSize())
////                    .setConnectionMinimumIdleSize(redssionProperties.getConnectionMinimumIdleSize());
//
//            SingleServerConfig singleServerConfig = config.useSingleServer();
//
////            String schema = redisProperties.isSsl() ? "rediss://" : "redis://";
//            singleServerConfig.setAddress("rediss://" + redisProperties.getHost() + ":" + redisProperties.getPort());
//            singleServerConfig.setDatabase(redisProperties.getDatabase());
//            if (redisProperties.getPassword() != null) {
//                singleServerConfig.setPassword(redisProperties.getPassword());
//            }
//        }
//        return Redisson.create(config);
//    }
//}
//
