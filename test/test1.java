
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rizwa
 */
public class test1 {
    int hitung;
    static int hitung(int gol, int jumlah) {
        int hasil = 0;

        if (gol == 1) {
            hasil = jumlah*1000;
            if(hasil < 50000)
            hasil = 50000;
        }
        else if (gol == 2) {
            hasil = jumlah*1300;
            if (hasil < 50000) {
            hasil = 50000;
            }
        }
        else if (gol == 3) {
            hasil = jumlah*1500;
            if (hasil < 50000) {
            hasil = 50000;    
            }
        }
        else {
            System.out.println("Golongan yang tersedia hanya bshskl");
        }
        int hasilakhir = hasil+13000;
        return hasilakhir;
    }
    
    public static void main(String[] args) {
        int IDPel [] = {1, 2, 3, 4};
        String NamaPelanggan [] = {"Galuh", "Indro", "Jedi", "Kanu"};
        int GolonganPelanggan [] = {1, 3, 2, 3};
        String AlamatPelanggan [] = {"Sawojajar", "Kedungkandang", "Ijen", "Dinoyo"};
        
        System.out.print("ID Pelanggan                      : ");
        Scanner inputID = new Scanner(System.in);
        String ID = inputID.nextLine();
        System.out.print("Jumlah Pemakaian Listrik (kWh)    : ");
        Scanner inputJumlah = new Scanner(System.in);
        String Jumlah = inputJumlah.nextLine();
        
        System.out.println("================================="+"\n"+
                           "             PRINTOUT             "+"\n"+
                           "=================================");
        
        int a = Integer.valueOf(ID); 
        int b = Integer.valueOf(Jumlah); 
        int tagihan = hitung(GolonganPelanggan[a-1], b);
        
        System.out.println("ID Pelanggan        : "+a);
        System.out.println("Nama Pelanggan      : "+NamaPelanggan[a-1]);
        System.out.println("Alamat Pelanggan    : "+AlamatPelanggan[a-1]);        
        System.out.println("Golongan Pelanggan  : "+GolonganPelanggan[a-1]);
        System.out.println("Jumlah kwh (/bulan) : "+b+" kWh");
        System.out.println("Tagihan             : "+"Rp"+tagihan+",00");
    }
}