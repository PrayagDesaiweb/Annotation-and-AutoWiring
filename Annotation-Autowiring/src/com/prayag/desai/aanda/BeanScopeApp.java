package com.prayag.desai.aanda;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		// reading the sptring config file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				// get the bean from the spring container
				Coach theCoach = context.getBean("tennisCoach", Coach.class);
				Coach the1Coach = context.getBean("tennisCoach", Coach.class);
				// call a method of the bean
				System.out.print(theCoach.getDailyWorkout());
				System.out.print(theCoach.getDailyFortune());
				// cloase the bean
				boolean x = (theCoach == the1Coach);
				System.out.println(x);
				context.close();


	}

}
