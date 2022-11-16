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

public class lat2 {
    public static void main(String[] args){
        BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
        
        int a,b,jum;
        
        a=0;
        b=0;
        try{
            System.out.print("Masukkan nilai 1 : ");
            a=Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan nilai 2 : ");
            b=Integer.parseInt(dataIn.readLine());
        }
        catch(IOException e){
            System.out.println("Error!");
        }
        
        jum=a+b;
        System.out.println(+a+ " + " +b+ " = " +jum);
    }
}
