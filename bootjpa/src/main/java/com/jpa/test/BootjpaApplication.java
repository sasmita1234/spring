package com.jpa.test;
import com.jpa.test.entities.User;

import com.jpa.test.entity.UserRepository;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootjpaApplication {

	public static void main(String[] args) {
	ApplicationContext	context=SpringApplication.run(BootjpaApplication.class, args);
	UserRepository userRepository=context.getBean(UserRepository.class);
	
//	User user = new User();
//	user.setName("Durgesh");
//	user.setCity("Delhi");
//	user.setStatus("I am java developer");
//	
//	User user1=userRepository.save(user);
//	System.out.println(user1);
//	User userr = new User();
//	userr.setName("Ravi");
//	userr.setCity("Puri");
//	userr.setStatus("I am python developer");
//	
//	User user2=userRepository.save(userr);
//	System.out.println(user2);
	
	//Create object of User
//	User user = new User();
//	user.setName("Uttam");
//	user.setCity("Bhubaneswar");
//	user.setStatus("Python Programmer");
//	
//	User user1 = new User();
//	user1.setName("Bikas");
//	user1.setCity("Bhubaneswar");
//	user1.setStatus("Django Programmer");
////	saving single user
////	User result=userRepository.save(user1);
////	System.out.println("saved user" +result);
//	
//	List<User> users = List.of(user,user1);
//	//save multiple objects
//	Iterable<User> result = userRepository.saveAll(users);
//	result.forEach(userr ->{
//		System.out.println(user);
//	});
	
	
	//update the user of id 5
//	Optional<User> optional = userRepository.findById(5);
//	
//	User user=optional.get();
//	user.setName("Ankit Tiwari");
//User	result=userRepository.save(user);
//	System.out.println(result);
	
	//how to get the data
	//findById(id) -return Optional containing of data
	
	//Iterable<User> itr=userRepository.findAll();
//	       Iterator<User> iterator= itr.iterator();
//	       
//	       while(iterator.hasNext())
//	       {
//	    	   User user3 = iterator.next();
//	    	   System.out.println(user3);
//	       }
	       
	//itr.forEach(user3 ->{System.out.println(user);});
	
	//Deleting element
	//userRepository.deleteById(5);
	//System.out.println("deleted");
	Iterable<User> allusers = userRepository.findAll();
	allusers.forEach(user4->System.out.println(user4));
	userRepository.deleteAll(allusers);
	
	
	
			
	
	
	}

}
