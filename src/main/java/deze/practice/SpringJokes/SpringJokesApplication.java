package deze.practice.SpringJokes;

import deze.practice.SpringJokes.controller.JokeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJokesApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringJokesApplication.class, args);


	}




}
