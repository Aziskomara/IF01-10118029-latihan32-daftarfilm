/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan32.daftarfilm;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan daftar film
 * 
 */
public class film {
    String filmName;
    String filmGendre;
    double filmRanting;
    int filmDuration;
    
    public void nowPlaying(){
            System.out.println("Judul Film : " + filmName);
            System.out.println("Gendre Film : " + filmGendre);
            System.out.println("Ranting film : " + filmRanting);
            System.out.println("Durasi Film : " + filmDuration + "Menit\n");
    
    }
}
