# spring-configuration-properties

Spring Boot may include externalized configuration and easy access to properties defined in properties files. 

It is able of binding application properties to a POJO and instantiate into a bean in an ApplicationContext.

@ConfigurationProperties is applied on a class(POJO) or method level(Bean method). 

## Auto-scaned
As of Spring Boot 2.2, Spring finds and registers @ConfigurationProperties classes via a classpath scanning, without a decorator @Component; it needs to use @EnableConfigurationProperties and combined with @Configuration to enable this auto-process. 

````
@SpringBootApplication
@EnableConfigurationProperties({ClientHostInfo.class})
public class SpringConfigurationPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigurationPropertiesApplication.class, args);
	}

}
````
