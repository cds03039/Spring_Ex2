package com.lbi.persistence;

import com.lbi.domain.MemberVO;

public interface MemberDAO {

	
	//ȸ�� ����
	public void signup(MemberVO vo) throws Exception;
	
	//�α���
	public MemberVO signin(MemberVO vo) throws Exception;
}
