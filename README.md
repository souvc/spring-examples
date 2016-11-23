# spring-examples

Spring是一种轻量级的、非侵入式的Java/JavaEE应用框架。 

Spring能干的事情很多，最基本的有以下几条：  

``` java

1. IoC/DI
2. AOP
3. 对JDBC和ORM的支持
4. 服务(典型如：事务)
5. 各种技术的整合（典型如：Struts2+Spring3+Hibernate3整合，还有很多其他的技术整合，如EJB、JMS等）
6. Web应用框架（SpringMVC）
7. 更多技术，如：Spring的Security、Spring的Web Flow、Spring的WebService等等

```

##Spring 官网网站

- Spring 官网：http://projects.spring.io/spring-framework/
- Spring 源码：https://github.com/spring-projects/spring-framework
- Spring Reference Guide 英文版：[《Spring 参考指南》](http://docs.spring.io/spring-framework/docs/current/spring-framework-reference/html/index.html)
- Spring Reference Guide 中文版：[《Spring 参考指南》](https://github.com/souvc/spring-framework-4-reference/blob/master/SUMMARY.md)

##Spring 各个版本的下载地址

- [地址1](http://repo.springsource.org/libs-release-local/org/springframework/spring/)
- [地址2](http://repo.spring.io/milestone/org/springframework/spring/)
- [地址3](https://github.com/spring-projects/spring-framework/tags)
- [地址4](http://maven.springframework.org/release/org/springframework/spring/)


##本项目内容为Spring 教程程序样例

作者博客：http://www.souvc.com

项目环境：（[直接复制可依赖的配置](https://github.com/souvc/spring-examples/blob/master/dependency.md)）

引用例子：

``` java

 <!--统一版本号-->
 <properties>
     <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	 <org.springframework.version>4.3.3.RELEASE</org.springframework.version>
 </properties>
 
 <dependencies>
 
    <!-- Spring环境支持-->
     <dependency>
         <groupId>org.springframework</groupId>
         <artifactId>spring-context</artifactId>
         <version>${org.springframework.version}</version>
     </dependency>  
      
    <!-- junit测试环境支持-->
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>
      
 </dependencies>

```


如您觉得该项目对您有用，欢迎点击右上方的 **Star** 按钮，给予支持！！

如有问题，可直接提交issues：【 [地址](https://github.com/souvc/spring-examples/issues) 】


##样例列表

* **I. Spring 快速入门**

    * 通过spring输出一个helloworld （XML 配置）：[Chapter1-1-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter1-1-1)
    * 通过spring输出一个helloworld （注解配置）：[Chapter1-1-2](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter1-1-2)
   
* **II. Spring 4.x 的新特性**

* **III. Spring 核心容器部分**

   * 5.1. 多种读取spring配置文件并实例化Spring容器：（[Chapter5-1-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-1-1)）
        
        * ClassPathXmlApplicationContext：ApplicationContext实现，从classpath获取配置文件
           * 一个配置文件
           * 多个配置文件
           * 从一个bean中加载其他的配置文件
        * 通过Resource来获取配置文件
        * XmlBeanFactory：BeanFactory实现，提供基本的IOC容器功能，可以从classpath或文件系统等获取资源
        * FileSystemXmlApplicationContext：ApplicationContext实现，从文件系统获取配置文件
             * 从绝对路径加载配置文件  从文件系统获取配置文件
             * 从相对路径加载配置文件2  从文件系统获取配置文件
   
   * 5.2. 容器的介绍 ：（[Chapter5-2](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-2)）
   
        * 5.2.1. Spring容器的配置		
        * 5.2.2. Spring容器的实例化（可以通过多个xml文件实例化） 可以参考：（[Chapter5-1-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-1-1)）
        * 5.2.3. Spring容器的使用
		
   * 5.3. Bean 的介绍  
   
        * 5.3.1. Bean的命名以及Bean的别名：（[Chapter5-3-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-3-1)）     
			
        * 5.3.2. Spring容器支持的多种JavaBean对象创建方式 ：（[Chapter5-3-2](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-3-2)）
		
            * 用构造器来实例化的方式的配置。
            * 使用静态工厂方法实例化的方式。
            * 使用实例工厂方法实例化的方式。
			
   * 5.4. 依赖
   
        * 5.4.1. 依赖注入方式（[Chapter5-4-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-4-1)）
		
            * 利用构造器参数实现依赖属性的注入(Constructor Injection)  （[Chapter5-4-1-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-4-1-1)）
            * 利用Spring实现bean属性setter方式注入(Setter Injection)  （[Chapter5-4-1-2](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-4-1-2)）
            * Dependency resolution process
            * Examples of dependency injection
			
        * 5.4.2. 依赖和详细配置
            * 注入基本值(primitives, Strings, and so on) （[Chapter5-4-2-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-4-2-1)）
            * 注入Bean对象
            * 注入内部Bean对象 
            * 直接集合注入（[Chapter5-4-2-4](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-4-2-4)）
            * 引用方式集合注入 （[Chapter5-4-2-4-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-4-2-4-1)）
			* 注入null或空字符串 （[Chapter5-4-2-5](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-4-2-5)）
            * 表达式注入 （[Chapter5-4-2-6](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-4-2-6)）
			* XML shortcut with the p-namespace
            * XML shortcut with the c-namespace
            * Compound property names
			
        * 5.4.3. Using depends-on
		
        * 5.4.4. Lazy-initialized beans
		
        * 5.4.5. Autowiring collaborators
            * Limitations and disadvantages of autowiring
            * Excluding a bean from autowiring
			
        * 5.4.6. Method injection
            * Lookup method injection
            * Arbitrary method replacement
			
   * 5.5. 如何控制Bean实例化
   
        * 5.5.1. 单例模式（singleton ）（[Chapter5-5-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-5-1)）
		
        * 5.5.2. 原型模式（prototype ）（[Chapter5-5-2](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-5-2)）
		
        * 5.5.3. Singleton beans with prototype-bean dependencies
		
        * 5.5.4. Request, session, and global session scopes
            * Initial web configuration
            * Request scope
            * Session scope
            * Global session scope
            * Application scope
            * Scoped beans as dependencies
			
        * 5.5.5. Custom scopes
            * Creating a custom scope
            * Using a custom scope
			
   * 5.6. Customizing the nature of a bean
   
        * 5.6.1. Lifecycle callbacks
		
            * Bean对象的初始化 ：（[Chapter5-6-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-6-1)）
			
            * Bean对象的销毁 ：（[Chapter5-6-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-6-1)）
			
            * 默认初始化和销毁的方法 （[Chapter5-6-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-6-1)）
			
            * Combining lifecycle mechanisms
            * Startup and shutdown callbacks
            * Shutting down the Spring IoC container gracefully in non-web applications
			
        * 5.6.2. ApplicationContextAware and BeanNameAware
        * 5.6.3. Other Aware interfaces
		
   * 5.7. Bean definition inheritance
   
   * 5.8. Container Extension Points
        * 5.8.1. Customizing beans using a BeanPostProcessor
            * Example: Hello World, BeanPostProcessor-style
            * Example: The RequiredAnnotationBeanPostProcessor
        * 5.8.2. Customizing configuration metadata with a BeanFactoryPostProcessor
            * Example: the Class name substitution PropertyPlaceholderConfigurer
            * Example: the PropertyOverrideConfigurer
        * 5.8.3. Customizing instantiation logic with a FactoryBean
		
		
   * 5.9. Spring 基本注解配置
        * 5.9.1. @Required
        * 5.9.2. @Autowired
        * 5.9.3. Fine-tuning annotation-based autowiring with qualifiers
        * 5.9.4. Using generics as autowiring qualifiers
        * 5.9.5. CustomAutowireConfigurer
        * 5.9.6. @Resource
        * 5.9.7. @PostConstruct and @PreDestroy
		
   * 5.10. 类扫描以及注解管理
        * 5.10.1. @Component and further stereotype annotations
        * 5.10.2. Meta-annotations
        * 5.10.3. Automatically detecting classes and registering bean definitions
        * 5.10.4. Using filters to customize scanning
        * 5.10.5. Defining bean metadata within components
        * 5.10.6. Naming autodetected components
        * 5.10.7. Providing a scope for autodetected components
        * 5.10.8. Providing qualifier metadata with annotations
		
   * 5.11. 使用JSR 330标准注解
        * 5.11.1. Dependency Injection with @Inject and @Named
        * 5.11.2. @Named: a standard equivalent to the @Component annotation
        * 5.11.3. Limitations of the standard approach
		
   * 5.12. 基于java的容器配置
        * 5.12.1. Basic concepts: @Bean and @Configuration
        
        * 5.12.2. 实例化 Spring 容器类 AnnotationConfigApplicationContext
            * Simple construction
            * Building the container programmatically using register(Class<?>…)
            * Enabling component scanning with scan(String…)
            * Support for web applications with AnnotationConfigWebApplicationContext
            
        * 5.12.3. @Bean 注解
            * Declaring a bean
            * Receiving lifecycle callbacks
            * Specifying bean scope
            * Customizing bean naming
            * Bean aliasing
            * Bean description
        * 5.12.4. Using the @Configuration annotation
            * Injecting inter-bean dependencies
            * Lookup method injection
            * Further information about how Java-based configuration works internally
        * 5.12.5. Composing Java-based configurations
            * Using the @Import annotation
            * Conditionally including @Configuration classes or @Beans
            * Combining Java and XML configuration
			
   * 5.13. Environment abstraction
        * 5.13.1. Bean definition profiles
            * @Profile
        * 5.13.2. XML Bean definition profiles
            * Enabling a profile
            * Default profile
        * 5.13.3. PropertySource Abstraction
        * 5.13.4. @PropertySource
        * 5.13.5. Placeholder resolution in statements
		
   * 5.14. Registering a LoadTimeWeaver
   
   * 5.15. Additional Capabilities of the ApplicationContext
        * 5.15.1. Internationalization using MessageSource
        * 5.15.2. Standard and Custom Events
        * 5.15.3. Convenient access to low-level resources
        * 5.15.4. Convenient ApplicationContext instantiation for web applications
        * 5.15.5. Deploying a Spring ApplicationContext as a Java EE RAR file
		
   * 5.16. The BeanFactory
        * 5.16.1. BeanFactory or ApplicationContext?
        * 5.16.2. Glue code and the evil singleton
	

* **IV. Testing**


* **V. 数据访问（Data Access）**

   * 12.事务管理

   * 13.DAO 支持
   
        * 基于JdbcDaoSupport类编写DAO，然后使用JdbcTemplate对象进行操作 （[Chapter13-1-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter13-1-1)）
		
        * 直接在Spring容器创建JdbcTemplate，然后注入到DAO进行操作 （[Chapter13-1-2](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter13-1-2)）
   
   * 14.Data access with JDBC
   
   * 14.2. Spring JDBC 的使用
   
        * 14.2.1. JdbcTemplate 使用案例 （[Chapter14-2-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter14-2-1)）
		
        * 14.2.2. NamedParameterJdbcTemplate 使用案例 （[Chapter14-2-2](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter14-2-2)）
   
   * 15.Object Relational Mapping (ORM) Data Access
   
   * 16.Marshalling XML using O/X Mappers
   

* **VI. The Web**

   * 17.Web MVC 框架
   
   * 17.1. Spring Web MVC 框架介绍
   
        * 17.1.1. Spring web HelloWorld（XML） ：（[Chapter17-1-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter17-1-1)）
		
        * 17.1.2. Spring web HelloWorld（XML+Annotation） ：（[Chapter17-1-2](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter17-1-2)）


* **VII. 集成部分（Integration）**

    * Spring Scheduling Support
	
	    * [Chapter34-1-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter34-1-1): Spring2.5 + JDK Timer scheduler example
		
		* [Chapter34-1-2](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter34-1-2): Spring3 + Quartz 1.8.6 scheduler example
	

* **VIII. Appendices**


