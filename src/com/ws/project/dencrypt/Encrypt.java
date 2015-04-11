/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws.project.dencrypt;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Eric_Bingbing
 */
public class Encrypt {
    private static byte key = (byte)0x12;

    static byte getKey() {
        return key;
    }

    public static void setKey(byte key) {
        Encrypt.key = key;
    }
    
    public void dencrypt(String filename) throws IOException {
        byte[] encryptBase;
        try (BufferedInputStream ins = new BufferedInputStream(new FileInputStream(filename))) {
            byte[] base = new byte[ins.available() < 10 ? ins.available() : 10]; // to be encrypted bytes
            ins.read(base);
            encryptBase = new byte[base.length];
            for (int i = 0; i < base.length ; i++) {
                encryptBase[i] = (byte)(base[i]^key);
            }
            ins.close();
        }
        
        RandomAccessFile f = new RandomAccessFile(filename, "rw");
        f.seek(0);
        f.write(encryptBase);
        f.close();
    }
    
}
