/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.project.dencrypt;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eric_Bingbing
 */
public class VidioEncryptDecrypt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the file full path, use the Enter to finish the input :");
        String filename = in.nextLine();
        
        DEncrypt dencrypt = new DEncrypt();
        try {
            dencrypt.dencrypt(filename);
            System.out.println("File encripted or decripted success");
        } catch (IOException ex) {
            Logger.getLogger(VidioEncryptDecrypt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
