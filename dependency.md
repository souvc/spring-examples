##文件说明：

这个文件主要记录一些依赖，方便直接复制即可使用的依赖，不用手动编写。


##项目环境：

``` java

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <org.springframework.version>3.2.8.RELEASE</org.springframework.version>
    </properties>
	
```
	
	
##spring 引用依赖：	
	
```java 	
    <dependencies>

		 <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-aop</artifactId>
            <version>${org.springframework.version}</version>
        </dependency>		
	
		<dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-beans</artifactId>
            <version>${org.springframework.version}</version>
        </dependency>
		
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>${org.springframework.version}</version>
        </dependency>

		<dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-core</artifactId>
            <version>${org.springframework.version}</version>
        </dependency>	
		
		 <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-jdbc</artifactId>
            <version>${org.springframework.version}</version>
        </dependency>
		
		 <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-web</artifactId>
            <version>${org.springframework.version}</version>
        </dependency>		
		
		<dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>${org.springframework.version}</version>
        </dependency>	
		
		 <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-test</artifactId>
            <version>${org.springframework.version}</version>
        </dependency>	
		
		 <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-tx</artifactId>
            <version>${org.springframework.version}</version>
        </dependency>
		
		
		
		
    </dependencies>
	
```	
	
	
## 其他引用依赖


```java 	
    <dependencies>

		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.12</version>
			<scope>test</scope>
		</dependency>

		<!-- https://mvnrepository.com/artifact/javax.servlet/servlet-api -->
		<dependency>
		  <groupId>javax.servlet</groupId>
		  <artifactId>servlet-api</artifactId>
		  <version>2.5</version>
		</dependency>
		
		
		<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.6</version>
		</dependency>

		 <!-- https://mvnrepository.com/artifact/commons-dbcp/commons-dbcp -->
        <dependency>
            <groupId>commons-dbcp</groupId>
            <artifactId>commons-dbcp</artifactId>
            <version>1.4</version>
        </dependency>

    </dependencies>
	
```	


	
	
	
	
	
	
	