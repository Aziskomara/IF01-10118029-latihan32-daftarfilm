/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan32.daftarfilm;

/**
 *
 * @author acer
 * 
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan daftar film
 * 
 */
public class IF0110118029Latihan32Daftarfilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        film film = new film();
        
        
        System.out.println("---Daptar Film Sedang Tayang---\n");
        
        //Venom
        film.filmName = "Venom";
        film.filmGendre = "Action, Horror, Scifi";
        film.filmRanting = 8.5;
        film.filmDuration = 120 ;
        film.nowPlaying();
        
        //Smal foot
        film.filmName = "Smal foot";
        film.filmGendre = "Animation";
        film.filmRanting = 9.0;
        film.filmDuration = 96 ;
        film.nowPlaying();
        
        //Crazy Rich Asian
        film.filmName = "Crazy Rich Asian";
        film.filmGendre = "Comedy";
        film.filmRanting = 7.8;
        film.filmDuration = 119 ;
        film.nowPlaying();
        
        //Asih
        film.filmName = "Asih";
        film.filmGendre = "Horror";
        film.filmRanting = 6.0;
        film.filmDuration = 100 ;
        film.nowPlaying();
    }
    
}
