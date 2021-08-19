/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.seleksikondisi.model0.pkg4;
import java.util.Scanner;
/**
 *
 * @author rizwa
 */
public class ContohSoal3 {
    public static void main(String[] args) {
        int Idarea[]={1,2,3};
        
        String asal[]={"waru","sidoarjo","porong"};
        int tarif[][]={
            {6000,9000,9000,},
            {9000,14000,14000,},
            {6000,9000,9000,},
            {5500,8500,8500},
            {5500,14000,14000},
            {9000,8500,8500}
        };
        int pintu[][]={
            {1,2},
            {1,3},
            {2,1},
            {2,3},
            {3,1},
            {3,2}
        };
        
        Scanner scan= new Scanner(System.in);
        System.out.println("1. Waru");
        System.out.println("2. Sidoarjo");
        System.out.println("3. Porong");
        System.out.print("ID Daerah (Masuk) : ");
        int masuk=scan.nextInt();
        System.out.print("Tujuan (Keluar)   : ");
        int keluar=scan.nextInt();
        System.out.println("");
        System.out.println("1. Sedan, Jip, Pickup");
        System.out.println("2. Truk dengan 2 sumbu roda");
        System.out.println("3. Truk dengan 3 sumbu roda");
        System.out.println("");
        System.out.print("Golongan Kendaraan : ");
        int gol=scan.nextInt();
        
        for (int i=0; i<pintu.length; i++){
            if((pintu[i][0]==masuk)&&(pintu[i][1]==keluar)){
                int g = gol - 1;
                int bayar = tarif[i][g];
                System.out.println("========================");
                System.out.println("Total = "+"Rp"+bayar+",00");
            }
        }
    }  
}
