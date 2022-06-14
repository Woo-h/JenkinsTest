package com.min.edu.vo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MemberVo implements UserDetails {

	private static final long serialVersionUID = -3126067123537929248L;
	private String emp_id;
	private String emp_password;
	private String emp_name;
	private String rank_no;
	private String dept_no;
	private String emp_address;
	private String emp_auth;
	private String emp_profile;
	private String emp_email;
	private String emp_delflag;
	private String emp_phone;
	private String emp_nfc;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		ArrayList<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
		auth.add(new SimpleGrantedAuthority(emp_auth));
		return auth;
	}
	
	@Override
	public String getPassword() {
		return emp_password;
	}
	
	@Override
	public String getUsername() {
		return emp_id;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	@Override
	public boolean isEnabled() {
		return true;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getRank_no() {
		return rank_no;
	}

	public void setRank_no(String rank_no) {
		this.rank_no = rank_no;
	}

	public String getDept_no() {
		return dept_no;
	}

	public void setDept_no(String dept_no) {
		this.dept_no = dept_no;
	}

	public String getEmp_address() {
		return emp_address;
	}

	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}

	public String getEmp_profile() {
		return emp_profile;
	}

	public void setEmp_profile(String emp_profile) {
		this.emp_profile = emp_profile;
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public String getEmp_delflag() {
		return emp_delflag;
	}

	public void setEmp_delflag(String emp_delflag) {
		this.emp_delflag = emp_delflag;
	}

	public String getEmp_phone() {
		return emp_phone;
	}

	public void setEmp_phone(String emp_phone) {
		this.emp_phone = emp_phone;
	}

	public String getEmp_nfc() {
		return emp_nfc;
	}

	public void setEmp_nfc(String emp_nfc) {
		this.emp_nfc = emp_nfc;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_password() {
		return emp_password;
	}

	public void setEmp_password(String emp_password) {
		this.emp_password = emp_password;
	}

	public String getEmp_auth() {
		return emp_auth;
	}

	public void setEmp_auth(String emp_auth) {
		this.emp_auth = emp_auth;
	}
}
