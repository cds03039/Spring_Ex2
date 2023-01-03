package com.lbi.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbi.domain.MemberVO;
import com.lbi.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService{

	
	@Autowired
	private MemberDAO dao;
	
	@Override
	public void signup(MemberVO vo) throws Exception {
		dao.signup(vo);
		
	}
	
	//�α���
	@Override
	public MemberVO signin(MemberVO vo) throws Exception {
		
		return dao.signin(vo);
	}
	
	//�α׾ƿ�
	
	@Override
	public void signout(HttpSession session) throws Exception {
		session.invalidate();
		
	}
}
