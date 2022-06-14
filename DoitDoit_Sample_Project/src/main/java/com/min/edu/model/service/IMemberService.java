package com.min.edu.model.service;

import java.util.List;
import java.util.Map;

import com.min.edu.vo.MemberVo;

public interface IMemberService {

	public MemberVo login(String id);
	public List<MemberVo> selEmpAll();
	public int insEmp(Map<String, Object> map);
}
