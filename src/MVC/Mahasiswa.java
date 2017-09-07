/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MVC;

/**
 *
 * @author Toshiba
 */
public class Mahasiswa {
    String NIM, Nama, Jurusan;
    
        public Mahasiswa(String NIM, String Nama, String Jurusan){
            this.NIM = NIM;
            this.Nama = Nama;
            this.Jurusan= Jurusan;
        }
        
        public String getNIM(){
            return NIM;
        }
        
        public String getNama(){
            return Nama;
        }
        
        public String getJurusan(){
            return Jurusan;
        }
}
