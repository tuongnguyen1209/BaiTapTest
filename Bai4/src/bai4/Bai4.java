/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author Admin
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s="(()())()()()()))";
        
        
        
        int dodai=0;
        int doDaiTam=0;
        
        int viTri;
        String temp=s.substring(s.indexOf("()"));
        
        while(temp.indexOf("()")>=0){
            viTri=temp.indexOf("()");
            if (viTri==0) {
                doDaiTam++;
                temp=temp.substring(viTri+2);
            }else{
                if (dodai<doDaiTam) {
                    dodai=doDaiTam;
                    
                }
                temp=temp.substring(viTri);
                doDaiTam=0;
            }
            
        }
        
        if (doDaiTam>dodai) {
            dodai=doDaiTam;
        }
        
        System.out.println("Chuoi hop le dai nhat la: "+dodai*2);
    }
    
}
