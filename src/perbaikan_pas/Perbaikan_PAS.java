/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perbaikan_pas;
import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Perbaikan_PAS {
//Method Ucapan salam
         static void ucapSalam(){
        System.out.println("Terima kasih Telah Menggunkan Program ini");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String nama, kelas ;

        final double n_tugas , n_uts , n_uas , n_akhir;

      
        Scanner input = new Scanner (System.in);

        
        
  System.out.println("===== Menghitung Nilai Rapot=====\n");
    System.out.println("List Kelas\n");
    ///Pengulangan
   int i;
  for (i=10; i<=12; i++)
  {
  System.out.println("Kelas " + i);
  }
  System.out.print("Masukan Kelas : ");
  kelas = input.nextLine();
  ////switch case
  switch(kelas){
            case "10":
                System.out.println("Kelas 10");
                break;
            case "11":
                System.out.println("Kelas 11");
                break;
            case "12":
                System.out.println("Kelas 12");
                break;
            default:
                System.out.println("Kode Kelas Salah!");
        }
  
        System.out.print("Masukan nama : ");

        nama = input.nextLine();
        
        
        
        System.out.print("Nilai tugas : ");

        n_tugas = input.nextInt();

        System.out.print("Nilai uts : ");

        n_uts = input.nextInt();

        System.out.print("Nilai uas : ");

        n_uas = input.nextInt();

        n_akhir = (0.20 * n_tugas  + 0.30 * n_uts + 0.50 * n_uas);

        System.out.println("Nilai Akhir "+nama+ " Adalah " +n_akhir);
///// if dan else
        if ( n_akhir >= 75 ) {
            System.out.println("Selamat, "+nama+" Lulus!");
            
             
          
        }else{

        System.out.println(nama+ " Tidak Lulus");
        }
        
         ucapSalam();
        
  }
       
}

    

