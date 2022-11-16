/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_AlFajriHuda_161122;

/**
 *
 * @author win 10
 */
public class gajiexample {
    public static void main(String[] args){
        gaji pegawai1=new gaji();
        //isi object
        
        pegawai1.setkodeslip("01");
        pegawai1.settanggal("02 Nov 2001");
        pegawai1.setnamapegawai("aji");
        pegawai1.setgolongan(1);
        pegawai1.settunjangananak(1000000);
        pegawai1.settunjanganistri(2000000);
        
        System.out.println("Kode Slip : "+pegawai1.getkodeslip());
        System.out.println("Tanggal : "+pegawai1.gettanggal());
        System.out.println("Nama : "+pegawai1.getnamapegawai());
        System.out.println("Golongan : "+pegawai1.getgolongan());
        System.out.println("Gaji Pokok : "+pegawai1.getgaji());
        System.out.println("Tunjangan Anak : "+pegawai1.gettunjangananak());
        System.out.println("Tunjangan Istri : "+pegawai1.gettunjanganistri());
        System.out.println("Total Gaji : "+pegawai1.gettotal());
        
        gaji  pegawai2=new gaji();
        //isi object
        
        pegawai2.setkodeslip("02");
        pegawai2.settanggal("01 Nov 2001");
        pegawai2.setnamapegawai("fajri");
        pegawai2.setgolongan(2);
        pegawai2.settunjangananak(2000000);
        pegawai2.settunjanganistri(3000000);
        
        System.out.print("\n");
        System.out.println("Kode Slip : "+pegawai2.getkodeslip());
        System.out.println("Tanggal : "+pegawai2.gettanggal());
        System.out.println("Nama : "+pegawai2.getnamapegawai());
        System.out.println("Golongan : "+pegawai2.getgolongan());
        System.out.println("Gaji Pokok : "+pegawai2.getgaji());
        System.out.println("Tunjangan Anak : "+pegawai2.gettunjangananak());
        System.out.println("Tunjangan Istri : "+pegawai2.gettunjanganistri());
        System.out.println("Total Gaji : "+pegawai2.gettotal());
        
    }
}
