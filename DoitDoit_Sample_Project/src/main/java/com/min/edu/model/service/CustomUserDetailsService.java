package com.min.edu.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.min.edu.model.mapper.MemberAuthMapper;
import com.min.edu.vo.MemberVo;

public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private MemberAuthMapper mMapper;
	
   @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MemberVo user = mMapper.login(username);
        if(user==null) {
            throw new UsernameNotFoundException(username);
        }
        return user;
    }
}