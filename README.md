# spring-configuration-properties
Binding application properties to a Bean created in the ApplicationContext.

@ConfigurationProperties is applied on a class or method level. 

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
