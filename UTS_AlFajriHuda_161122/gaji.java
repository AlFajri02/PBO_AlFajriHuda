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
public class gaji {
    private String kodeslip;
    private String tanggal;
    private String namapegawai;
    private int golongan;
    private double gajipokok;
    private double tunjangananak;
    private double tunjanganistri;
  
    public gaji(){
        
    }
    
    public String getkodeslip(){
        return kodeslip;
    }
    
    public void setkodeslip(String kodeslip){
        this.kodeslip=kodeslip;
    }
    
    public String gettanggal(){
        return tanggal;
    }
    
    public void settanggal(String tanggal){
        this.tanggal=tanggal;
    }
    
    public String getnamapegawai(){
        return namapegawai;
    }
    
    public void setnamapegawai(String namapegawai){
        this.namapegawai=namapegawai;
    }
    
    public int getgolongan(){
        return golongan;
    }
    
    public void setgolongan(int golongan){
        this.golongan=golongan;
    }
    
    public double getgaji(){
        
        if(golongan==1){
            gajipokok=1000000;
        }
        else if(golongan==2){
            gajipokok=2000000;
        }
        else{
            System.out.println("-Golongan tidak terdaftar-");
        }
        
        return gajipokok;
    }
    
    public double gettunjangananak(){
        return tunjangananak;
    }
    
    public void settunjangananak(double tunjangananak ){
        tunjangananak=tunjangananak;
    }
    
    public double gettunjanganistri(){
        return tunjanganistri;
    }
    
    public void settunjanganistri(double tunjanganistri ){
        tunjanganistri=tunjanganistri;
    }
    
    
    public double gettotal(){
        double total;
        
        total=gajipokok+tunjangananak+tunjanganistri;
        
        return total;
    }
}
