package com.dgn.querytypeparttwo;

import com.dgn.querytypeparttwo.model.User;
import com.dgn.querytypeparttwo.model.UserDetail;
import com.dgn.querytypeparttwo.repository.UserDetailRepository;
import com.dgn.querytypeparttwo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class QuerytypeparttwoApplication implements CommandLineRunner {
	private final UserRepository userRepository;
	private final UserDetailRepository userDetailRepository;

	public QuerytypeparttwoApplication(UserRepository userRepository, UserDetailRepository userDetailRepository) {
		this.userRepository = userRepository;
		this.userDetailRepository = userDetailRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(QuerytypeparttwoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1= new User("doğan1","güneş1");
		User user2= new User("doğan2","güneş2");
		User saveUser1 = userRepository.save(user1);
		User saveUser2 = userRepository.save(user2);

		UserDetail userDetail1=new UserDetail("dogan1@gmail.com","12345");
		UserDetail userDetail2=new UserDetail("dogan2@gmail.com","54321");
		userDetail1.setUser(saveUser1);
		userDetail2.setUser(saveUser2);

		userDetailRepository.saveAll(Arrays.asList(userDetail1,userDetail2));


	}
}
