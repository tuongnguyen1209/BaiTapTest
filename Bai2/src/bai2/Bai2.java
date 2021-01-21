/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        ***thoi gian chay
//        mang 5000 phan tu lan 1:6s
//                          lan 2:6s
//                          lan 3:7s
//                          lan 4:6s
//                          lan 5:6s 

//        mang 10000 phan tu lan 1:24s
//                           lan 2:23s
//                           lan 3:22s
//                           lan 4:23s
//                           lan 5:22s

        
        Random random=new Random();
        int[] arr=new int[5000];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt()/100000000;
        }
//        int[] arr={0};
//        int[] arr={};
//        int[] arr={-1,0,1,2,-1,-4};
        System.out.println("So phan tu cua mang: "+arr.length);
        System.out.println("===Mang===");
        System.out.println(Arrays.toString(arr));
        ArrayList<MangSo> ketQua=new ArrayList<>();
        
        Arrays.sort(arr);
        int viTri=0;
        
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0) {
                viTri=i;
                break;
            }
        }
        
        if (viTri!=0&&viTri!=(arr.length-1)) {
            for (int i = 0; i < viTri; i++) {
                for (int j = viTri; j < arr.length; j++) {
                    int viTri2=Arrays.binarySearch(arr, -1*(arr[i]+arr[j]));
                    
                    if (viTri2>=0&&viTri2!=i&&viTri2!=j) {
                        
                        MangSo mS=new MangSo(arr[i],arr[j],arr[viTri2]);
                        boolean check=false;
                        for (MangSo mangSo : ketQua) {
                            if (mangSo.soSanh(mS)) {
                                check=true;
                            }
                        }
                        if (!check) {
                            ketQua.add(mS);
                        }
                    }
                }
            }
        }
        System.out.println("===ket qua===");
        System.out.println(ketQua);
    }
    public static class MangSo{
        int so1,so2,so3;
       
        public MangSo() {
        }
        
        public MangSo(int so1, int so2, int so3) {
           this.so1=so1;
           this.so2=so2;
           this.so3=so3;
        }
        
        public boolean soSanh(MangSo m){
            if (this.so1==m.so1||this.so1==m.so2||this.so1==m.so3) {
                if (this.so2==m.so2||this.so2==m.so2||this.so2==m.so3) {
                    if (this.so3==m.so1||this.so3==m.so2||this.so3==m.so3) {
                        return true;
                    }
                }
            }
            return false;
        }
        
        @Override
        public String toString() {
            return "{"  + so1 + ", " + so2 + ", " + so3 + '}';
        }
    }
}
