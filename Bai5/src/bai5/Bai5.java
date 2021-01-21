/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu: ");
        int n=scan.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu "+i+" ");
            arr[i]=scan.nextInt();
        }
        System.out.println("So nguyen duong nho nhat con thieu trong mang: "+timSo(arr));
    }
    static int timSo(int arr[]){
        int so=1;
        int viTri=0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                viTri=i;
                break;
            }
        }
        do{
            if (Arrays.binarySearch(arr, so)<0) {
                return so;
            }else{
                so++;
            }
        }while(true);
    }
}
