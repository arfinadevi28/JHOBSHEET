
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARVINA
 */

public class LatihanSoal5 {
     public static void hasil(int a, int b, int c){
         if(a > b && a > c){
            System.out.println("Nilai terbesar adalah " + a);
         }else if (b > a && b > c){
            System.out.println("Nilai terbesar adalah " + b);
         }  else if ( c > a && c > b){
             System.out.println("Nilai terbesar adalah " + c);
         }
     }
      public static void main(String[] args){
          Scanner dev = new Scanner(System.in);
          System.out.println("Masukkann bilangan I : ");
          int x = dev.nextInt();
          System.out.println("Masukkan bilangan II : ");
          int y = dev.nextInt();
          System.out.println("Masukkan bilangan III : ");
          int z = dev.nextInt();
          hasil(x,y,z);
      }
}

