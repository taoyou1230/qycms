package com.windcoder.qycms.core.system.shiro;

import com.windcoder.qycms.core.system.shiro.PasswordHelper;
//import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
//import org.apache.shiro.cache.CacheManager;
//import org.apache.shiro.mgt.SecurityManager;
//import org.apache.shiro.realm.Realm;
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
//import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
//import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
//import org.apache.shiro.web.filter.authc.LogoutFilter;
//import org.crazycake.shiro.RedisCacheManager;
//import org.crazycake.shiro.RedisManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;

//@Configuration
public class ShiroConfiguration {

    @Autowired
    RedisProperties redisProperties;





//    @Bean
//    public ShiroFilterFactoryBean shirFilter(SecurityManager securityManager) {
//        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
//        shiroFilterFactoryBean.setSecurityManager(securityManager);
//
//
//        Map<String, Filter> filters = new LinkedHashMap<String, Filter>();
//        LogoutFilter logoutFilter = new LogoutFilter();
//        logoutFilter.setRedirectUrl("/login");
//        filters.put("logout", logoutFilter);
//        FormAuthenticationFilter formAuthenticationFilter = new SimpleFormAuthenticationFilter();
//        filters.put("authc", formAuthenticationFilter);
//        ApiAuthenticationFilter apiAuthenticationFilter = new ApiAuthenticationFilter();
//        apiAuthenticationFilter.setLoginUrl("/api/login");
//        filters.put("autha", apiAuthenticationFilter);
//        shiroFilterFactoryBean.setFilters(filters);
//
//
//        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
//        //注意过滤器配置顺序 不能颠倒
//        //配置退出 过滤器,其中的具体的退出代码Shiro已经替我们实现了，登出后跳转配置的loginUrl
//        filterChainDefinitionMap.put("/logout", "logout");
//        // 配置不会被拦截的链接 顺序判断
//        filterChainDefinitionMap.put("/static/**", "anon");
//        filterChainDefinitionMap.put("/ajaxLogin", "anon");
//        filterChainDefinitionMap.put("/api/users/**", "anon");
//        filterChainDefinitionMap.put("/login", "anon");
//        filterChainDefinitionMap.put("/**", "authc");
//        //配置shiro默认登录界面地址，前后端分离中登录界面跳转应由前端路由控制，后台仅返回json数据
//        shiroFilterFactoryBean.setLoginUrl("/unauth");
//        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
//        return shiroFilterFactoryBean;
//    }
//
//    /**
//     * 凭证匹配器
//     * @return
//     */
//    @Bean
//    public HashedCredentialsMatcher hashedCredentialsMatcher() {
//        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
//        hashedCredentialsMatcher.setHashAlgorithmName(PasswordHelper.ALGORITHM);//散列算法:这里使用SHA-256算法;
//        hashedCredentialsMatcher.setHashIterations(PasswordHelper.HASHITERATIONS);//散列的次数，比如散列两次，相当于 SHA-256(SHA-256(""));
//        return hashedCredentialsMatcher;
//    }
//
//    @Bean
//    @DependsOn("lifecycleBeanPostProcessor")
//    public Realm myShiroRealm() {
//        UserRealm myShiroRealm = new UserRealm();
//        return myShiroRealm;
//    }
//
//
//    public RedisManager redisManager() {
//        RedisManager redisManager = new RedisManager();
//        redisManager.setHost(redisProperties.getHost());
//        redisManager.setPort(redisProperties.getPort());
//        redisManager.setTimeout(redisProperties.getTimeout());
//        redisManager.setPassword(redisProperties.getPassword());
//        return redisManager;
//    }
//
//
//
//
//
//    @Bean("shiroRedisCacheManager")
//    public CacheManager cacheManager() {
//        RedisCacheManager redisCacheManager = new RedisCacheManager();
//        redisCacheManager.setRedisManager(redisManager());
//        return redisCacheManager;
//    }
//
//
//    @Bean
//    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
//        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
//        return chainDefinition;
//    }
//
//    @Bean
//    @ConditionalOnMissingBean
//    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
//        DefaultAdvisorAutoProxyCreator daap = new DefaultAdvisorAutoProxyCreator();
//        // shiro starter 默认实现未设置此属性，会导致开启事务的Service无法注入，因此替换默认设置
//        daap.setProxyTargetClass(true);
//        return daap;
//    }

//    @Bean
//    public ShiroDialect shiroDialect(){
//        return new ShiroDialect();
//    }



}