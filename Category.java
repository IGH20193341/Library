package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="Category")
public class Category {

   @Id
   @GeneratedValue(strategy=GenerationType.AUTO, generator="native")
   @GenericGenerator(name="native", strategy="native")
   @Column(name="CNUM")
   private int cNum;
   
   @Column(name="GENRE")
   private String genre;
}
