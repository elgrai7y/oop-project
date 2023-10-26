/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankacount;

import java.util.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  

import java.util.ArrayList;
import java.util.Scanner;

public class Trans {
protected static String date;
protected static String type_trans;
protected static int amount_trans;
protected static int new_balance;
    public Trans() {
    }
    
    public Trans( String type_trans, int new_balance) {
        this.type_trans = type_trans;
        this.new_balance = new_balance;
    }

    public static void setDate(String date) {
        Trans.date=date;
    }

    public static void showDate() {
        
    
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
    System.out.println("The date of Transaction : "+formatter.format(date));  
    }
    public static String getType_trans() {
        return type_trans;
    }

    public static void setType_trans(String type_trans) {
        Trans.type_trans = type_trans;
    }

    public static int getAmount_trans() {
        return amount_trans;
    }

    public static void setAmount_trans(int amount_trans) {
        Trans.amount_trans = amount_trans;
    }

    public static int getNew_balance() {
        return new_balance;
    }

    public static void setNew_balance(int new_balance) {
        Trans.new_balance = new_balance;
    }

}
