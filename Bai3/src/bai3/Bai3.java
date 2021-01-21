/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int so;
        int[] arr=new int[6];
        Random random=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt()/100000000;
        }
        System.out.println("Mang: "+Arrays.toString(arr));
        
        System.out.println("\nNhap so can tinh:");
        so=new Scanner(System.in).nextInt();
        
        int a=arr[0],b=arr[1],c=arr[2];
        int tong=a+b+c;
        int khoangCach=Math.abs(tong-so);
        
        
        for (int i = 3; i < arr.length; i++) {
            int tam1=Math.abs(a+b+arr[i]-so);
            int tam2=Math.abs(a+arr[i]+c-so);
            int tam3=Math.abs(arr[i]+b+c-so);
            int min=Math.min(tam1, Math.min(tam2,tam3));
            if (tam1<khoangCach&&min==tam1) {
                c=arr[i];
                khoangCach=tam1;
               
            }else if (tam2<khoangCach&&min==tam2){
                b=arr[i];
                khoangCach=tam2;
            }else if (tam3<khoangCach&&min==tam3){
                a=arr[i];
                khoangCach=tam3;
            }
        }
        System.out.println("Tong gan nhat voi "+so+" la: ("+a+"+"+b+"+"+c+"="+(a+b+c)+")");
    }
    
}
