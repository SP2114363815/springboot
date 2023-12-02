package com.atguigu.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 读取配置的的方式一：@Value 直接在属性上添加即可 @Value(key必须写全) @Value只能读取单个值
 *批量配置读取 @ConfigurationProperties(prefix="spp.user") 通用的前缀
 * 实体类
 *  属性名=最后一个key的值
 *  优势一：方便，不用一个一个读取
 *  优势二：可以给集合赋值
 *
 *
 *
 */
@Component
@Data
@ConfigurationProperties(prefix = "spp.user")
public class User {
//    @Value("${spp.user.username}")
    private String username;
//    @Value("${spp.user.password}")
    private String password;
//    @Value("${spp.user.gfs}")
    private List<String> gfs;
}
