package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="MEMBER")
public class Member {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native", strategy="native")
	@Column(name="ID")
	private Long memberID;
	
	@Column(name="PW")
	private String memberPassward;
	
	@Column(name="MNAME")
	private String memberName;
	
	@Column(name="MPHONNUM")
	private Long phoneNum;
	
	@Column(name="MEMAIL")
	private String memberEmail;
	
	@Column(name="MRNUM")
	private Long memberResidentNum;
}
