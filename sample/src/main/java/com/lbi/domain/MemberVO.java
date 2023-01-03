package com.lbi.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class MemberVO {
	
	private String userId, userPass, userName, userPhon, userAddr1, userAddr2, userAddr3;
	private Date regDate;
	private int verify;


}
