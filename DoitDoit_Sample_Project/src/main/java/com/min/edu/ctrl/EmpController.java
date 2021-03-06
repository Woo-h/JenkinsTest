package com.min.edu.ctrl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.edu.model.service.IMemberService;
import com.min.edu.vo.MemberVo;

@Controller
public class EmpController {
	
	@Autowired
	private IMemberService service;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/selAllEmp.do", method = RequestMethod.GET)
	public String selEmpAll(Model model) {
		
		logger.info("EmpController selEmpAll 회원 전체 조회");
		List<MemberVo> lists = service.selEmpAll();
		logger.info("lists : " + lists);
		model.addAttribute("lists", lists);
		return "selEmpAll";
	}
	
	@RequestMapping(value = "/insEmpPage.do", method = RequestMethod.GET)
	public String insEmpPage() {
		logger.info("EmpController insEmpPage");
		return "insEmpPage";
	}
	
	@RequestMapping(value = "/insEmp.do", method = RequestMethod.POST)
	public String insEmp(MemberVo vo) {
		logger.info("EmpController insEmp 전달 받은 값 : " + vo);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("emp_name", vo.getEmp_name());
		map.put("emp_email", vo.getEmp_email());
		map.put("dept_no", vo.getDept_no());
		map.put("rank_no", vo.getRank_no());
		map.put("emp_address", vo.getEmp_address());
		map.put("emp_nfc", vo.getEmp_nfc());
		map.put("emp_password", vo.getEmp_password());
		logger.info("map 에 담기긴 하냐" + map);
		service.insEmp(map);
		return "redirect:/selAllEmp.do";
	}
}
