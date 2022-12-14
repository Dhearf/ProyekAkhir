

package com.mycompany.tugasakhir;

import java.util.Scanner;

public class TugasAkhir{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  
         String[][] kosan = new String[2][3];
         int [][]nomor = new int[2][3];
            
        
        for(int baris = 0; baris < kosan.length; baris++){
            for(int kolom = 0; kolom < kosan[baris].length; kolom++){
                System.out.print("Masukkan Nomor Kamar : ");
                nomor[baris][kolom] = input.nextInt();
                
                System.out.format("",baris, kolom);
                System.out.print("masukkan nama penghuni kamar : ");
                input.nextLine();
                kosan[baris][kolom] = input.nextLine();
            }
        }
         System.out.println("===========================");
         System.out.println("Data kamar kosan");
         for (int i = 0; i < kosan.length; i++) {
            String [] is = kosan[i];
            
        }
          
          for (int i = 0; i <nomor.length ; i++) {
              for (int j = 0; j < nomor[0].length; j++) {
                  System.out.println("kamar "+ nomor[i][j]+" : "+ kosan[i][j]); 
              }
        }
     
       
       
            }
            
        }
        


            
      
