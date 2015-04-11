/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.ws.project.dencrypt.DEncrypt;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eric_Bingbing
 */
public class EncryptTest {
    public static void main(String[] args) {
        String filename = "F:\\VIDIO\\temp\\";
        DEncrypt en = new DEncrypt();
        try {
            en.dencrypt(filename);
        } catch (IOException ex) {
            Logger.getLogger(EncryptTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
