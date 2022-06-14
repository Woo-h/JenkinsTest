package com.min.edu.model.mapper;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.min.edu.vo.MemberVo;

@Repository
public class MemberMapperImpl implements IMemberMapper {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private BCryptPasswordEncoder password;
	
	private final String NS = "com.min.edu.model.mapper.MemberMapperImpl.";
	
	@Override
	public MemberVo login(String id) {
		return sqlSession.selectOne(NS+"login", id);
	}
	
	@Override
	public List<MemberVo> selEmpAll() {
		return sqlSession.selectList(NS+"selEmpAll");
	}
	
	@Override
	public int insEmp(Map<String, Object> map) {
		System.out.println("전달 받은 map : " + map);
		System.out.println("비밀번호 : " + map.get("emp_password"));
		
//		return sqlSession.insert(NS+"insEmp", map);
		return 0;
	}
}
