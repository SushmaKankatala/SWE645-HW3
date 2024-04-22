package sushmak.SWE645hw3;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "sushmak.SWE645hw3" })
@EntityScan(basePackages = "sushmak.SWE645hw3")
public class Swe645Hw3Application {

	public static void main(String[] args) {
		SpringApplication.run(Swe645Hw3Application.class, args);
//		new SpringApplicationBuilder(Swe645Hw3Application.class)
//        .web(WebApplicationType.SERVLET)
//        .run(args);
	}

}