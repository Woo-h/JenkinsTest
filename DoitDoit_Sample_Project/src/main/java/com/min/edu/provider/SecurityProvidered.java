package com.min.edu.provider;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.min.edu.model.service.IMemberService;
import com.min.edu.vo.MemberVo;

public class SecurityProvidered implements UserDetailsService {
	
	@Autowired
	private IMemberService service;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("##### 시큐리티 작동 중이십니까");
		System.out.println(username);
		MemberVo mVo = service.login(username);
		
		System.out.println("mVo : " + mVo);
		
		List <SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();

//		roles.add(new SimpleGrantedAuthority(mVo.getEmp_auth()));
		
//		UserDetails user = new User(username, mVo.getEmp_password(), roles);
		
//		String t1 = user.getUsername();
//		String t2 = user.getPassword();
		
//		System.out.println(t1 + " :: " + t2);
		
		return null;
	}
}
