
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fajri.P3_051022;

/**
 *
 * @author win 10
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class lat1 {
    public static void main(String[] args){
        BufferedReader dataIn=new BufferedReader (new InputStreamReader(System.in));
        
        String name="";
        String alamat="";
        String jurusan="";
        
        try{
            System.out.print("Nama/t: ");
            name=dataIn.readLine();
            System.out.print("Alamat/t: ");
            alamat=dataIn.readLine();
            System.out.print("Jurusan/t: ");
            jurusan=dataIn.readLine();
        }
        catch (IOException e){
            System.out.println("Error!");
        }
        
        System.out.println("Hello, " +name+ " di " +alamat+ " Jurusan " +jurusan);
        }
    }
