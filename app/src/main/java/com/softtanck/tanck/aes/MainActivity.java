package com.softtanck.tanck.aes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.softtanck.tanck.aes.utils.AesUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testAES();
    }


    private void testAES() {
        byte[] Key = {(byte) 0x5C, (byte) 0x13, (byte) 0x0B, (byte) 0x59, (byte) 0xD2, (byte) 0x62, (byte) 0x42, (byte) 0x64, (byte) 0x9E, (byte) 0xD4, (byte) 0x88, (byte) 0x38, (byte) 0x2D, (byte) 0x5E, (byte) 0xAE, (byte) 0xCC};
        byte[] Msg = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        // byte[] Cipher = { -26, 106, -62, -14, 20, -30, -81, 19, 121, 34, -63,
        // 41, 28, 87, -16, 12};
        byte[] Cipher = new byte[16];
        byte[] DecryptResult = new byte[16];

        System.out.println("------------原文----------------");
        for (int i = 0; i < Msg.length; i++) {
            System.out.print(Msg[i] + ",");
        }

        AesUtils.Encrypt(Msg, Key, Cipher, Msg.length);

        System.out.println();
        System.out.println("------------密文----------------");
        for (int i = 0; i < Cipher.length; i++) {
            System.out.print(Cipher[i] + ",");
        }

        AesUtils.Decrypt(Cipher, Key, DecryptResult, Cipher.length);

        System.out.println();
        System.out.println("------------解密后----------------");
        for (int i = 0; i < DecryptResult.length; i++) {
            System.out.print(DecryptResult[i] + ",");
        }
        System.out.println();
        System.out.println("------------ END ----------------");
    }
}
