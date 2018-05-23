package com.bramli.mongoexample;

import com.bramli.mongoexample.model.Adresse;
import com.bramli.mongoexample.model.AppUser;
import com.bramli.mongoexample.model.Role;
import com.bramli.mongoexample.service.AccountService;
import com.bramli.mongoexample.service.Send_mail;
import com.bramli.mongoexample.service.Send_mailImp;
import com.bramli.mongoexample.service.Send_sms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bramli.mongoexample.dao.RoleRepository;
import com.bramli.mongoexample.dao.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;

@SpringBootApplication
public class MongoexampleApplication implements CommandLineRunner {

	@Autowired
	private Send_mail send_mail;
	@Autowired
	private Send_sms send_sms;

	public static void main(String[] args) {
		SpringApplication.run(MongoexampleApplication.class, args);
	} 

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		//send_mail.sendSimpleMessage("liloest1996@gmail.com","aaaaaaaa","aaaaaaa");
		//send_sms.sensSMS();
	}
	@Bean
	public BCryptPasswordEncoder getpasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
