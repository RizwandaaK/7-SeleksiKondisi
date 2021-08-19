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
public class ContohSoal4aku {
    public static void main(String[] args) {
        int harga [] [] = {{915, 1025, 1225}, {915, 1025, 1225}, {575, 695, 895}, {575, 695, 895}, {595, 715, 915}, {595, 715, 915},{495, 575, 755}, {495, 575, 755}, {495, 575, 755}, {25, 25, 35}};
        String cottageS [ ] = {"Duku","Jeruk","Alpukat","Jambu air","Durian","Melon","Belimbing","Mangga","Kedondong","Barrack"};
        System.out.println("Pilihan Kamar: ");
        for (int i =0; i<cottageS.length;i++){
            System.out.println(i+1+". "+cottageS[i]);
        }
        System.out.println("");
        System.out.println("Golongan Hari: ");
        String hariS[ ] = {"Weekday","Weekend","Holiday"};
        for (int i =0; i<hariS.length;i++){
            System.out.println(i+1+". "+hariS[i]);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.print("ID Pelanggan: ");
        int ID = in.nextInt();
        System.out.print("Tipe Cottage: ");
        int cottage = in.nextInt();
        System.out.print("Golongan Hari: ");
        int hari = in.nextInt();
        System.out.print("Lama menginap (hari): ");
        int lama = in.nextInt();
        if (lama<0){
            System.out.println("Mending anda tidur di rumah hehe.");
        } else{
            System.out.println("");
            System.out.println("INFORMASI AKHIR: ");
            System.out.println("ID Pelanggan: "+ID);
            System.out.print("Nama Pelanggan: ");
                switch (ID) {
            case 1:
                System.out.println("Ali");
                break;
            case 2:
                System.out.println("Budi");
                break;
            case 3:
                System.out.println("Dani");
                break;
            case 4:
                System.out.println("Edi");
                break;
            case 5:
                System.out.println("Umar");
                break;
            default:
                System.out.println("Maaf, anda bukan pelanggan kami.");
        }
            System.out.print("Golongan Hari: ");
                switch (ID) {
            case 1:
                System.out.println("Weekday");
                break;
            case 2:
                System.out.println("Weekend");
                break;
            case 3:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Tidak termasuk.");
        }
            System.out.println("Jumlah Hari: "+lama+" Hari");
            System.out.print("Tipe Cottage: ");
                switch (cottage) {
            case 1:
                System.out.println("Duku");
                break;
            case 2:
                System.out.println("Jeruk");
                break;
            case 3:
                System.out.println("Alpukat");
                break;
            case 4:
                System.out.println("Jambu Air");
                break;
            case 5:
                System.out.println("Durian");
                break;
            case 6:
                System.out.println("Melon");
                break;
            case 7: 
                System.out.println("Belimbing");
                break;
            case 8:
                System.out.println("Mangga");
                break;
            case 9:
                System.out.println("Kedondong");
                break;
            case 10:
                System.out.println("Barrack");
                break;
            default:
                System.out.println("Maaf, anda bukan pelanggan kami.");
        }
            System.out.println("-------------------");
            System.out.println("Tagihan:");
            System.out.println("Total Rp" + harga[cottage-1][hari-1]*lama+".000");
        }
    }
}
