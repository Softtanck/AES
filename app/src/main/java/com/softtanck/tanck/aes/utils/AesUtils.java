package com.softtanck.tanck.aes.utils;

public class AesUtils {

    static {
        System.loadLibrary("Aes");
    }

    public synchronized static native int Encrypt(byte[] msg, byte[] key, byte[] cipher, int length);

    public synchronized static native int Decrypt(byte[] cipher, byte[] key, byte[] result, int length);


}
