package testPjt02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		// TransportationWalk transportationWalk = new TransportationWalk();
		// transportationWalk.move();
		
		// 1. 스프링 컨테이너 접근
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		// 2. 필요한 객체(빈) 가져오기
		TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);
		transportationWalk.move();
		
		// 3. 사용한 후 반환
		ctx.close();
	}
	
}