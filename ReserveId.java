package com.example.demo.entity;

import java.io.Serializable;
import java.util.Objects;

public class ReserveId implements Serializable {
   private String member;
   private String bookNum;
   
   @Override
   public boolean equals(Object o) {
      if(this==o) return true;
      if(o==null || getClass() != o.getClass())
         return false;
      ReserveId reserveId = (ReserveId) o;
      return member.equals(reserveId.member) &&
            bookNum.equals(reserveId.bookNum);
   }
   
   @Override
   public int hashCode() {
      return Objects.hash(member, bookNum);
   }
}