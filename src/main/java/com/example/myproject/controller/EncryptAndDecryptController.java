package com.example.myproject.controller;

import com.example.myproject.util.AESEncryptAndDecryptUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: lixl
 * @Date: 2021/10/11 10:05
 * @Descrption
 */
@Api(tags = "EncryptAndDecryptController", description = "加解密")
@RequestMapping("/api/v1/jiajiemi")
@RestController
public class EncryptAndDecryptController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EncryptAndDecryptController.class);


    // KEY要与前端加密时保持一致(且:应为:16或24或32字节长度)
    private static final String KEY = "A-16-Byte-keyVal";


    @ApiOperation(value = "解密")
    @PostMapping(value = "/encrypTest")
    public String test(@RequestParam("encryptedTarget") String encryptedTarget) {
        StringBuffer sb = new StringBuffer();
        try {
            // 调用后端AES加密解密工具类(在上面的示例中以给出)
            String decryptTarget = AESEncryptAndDecryptUtil.decrypt(encryptedTarget,KEY);
            sb.append(">>>解密前:" + encryptedTarget);
            sb.append(">>>解密前的内容长度:" + encryptedTarget.length());
            sb.append(">>>加密密钥和解密密钥:" + KEY);
            sb.append(">>>解密后：" + decryptTarget);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    @ApiOperation(value = "加密")
    @PostMapping(value = "/decryptTest")
    public String jiami(@RequestParam("decryptedTarget") String decryptedTarget) {
        StringBuffer sb = new StringBuffer();
        try {
            // 调用后端AES加密解密工具类(在上面的示例中以给出)
            String encryptTarget = AESEncryptAndDecryptUtil.encrypt(decryptedTarget,KEY);
            sb.append(">>>加密前:" + decryptedTarget);
            sb.append(">>>加密前的内容长度:" + decryptedTarget.length());
            sb.append(">>>加密密钥和解密密钥:" + KEY);
            sb.append(">>>加密后：" + encryptTarget);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }


}
