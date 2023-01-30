package com.in28minutes.learnspringframework;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =//어플리케이션 컨텍스를 생성한 것이다 이것은 설명하면 복잡하지만 Spring 애플리케이션의 컨텍스트를 만들고 관리하는 데 일반적으로 사용된다
				SpringApplication.run(LearnSpringFrameworkApplication.class,args);

		//컴포넌트를 여러 개 생성 했고 그 컴포넌트를 관리할 것이 필요한대 어덯게 하면 좋을까?
		//우리는 어플리케이션 컨텍스트를 만들어서 하기로해보자
		//MarioGame,GameRunner,
		GameRunner runner= context.getBean(GameRunner.class);  //GameRunner 이라 적힌 메서드를  Bean 을 사용해서 모두 호출 -> 반환된 객체를 스프링 컨테이너에 등록

		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();

		//GameRunner runner = new GameRunner(game);
		runner.runGame();
	}
}
	/*객체의 생성과 와이어링을 신경쓸 필요가 없다
	스프링 프레임 워크가 대신 해줄 테니 나는 적합한 객체를 골라서 제 기업 로직을 실행하는 데 쓸수있다.*/
