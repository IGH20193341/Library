package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="RESERVE")
@IdClass(ReserveId.class)
public class Reserve {
   
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO, generator="native")
   @GenericGenerator(name="native", strategy="native")
   @ManyToOne
   @JoinColumn(name="ID")
   private Member member;
   
   @Id
   @Column(name="BOOKNUM")
   private int bookNum;
   
   @Column(name="RESERVEDATE")
   private Date reserveDate;
   
   @Column(name="EXPIRATIONDATE")
   private Date expirationDate;
  
}
