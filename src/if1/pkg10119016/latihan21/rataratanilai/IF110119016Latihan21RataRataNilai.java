/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119016.latihan21.rataratanilai;
import java.util.Scanner;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan cara 
 * melakukan penghitungan rata rata nilai
 */
public class IF110119016Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner rrt = new Scanner(System.in);
        int i, n;
        float jum, x, rata;
        System.out.print ("Masukkan Banyaknya Mahasiswa : ");
        n = rrt.nextInt();
        jum=0;
        i=1;
        while (i<=n){
                System.out.print ("Nilai Mahasiswa ke-"+i+": ");
                x = rrt.nextFloat ();
                jum += x;
                i++;
        }
        rata = jum / n;
        System.out.println ("Maka, Rata-rata nilainya adalah: "+rata);
        
    }
    
}
