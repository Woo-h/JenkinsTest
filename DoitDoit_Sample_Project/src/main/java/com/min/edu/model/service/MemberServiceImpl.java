package com.min.edu.model.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.edu.model.mapper.IMemberMapper;
import com.min.edu.vo.MemberVo;

@Service
public class MemberServiceImpl implements IMemberService{

	@Autowired
	private IMemberMapper mapper;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public MemberVo login(String id) {
		logger.info("MemberServiceImpl login 전달 받은 ID : " + id);
		return mapper.login(id);
	}
	
	@Override
	public List<MemberVo> selEmpAll() {
		logger.info("MemberServiceImpl selEmpAll 회원전체조회");
		return mapper.selEmpAll();
	}
	
	@Override
	public int insEmp(Map<String, Object> map) {
		logger.info("MemberServiceImpl insEmp 회원 가입 전달 받은 값 : " + map);
		return mapper.insEmp(map);
	}
}
