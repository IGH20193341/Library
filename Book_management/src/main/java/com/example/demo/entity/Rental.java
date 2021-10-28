package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="Rental")
public class Rental {

   @Id
   @GeneratedValue(strategy=GenerationType.AUTO, generator="native")
   @GenericGenerator(name="native", strategy="native")
   @Column(name="RNUM")
   private Long rNum;
   
   @OneToOne
   @JoinColumn(name="BNUM")
   private Book bNum;
   
   @ManyToOne
   @JoinColumn(name="ID")
   private Member id;
   
   @Column(name="RENTALDATE")
   private Date rentalDate;
   
   @Column(name="RETURNDATE")
   private Date returnDate;
   
   @Column(name="OVERDUE")
   private boolean overdue;
}