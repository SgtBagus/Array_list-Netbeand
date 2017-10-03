/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MVC;

import java.util.ArrayList;
import javax.swing .JOptionPane;
import MVC.Mahasiswa;

/**
 *
 * @author Toshiba
 */
public class Controller {
    ArrayList<Mahasiswa> listMahasiswa;
    ArrayList<Nilai> listNilai;
    
    
    public Controller(){
        listMahasiswa = new ArrayList();
        listNilai = new ArrayList();
    }
    
    public void SimpanMahasiswa(String NIM, String Nama, String Jurusan){
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Jurusan);
        boolean already_exists = false;
        for(Mahasiswa object : listMahasiswa){
            if(object.getNIM().equals(NIM)){
                already_exists = true;
                JOptionPane.showMessageDialog(null, "Data sudah tersedia", "Warning", JOptionPane.WARNING_MESSAGE);
                break;
            }
        }
        
        if(listMahasiswa.isEmpty()){
            listMahasiswa.add(mhs);
        }
        else if(!listMahasiswa.isEmpty() && !already_exists){
            listMahasiswa.add(mhs);
        }
    }
    
    public void SimpanNilai(String Tugas, String UTS, String UAS, String NA, String NM, String Ket){
        Nilai nl = new Nilai(Tugas, UTS, UAS, NA, NM, Ket);
        boolean already_exists = false;
        for (Nilai object : listNilai){
            if(object.getTugas().equals(Tugas)){
                already_exists = true;
                JOptionPane.showMessageDialog(null, "Data sudah tersedia", "Warning", JOptionPane.WARNING_MESSAGE);
                break;
            }
        }
        
        if(listNilai.isEmpty()){
            listNilai.add(nl);
        }
        else if (!listNilai.isEmpty() && !already_exists){
            listNilai.add(nl);
        }
    }
    
    public ArrayList<Mahasiswa> getALL(){
        return listMahasiswa;
    }   
    
    
    public void updateData(int index,String Tugas, String UTS, String UAS, String NA, String NM, String Ket)
    {
//           Barang brg = new Barang();
        Nilai nl = new Nilai(Tugas, UTS, UAS, NA, NM, Ket);
        listNilai.set(index, nl);
//        fireTableRowsUpdated(index, index);
        
    }
    
    public void updateDataMahasiswa(int index, String NIM, String Nama, String Jurusan){
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Jurusan);
        listMahasiswa.set(index, mhs);
//        fireTableRowsUpdated(index, index);
        
    }
    
    public void deleteData(int index){
        listMahasiswa.remove(index);
    }
    
    public ArrayList<Nilai> getALL2() {
        return listNilai;
    }
    
    public void deleteData2(int index){
        listNilai.remove(index);
    }

}
