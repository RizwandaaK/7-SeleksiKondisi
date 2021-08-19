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
public class ContohSoal0 {

    /**
     * @param args the command line arguments
     */

    static int hitung(int nilai) {
        int bayar = 20000;
        nilai = nilai-10;

        if (nilai>10){
            bayar = bayar+30000;
            nilai = nilai-10;
        }
        else {
            bayar = bayar+3000*nilai;
            nilai = 0;
    }
 
        if (nilai > 10){
            bayar = bayar+40000;
            nilai = nilai-10;
    }  
        else {
            bayar=bayar+4000*nilai;
            nilai=0;
    }

        if (nilai > 10){
            bayar=bayar+3000*nilai;
    }

        return bayar;
    }

    public static void main(String[] args) {
        int id [] = {1, 2, 3, 4, 5};
        String namaPelanggan [] = {"Ali", "Budi", "Dani", "Edi", "Umar"};

        Scanner input = new Scanner(System.in);
        
        System.out.print("ID Pelanggan              : ");
        String idPel = input.nextLine();
        int iId=Integer.valueOf(idPel);

        System.out.print("Jumlah Pemakaian Air (m³) : ");
        String pemakaianair = input.nextLine();
        int iTagihan = Integer.valueOf(pemakaianair);

        if (iTagihan < 10) {iTagihan = 20000;}
        else {iTagihan = hitung(iTagihan);}

        iTagihan = iTagihan + 10000;

        System.out.println("=============================");
        System.out.println("ID                        : " + idPel);
        System.out.println("Nama                      : " + namaPelanggan[iId-1]);
        System.out.println("Tagihan                   : Rp" + iTagihan+",00");
    }
}
