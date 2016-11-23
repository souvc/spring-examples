package com.souvc.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//类似：
//<import resource="config/customer.xml"/>
//<import resource="config/scheduler.xml"/>
@Configuration
@Import({ CustomerConfig.class, SchedulerConfig.class })
public class AppConfig {

}