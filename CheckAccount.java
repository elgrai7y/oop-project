
package com.mycompany.bankacount;

import java.util.Scanner;
import java.util.ArrayList;

public class CheckAccount extends SavingAccount {


public CheckAccount() {
}
 int c=0;   

private boolean ch=true;
private int ask=0;
Scanner in=new Scanner(System.in);

     ArrayList <Trans>trans=new ArrayList<Trans>();

    public void check_acc(){ 
        
        if(super.getId()==1221&&super.getName().equals("hassan")){
         super.setBalanc(1000);
         System.out.println("if you want do trans select 1");
         System.out.println("or select 0 if you want to show data only");
         
            ask=in.nextInt();
            in.nextLine();
            if(ask==1){
               ch=true;
            }
            else if(ask==0)
               System.exit(0);
        }
       

        do{
             System.out.println();
             System.out.println("     _________________________________________   ");        System.out.println();


            System.out.println("Enter \"D\" if you want depositer or Enter \"W\" if you want Wathdrew");
            Trans.setType_trans(in.nextLine());
            System.out.println("Enter The amount of trans");
            Trans.setAmount_trans(in.nextInt());
            System.out.println();
            System.out.println("     _________________________________________   ");        System.out.println();
            


          if(Trans.type_trans.charAt(0) =='D'){
            Trans.new_balance=balanc+Trans.amount_trans;
            balanc+=Trans.amount_trans;
            System.out.println("Succesful Deposite Transaction");
            System.out.println("New balance : "+Trans.new_balance);
            Trans.showDate();

            }
           
           else if(Trans.type_trans.charAt(0) =='W') {
                if(Trans.amount_trans<=super.balanc){
                  Trans.new_balance=super.balanc-Trans.amount_trans;
                  balanc-=Trans.amount_trans;
                  System.out.println("Succesful wihtdraw Transaction");
                  System.out.println("New balance : "+Trans.new_balance);
                  Trans.showDate();
                }
                else{
                   System.out.println("failed Transaction your balance less than  :  "+Trans.amount_trans);
                }   
            } Trans k=new Trans(Trans.getType_trans(),Trans.getAmount_trans());
             trans.add(c,k);
             c++;

            System.out.println();
            System.out.println("     _________________________________________  ");        System.out.println();




            System.out.println("if you want do another trans select 1");
            System.out.println("or select 0 if you want to finish");
            ask=in.nextInt();
            in.nextLine();
            if(ask==1){
               ch=true;
            }
            else if(ask==0)
                ch=false;
      
        }while(ch==true);
    } public void print(){
        System.out.println();
        System.out.println("    ________________________________________________   ");            System.out.println();


        System.out.println("Final balance : "+balanc);
            System.out.println("Number of Transaction : "+trans.size() );  
            System.out.println();
           System.out.println("    **________________________________________________**   ");            System.out.println();

}
}
