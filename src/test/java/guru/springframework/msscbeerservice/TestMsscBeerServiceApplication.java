package guru.springframework.msscbeerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestMsscBeerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(MsscBeerServiceApplication::main).with(TestMsscBeerServiceApplication.class).run(args);
	}

}
