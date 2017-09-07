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
public class Nilai {
    String Tugas,UTS,UAS,NA,NM,Ket;
    
    public Nilai(String Tugas, String UTS, String UAS, String NA, String NM, String Ket){
        this.Tugas  = Tugas;
        this.UTS    = UTS;
        this.UAS    = UAS;
        this.NA     = NA;
        this.NM     = NM;
        this.Ket    = Ket;
    }
    
    public String getTugas(){
        return Tugas;
    }
    
    public String getUTS(){
        return UTS;
    }
    
    public String getUAS(){
        return UAS;
    }
    
    public String getNA(){
        return NA;
    } 
    
    public String getNM(){
        return NM;
    }
    
    public String getKet(){
        return Ket;
    }
}
