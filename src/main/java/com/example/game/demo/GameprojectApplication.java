package com.example.game.demo;


import com.example.game.demo.enterprise.example.business.BusinessService;
import com.example.game.demo.enterprise.example.web.MyWebController;
import com.example.game.demo.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GameprojectApplication {

	public static void main(String[] args) {
//
//		MarioGame game = new MarioGame();
		ConfigurableApplicationContext context = SpringApplication.run(GameprojectApplication.class, args);
//		PacmanGame game = new PacmanGame();
//		GameRunner runner = context.getBean(GameRunner.class);
//		runner.run();
		MyWebController controller = context.getBean(MyWebController.class);
		BusinessService bt = context.getBean(BusinessService.class);

		System.out.println(bt.calculateSum());


	}

}
