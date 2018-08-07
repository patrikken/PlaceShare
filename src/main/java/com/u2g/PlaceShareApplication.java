package com.u2g;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.u2g.entities.Position;
import com.u2g.entities.User;
import com.u2g.service.PositionService;
import com.u2g.service.UserService;

@SpringBootApplication
public class PlaceShareApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PlaceShareApplication.class, args);
		/*UserService userService = ctx.getBean(UserService.class);
		PositionService positionService = ctx.getBean(PositionService.class); 
		User u = new User("KENFACK", "PATRIK", "+237695371494", "login", "azertyui", null);
		User u2 = new User("KEN", "PAT1", "+2376953714944", "ken", "azertyui123", null);
		User u3 = new User("KEN", "PAT2", "+2376953714945", "ken", "azertyui123", null);
		u2.addFriend(u);
		u2.addFriend(u3);
		userService.CreateUser(u);
		userService.CreateUser(u3);
		userService.CreateUser(u2); 
		
		//User u = userService.getUserByPhone("+237695371494+");
		if(u!=null){
			userService.CreateUser(u);
			Position p = new Position(1, 1, "U2G other place", "à uni2grow", u);
			positionService.createPosition(p);
		} */
	}
}
