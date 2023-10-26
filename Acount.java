package com.mycompany.bankacount;

import java.util.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class Acount {
    protected String name;
    protected int account_number;
    protected int balanc;
    protected  double mannual_interest_rate;
    protected String date_created;
    protected int id;

    public Acount() {
    }
    
   
    public Acount(String name, int balanc,int id,double insert,String date_created) {
        this.name = name;
        this.balanc = balanc;
        this.id=id;
        this.mannual_interest_rate=insert;
        this.date_created= date_created;
    }
    
    public void setName(String name) {
      this.name = name;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public void setBalanc(int balanc) {
        this.balanc = balanc;
    }

    public void setMannual_interest_rate(double mannual_interest_rate) {
        this.mannual_interest_rate = mannual_interest_rate;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
      return name;
    }

    public int getBalanc() {
        return balanc;
    }

    public double getMannual_interest_rate() {
        return mannual_interest_rate;
    }

    public int getId() {
        return id;
    }

    public String getDate_created() {
        return date_created;
    }

    
   
}
