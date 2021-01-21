/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Admin
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="";
        Integer n=1994;
        
        while(n>0){
            if (n>=1000) {
                n-=1000;
                s+="M";
            }else if(n>=900){
                n-=900;
                s+="CM";
            }else if(n>=500){
                n-=500;
                s+="D";
            }else if(n>=400){
                n-=400;
                s+="CD";
            }else if(n>=100){
                n-=100;
                s+="C";
            }else if(n>=90){
                n-=90;
                s+="XC";
            }else if(n>=50){
                n-=50;
                s+="L";
            }else if(n>=40){
                n-=40;
                s+="XL";
            }else if(n>=10){
                n-=10;
                s+="X";
            }else if (n>=9) {
                n-=9;
                s+="IX";
            }else if(n>=5){
                n-=5;
                s+="V";
            }else if(n>=4){
                n-=4;
                s+="IV";
            }else{
                n-=1;
                s+="I";
            }
        }
        System.out.println(s);
    }
    
}
