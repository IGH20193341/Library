package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="COMMENTS")
public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(name = "COMMENTSNUM")
	private Long commentsNum;
	
	@Column(name="TEXT")
	private String contentsText;
	
	@Column(name="COMMENTSDATE")
	private Date commentsDate;
	
	@ManyToOne
	@JoinColumn(name = "memberID")
	private Member memeberID;

	@ManyToOne
	@JoinColumn(name = "POSTNUM")
	private Post postNum;
}
