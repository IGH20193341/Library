
package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="RANKING")
public class Ranking implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
   @GenericGenerator(name = "native", strategy = "native")
   @ManyToOne   
   @JoinColumn(name = "BNUM")
   private Book book;
   
   @ManyToOne
   @JoinColumn(name = "RNUM")
   private Rental rental;

   @Column(name="NUMOFRENTAL")
   private Long numOfRental;
}
