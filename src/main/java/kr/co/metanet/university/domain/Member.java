package kr.co.metanet.university.domain;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Member {
	private int id;
	private String code;
	private String password;
	private String name;
	private String roleName;
	private Date createDate;
	private Date modifyDate;
}
