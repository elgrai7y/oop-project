
package com.mycompany.bankacount;

import java.util.Scanner;



public class SavingAccount extends Acount {

    public SavingAccount() {
    }

    int max=0;
    boolean ch=true;
    public void enter_data(){

do{
    System.out.println();
    System.out.println("     **_________________________________________**   ");        System.out.println();

      Scanner in=new Scanner(System.in);
      System.out.println("Enter your name account : ");
      super.setName(in.nextLine());
      System.out.println("Enter your name ID : ");
      super.setId(in.nextInt());
      System.out.println();
      System.out.println("     _________________________________________   ");        System.out.println();


    if(super.getId()==1221&&super.getName().equals("hassan")){
       Acount hassan=new Acount("hassan",1000,1221,1.5,"\"1/1/2022\"");
        System.out.println("The Account name  : "+hassan.getName());
        System.out.println("Your balance  : "+hassan.getBalanc());
        System.out.println("Your insert_rate : "+hassan.getMannual_interest_rate()+"%");
        System.out.println("Account created at : "+hassan.getDate_created());
        System.out.println();
        System.out.println("     ____________________________________________   ");        System.out.println();


       ch=false;
    }
    
    else {
        System.out.println("Account no has found Try again please !!");
        max++;
        System.out.println();
        System.out.println("     _________________________________________   ");        System.out.println();

    }
    if(max==5){
      System.out.println("You cant try again you try maximum number");
      System.exit(0);
    }
    
}while(ch==true);

}
    
     

}
