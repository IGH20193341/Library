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

@Entity(name="Book")
public class Book {

   @Id
   @GeneratedValue(strategy=GenerationType.AUTO, generator="native")
   @GenericGenerator(name="native", strategy="native")
   @Column(name="BNUM")
   private Long bNum;
   
   @Column(name="AUTHOR")
   private String author;
   
   @Column(name="PUBLISHER")
   private String publisher;
   
   @Column(name="PBDATE")
   private Date pbDate;
   
   @Column(name="STOCK")
   private String stock;
   
   @Column(name="TITLE")
   private String title;
   
   @ManyToOne
   @JoinColumn(name="cNum")
   private Category category;
}