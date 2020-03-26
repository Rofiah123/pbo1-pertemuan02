import koneksi.Database;
import model.DOSEN;
import model.Mahasiswa;
import model.MataKuliah;

public class Main{
 public static void main(String [] args){
  System.out.println("Ini program main");
  Database.hubungkan();
  DOSEN.tampilanInfo();
  Mahasiswa.tampilanInfo();
  MataKuliah.tampilanInfo();
 }
}