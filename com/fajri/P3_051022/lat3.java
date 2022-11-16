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

import javax.swing.JOptionPane;
public class lat3 {
    public static void main(String[] args){
        String name,msg;
        
        name=JOptionPane.showInputDialog("Masukkan Nama");
        
        msg="Hello " +name+ "!";
        
        JOptionPane.showMessageDialog(null,msg);
    }
}
