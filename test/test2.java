
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
public class test2 {
    static String kategori(int gaji) {
        String kat = "";
        if(gaji < 2000000) {
            kat = "A";
        }
        else if(gaji >= 2000000 && gaji <= 10000000) {
            kat = "B";
        } 
        else if(gaji > 10000000) {
            kat = "C";
        }
        return kat;
     }
        static int bayar(String jalur, String gol, int jmlBln) {
        int dsp = 0;
        int spp = 0;
        int total = 0;
        if(jalur == "SBMPTN") {
            if(gol == "A") {
                dsp = 5000000;
                spp = 500000;
            }
            else if(gol == "B") {
                dsp = 15000000;
                spp = 1000000;
            }
            else if(gol == "C") {
                dsp = 30000000;
                spp = 2000000;
            }
        }
        else if(jalur == "SNMPTN") {
            if(gol == "A") {
                dsp = 7000000;
                spp = 500000;
            }
            else if(gol == "B") {
                dsp = 17000000;
                spp = 1000000;
            }
            else if(gol == "C") {
                dsp = 35000000;
                spp = 2000000;
            }
        }
        else if(jalur == "Mandiri") {
            if(gol == "A") {
                dsp = 10000000;
                spp = 1000000;
            }
            else if(gol == "B") {
                dsp = 25000000;
                spp = 2000000;
            }
            else if(gol == "C") {
                dsp = 50000000;
                spp = 3000000;
            }
        }
        total = dsp + (jmlBln * spp);
        return total;
    }
    
    public static void main(String[] args) {
        int IDM[] = {1, 2, 3, 4};
        String nama[] = {"Mira", "Nina", "Oemar", "Pena"};
        String jalur[] = {"SBMPTN", "SNMPTN", "Mandiri", "SBMPTN"};
        String alamat[] = {"Sawojajar", "Kedungkandang", "Ijen", "Dinoyo"};
        
        System.out.print("ID Mahasiswa         : ");
        Scanner inputID = new Scanner(System.in);
        String id = inputID.nextLine();
        int idIn = Integer.valueOf(id);
        System.out.print("Pendapatan Orang Tua : ");
        Scanner inputGaji = new Scanner(System.in);
        String gaji = inputGaji.nextLine();
        int gajiIn = Integer.valueOf(gaji); 
        System.out.print("Jumlah Bulan SPP     : ");
        Scanner inputJumlah = new Scanner(System.in);
        String jumlah = inputJumlah.nextLine();
        int jumlahIn = Integer.valueOf(jumlah);
        
        System.out.println("==================");
        System.out.println("ID Mahasiswa : " + IDM[idIn-1]);
        System.out.println("Nama Mahasiswa : " + nama[idIn-1]);
        System.out.println("Jalur Masuk : " + jalur[idIn-1]);
        System.out.println("Golongan Pendapatan : " + kategori(gajiIn));
        System.out.println("Biaya DSP : " + bayar(jalur[idIn-1], kategori(gajiIn), jumlahIn));
        System.out.println("Biaya SPP : " + bayar(jalur[idIn-1], kategori(gajiIn), jumlahIn));
        System.out.println("Alamat : " + alamat[idIn-1]);
    }
}
