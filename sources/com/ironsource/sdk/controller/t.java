package com.ironsource.sdk.controller;

import com.ironsource.sdk.utils.c;
import java.security.MessageDigest;
import kotlin.UByte;

final class t {
    String a;

    t(String str) {
        this.a = str;
    }

    private String a(String str) {
        try {
            return c.a(str);
        } catch (Exception e) {
            e.printStackTrace();
            return b(str);
        }
    }

    private String b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & UByte.MAX_VALUE);
                if (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(a(str + str2 + this.a));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
