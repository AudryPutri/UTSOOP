
package uts.oop;
/**
 *
 * @author ASUS Audry Paramitha Putri_2010429
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UtsOop {

  static ArrayList daftar = new ArrayList();
  static boolean isRunning = true;
  static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
  static BufferedReader input = new BufferedReader(inputStreamReader);
  static void showDaftarPengunjungKebunBinatang() throws IOException{
       System.out.println ("Enter untuk melanjutkan"); 
       System.out.println ("Daftar data pengunjung kebun binatang");
       System.out.println ("1. Tampilkan pengunjung");
       System.out.println ("2. Isi Data Pengunjung");
       System.out.println ("3. Keluar");
       System.out.println ("***********************************");
       System.out.println ("Pilihan menu :");
  int selectedDaftarPengunjungKebunBinatang = Integer.valueOf(input.readLine());
        
        switch(selectedDaftarPengunjungKebunBinatang){
            case 1:
                tampilkanPengunjung();
                break;
            case 2:
                isiDataPengunjung();
                break;
            case 3:
                System.out.println();
                System.out.println("Sampai jumpa lagi");
                System.out.println();
                System.exit(0);
                break;
            default:
                System.out.println();
                System.out.println("Pilihan Yang anda pilih tidak terdafatar,silahkan pilih 1, 2 atau 3");
                System.out.println();     
        }
        
        
    }

    static void tampilkanPengunjung (){
        if(daftar.isEmpty()){
           System.out.println();
           System.out.println("Belum ada data pengunjung\n"); 
           System.out.println();
           
        } else {
             System.out.println ("Daftar pengunjung kebun binatang");
             // tampilkan semua daftar
            for(int i = 0; i < daftar.size(); i++){
                System.out.println (i+1 + ". "+daftar.get(i));
            } {
                 System.out.println ("Total jumlah pengunjung = "+ daftar.size()+ " Pengunjung");
                 System.out.println (); 
            } 
        }
    }
    
    static void isiDataPengunjung() throws IOException{
        System.out.println();
        System.out.print("Nama pengunjung : ");
        String namaPengunjung = input.readLine();
        daftar.add(namaPengunjung);
        System.out.println();
    }
    public static void main(String[] args) throws IOException {
   do {
            showDaftarPengunjungKebunBinatang();
        } while (isRunning);
        
    }






























}