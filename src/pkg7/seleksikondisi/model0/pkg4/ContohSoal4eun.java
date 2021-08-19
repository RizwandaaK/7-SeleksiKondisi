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
public class ContohSoal4eun {
    public static void main(String[] args) {
        int IDPelanggan [] = {1,2,3,4,5};
        String nama [] = {"Ali","Budi","Dani","Edi","Umar"};
        int harga [] [] = {{915, 1025, 1225}, {915, 1025, 1225}, {575, 695, 895}, {575, 695, 895}, {595, 715, 915}, {595, 715, 915},{495, 575, 755}, {495, 575, 755}, {495, 575, 755}, {25, 25, 35}};
        String cottageS [ ] = {"Duku","Jeruk","Alpukat","Jambu air","Durian","Melon","Belimbing","Mangga","Kedondong","Barrack"};
        System.out.println("Tipe Cottage: ");
        for (int i =0; i<cottageS.length;i++){
            System.out.println(i+1+". "+cottageS[i]);
        }
        System.out.println("Golongan Hari: ");
        String hariS[ ] = {"Weekday","Weekend","Holiday"};
        for (int i =0; i<hariS.length;i++){
            System.out.println(i+1+". "+hariS[i]);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("------------KETERANGAN-------------");
        System.out.println("ID Pelanggan: ");
        Scanner inputID = new Scanner(System.in);
        String Id = inputID.nextLine();
        System.out.println("Tipe Cottage: ");
        int cottage = in.nextInt();
        System.out.println("Golongan Hari: ");
        int hari = in.nextInt();
        System.out.println("Lama Menginap: ");
        int lama = in.nextInt();
        if (lama<0){
            System.out.println();
        } else{
            int a= Integer.valueOf(Id); //id pelanggan
            System.out.println("===PRINT OUT===");
            System.out.println("Nama Pelanggan: "+ nama[a-1]);
            System.out.println("Total Biaya Rp" + harga[cottage-1][hari-1]*lama+".000");
        }
    }
}
