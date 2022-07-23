package com.proshanto.jwtexample.service;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.proshanto.jwtexample.entity.MyUserDetails;
import com.proshanto.jwtexample.repository.UserRepository;

/**
 * JWTUserDetailsService implements the Spring Security UserDetailsService interface. 
 * It overrides the loadUserByUsername for fetching user details from the database using the username. 
 * The Spring Security Authentication Manager calls this method for getting the user details 
 * from the database when authenticating the user details provided by the user.
 * */
@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<com.proshanto.jwtexample.entity.User> user=  userRepository.findByUserName(username);
		return user.map(MyUserDetails::new).get();
		/*if ("javainuse".equals(username)) {
			return new User("javainuse", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}*/
	}
}
