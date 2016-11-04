# spring-examples

##Spring 官网网站

- Spring 官网：http://projects.spring.io/spring-framework/
- Spring 源码：https://github.com/spring-projects/spring-framework
- Spring Reference Guide 英文版：[《Spring 参考指南》](http://docs.spring.io/spring-framework/docs/current/spring-framework-reference/html/index.html)
- Spring Reference Guide 中文版：[《Spring 参考指南》](https://github.com/souvc/spring-framework-4-reference/blob/master/SUMMARY.md)

##本项目内容为Spring 教程程序样例。

作者博客：http://www.souvc.com

项目环境：


``` java

 <properties>
     <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	 <org.springframework.version>4.3.3.RELEASE</org.springframework.version>
 </properties>

```


引用例子：

```java 

<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>${org.springframework.version}</version>
    </dependency>
</dependencies>

```


如您觉得该项目对您有用，欢迎点击右上方的 **Star** 按钮，给予支持！！

如有问题，可直接提交issues：【 [地址](https://github.com/souvc/spring-examples/issues) 】


##样例列表

* I. Spring 快速入门

    * [Chapter1-1-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter1-1-1)：通过spring输出一个helloworld （XML 配置）
    * [Chapter1-1-2](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter1-1-2)：通过spring输出一个helloworld （注解配置）
   
* II. Spring 4.x 的新特性


* III. Spring 核心技术

   * 5.1. Spring IoC 容器以及beans的介绍
   
		* 测试Spring环境，多种读取spring配置文件的方法：（[Chapter5-5-0](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-5-0)）
   
   * 5.2. 容器的介绍 ：（[Chapter5-5-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-5-1)）
   
        * 5.2.1. Spring容器的配置		
        * 5.2.2. Spring容器的实例化（可以通过多个xml文件实例化） 
        * 5.2.3. Spring容器的使用
		
   * 5.3. Bean 的介绍  
   
        * 5.3.1. Bean的命名（可以在bean外面定义，也可以为bean起一个别名：（[Chapter5-5-2](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-5-2)）     
			
        * 5.3.2. 实例化bean的三种方式 ：（[Chapter5-5-3](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-5-3)）
		
            * 用构造器来实例化的方式的配置。
            * 使用静态工厂方法实例化的方式。
            * 使用实例工厂方法实例化的方式。
			
   * 5.4. Dependencies
   
        * 5.4.1. Dependency injection  （[Chapter5-5-4](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter5-5-4)）
		
            * Constructor-based dependency injection
            * Setter-based dependency injection
            * Dependency resolution process
            * Examples of dependency injection
			
        * 5.4.2. Dependencies and configuration in detail
            * Straight values (primitives, Strings, and so on)
            * References to other beans (collaborators)
            * Inner beans
            * Collections
            * Null and empty string values
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
   * 5.5. Bean scopes
        * 5.5.1. The singleton scope
        * 5.5.2. The prototype scope
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
            * Initialization callbacks
            * Destruction callbacks
            * Default initialization and destroy methods
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
   * 5.9. Annotation-based container configuration
        * 5.9.1. @Required
        * 5.9.2. @Autowired
        * 5.9.3. Fine-tuning annotation-based autowiring with qualifiers
        * 5.9.4. Using generics as autowiring qualifiers
        * 5.9.5. CustomAutowireConfigurer
        * 5.9.6. @Resource
        * 5.9.7. @PostConstruct and @PreDestroy
   * 5.10. Classpath scanning and managed components
        * 5.10.1. @Component and further stereotype annotations
        * 5.10.2. Meta-annotations
        * 5.10.3. Automatically detecting classes and registering bean definitions
        * 5.10.4. Using filters to customize scanning
        * 5.10.5. Defining bean metadata within components
        * 5.10.6. Naming autodetected components
        * 5.10.7. Providing a scope for autodetected components
        * 5.10.8. Providing qualifier metadata with annotations
   * 5.11. Using JSR 330 Standard Annotations
        * 5.11.1. Dependency Injection with @Inject and @Named
        * 5.11.2. @Named: a standard equivalent to the @Component annotation
        * 5.11.3. Limitations of the standard approach
   * 5.12. Java-based container configuration
        * 5.12.1. Basic concepts: @Bean and @Configuration
        * 5.12.2. Instantiating the Spring container using AnnotationConfigApplicationContext
            * Simple construction
            * Building the container programmatically using register(Class<?>…)
            * Enabling component scanning with scan(String…)
            * Support for web applications with AnnotationConfigWebApplicationContext
        * 5.12.3. Using the @Bean annotation
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
	

* IV. Testing


* V. Data Access


* VI. The Web


* VII. Integration

    * Spring Scheduling Support
	
	    * [Chapter34-1-1](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter34-1-1): Spring2.5 + JDK Timer scheduler example
		
		* [Chapter34-1-2](https://github.com/souvc/spring-examples/tree/master/spring-examples/Chapter34-1-2): Spring3 + Quartz 1.8.6 scheduler example
	

* VIII. Appendices


