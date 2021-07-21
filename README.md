# spring-configuration-properties

Spring Boot may include externalized configuration and easily access properties defined in properties files. 

It is able of binding application properties to a POJO and then instantiate it in an ApplicationContext.

@ConfigurationProperties can be applied on a class(POJO) or method level(Bean method). 
@ConfigurationProperties can be applied on a class or method level. 

## Auto-scanned
Since Spring Boot 2.2, Spring finds and registers @ConfigurationProperties classes via a classpath scanning, but it needs @EnableConfigurationProperties within a @Configuration to enable this auto-process. 

Note that: we must register the binding POJO in the bean factory by @EnableConfigurationProperties({ClientHostInfo.class}), otherwise leading to an execption: "org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.ynz.demo.springconfigurationproperties.ClientHostInfo' available"

````
@SpringBootApplication
@EnableConfigurationProperties({ClientHostInfo.class})
public class SpringConfigurationPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigurationPropertiesApplication.class, args);
	}

}
````

## Method level

@ConfigurationProperties can be applied on a bean method level, in a context of @Configuration.

Note that: In this case, the POJO doesn't need a decorator; and it doesn't need an indicator within 
@EnableConfigurationProperties.  

````
    @Bean
    @ConfigurationProperties(prefix = "server.mail")
    public ServerInfo getServerInfo() {
        return new ServerInfo();
    }
````


