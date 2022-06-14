package com.min.edu.model.mapper;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.edu.vo.MemberVo;

@Repository
public class MemberAuthMapper {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	private final String NS = "com.min.edu.model.mapper.MemberMapperImpl.";
	 
    public MemberVo login(String username) {
        return sqlSession.selectOne(NS + "login", username);
    }
}
