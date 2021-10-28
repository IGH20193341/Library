package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "POST")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")

	@Column(name = "POSTNUM")
	private Long postNum;

	@Column(name = "POSTNAME")
	private String postName;

	@Column(name = "POSTCONTENT")
	private String postContent;

	@Column(name = "POSTCOUNT")
	private Long postCount;

	@Column(name = "POSTDATE")
	private String postData;

	@ManyToOne
	@JoinColumn(name = "pbNum")
	private PostBoard pbNum;

	@ManyToOne
	@JoinColumn(name = "memberId")
	private Member memberId;

}
