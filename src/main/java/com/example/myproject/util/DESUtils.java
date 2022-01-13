package com.example.myproject.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.SecureRandom;

/**
 * @Author: lixl
 * @Date: 2021/9/21 19:22
 * @Descrption
 */
public class DESUtils {

    private static Key key;
    //设置秘钥
    private static String KEY_STR="mykey";

    static{
        try
        {
            //生成des算法对象
            KeyGenerator generator = KeyGenerator.getInstance("DES");
            //采用SHA1安全策略
            SecureRandom secureRandom=SecureRandom.getInstance("SHA1PRNG");
            //设置密匙种子
            secureRandom.setSeed(KEY_STR.getBytes());
            generator.init(secureRandom);
            //生成密匙
            key = generator.generateKey();
            generator=null;
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    /**
     * 对字符串进行加密，返回BASE64的加密字符串
     * <功能详细描述>
     * @param str
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static String getjiami(String str){

        BASE64Encoder base64Encoder = new BASE64Encoder();
        System.out.println(key);
        try
        {
            byte[] strBytes = str.getBytes("UTF-8");
            //获取加密对象
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encryptStrBytes = cipher.doFinal(strBytes);
            return base64Encoder.encode(encryptStrBytes);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }

    }


    /**
     * 对BASE64加密字符串进行解密
     * <功能详细描述>
     * @param str
     * @return
     * @see [类、类#方法、类#成员]
     */
    public static String getjiemi(String str){
        BASE64Decoder base64Decoder = new BASE64Decoder();
        try
        {	//将密码转化base64
            byte[] strBytes = base64Decoder.decodeBuffer(str);
            //初始化加密对象
            Cipher cipher = Cipher.getInstance("DES");
            //初始化加密信息按照
            cipher.init(Cipher.DECRYPT_MODE, key);
            //解密的得到数组
            byte[] encryptStrBytes = cipher.doFinal(strBytes);
            return new String(encryptStrBytes,"UTF-8");
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }

    }


//    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/test_info?useUnicode=true&characterEncoding=utf-8";
//        String name = "root";
//        String password = "123456";
//        String encryurl = getjiami(url);
//        String encryname = getjiami(name);
//        String encrypassword = getjiami(password);
//
//        System.out.println(encryurl);
//        System.out.println(encryname);
//        System.out.println(encrypassword);
//
//
//        System.out.println(getjiemi(encryurl));
//        System.out.println(getjiemi(encryname));
//        System.out.println(getjiemi(encrypassword));
//    }


}
