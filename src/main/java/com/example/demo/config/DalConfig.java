package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author zkm
 * @date 2019/5/19 18:29
 */
@Configuration
@tk.mybatis.spring.annotation.MapperScan("com.example.demo.mapper")
@EnableTransactionManagement
public class DalConfig {
}