package mirea.task;

import components.User;
import config.MyConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Sample13Application {

	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(MyConfig.class);
		User user = context.getBean(User.class);
		System.out.println(user.init());
	}

}
