package com.example.myproject.email.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: lixl
 * @Date: 2021/11/27 22:08
 * @Descrption
 */
@Api(tags = "邮件")
@RestController
@RequestMapping("/mail")
public class EmailController {

//    @Autowired
//    private JavaMailSender jms;
//
//    @Value("${spring.mail.username}")
//    private String from;
//
//    @Autowired
//    private TemplateEngine templateEngine;
//
//
//    @ApiOperation(value = "发送邮件")
//    @RequestMapping(value = "sendSimpleEmail", method = RequestMethod.POST)
//    public String sendSimpleEmail() {
//        try {
//            SimpleMailMessage message = new SimpleMailMessage();
//            message.setFrom(from);
//            message.setTo("lixiaolin416@163.com"); // 接收地址
//            message.setSubject("一封简单的邮件"); // 标题
//            message.setText("使用Spring Boot发送简单邮件。"); // 内容
//            jms.send(message);
//            return "发送成功";
//        } catch (Exception e) {
//            e.printStackTrace();
//            return e.getMessage();
//        }
//    }

//    @RequestMapping("sendHtmlEmail")
//    public String sendHtmlEmail() {
//        MimeMessage message = null;
//        try {
//            message = jms.createMimeMessage();
//            MimeMessageHelper helper = new MimeMessageHelper(message, true);
//            helper.setFrom(from);
//            helper.setTo("888888@qq.com"); // 接收地址
//            helper.setSubject("一封HTML格式的邮件"); // 标题
//            // 带HTML格式的内容
//            StringBuffer sb = new StringBuffer("<p style='color:#42b983'>使用Spring Boot发送HTML格式邮件。</p>");
//            helper.setText(sb.toString(), true);
//            jms.send(message);
//            return "发送成功";
//        } catch (Exception e) {
//            e.printStackTrace();
//            return e.getMessage();
//        }
//    }

//    @RequestMapping("sendAttachmentsMail")
//    public String sendAttachmentsMail() {
//        MimeMessage message = null;
//        try {
//            message = jms.createMimeMessage();
//            MimeMessageHelper helper = new MimeMessageHelper(message, true);
//            helper.setFrom(from);
//            helper.setTo("888888@qq.com"); // 接收地址
//            helper.setSubject("一封带附件的邮件"); // 标题
//            helper.setText("详情参见附件内容！"); // 内容
//            // 传入附件
//            FileSystemResource file = new FileSystemResource(new File("src/main/resources/static/搭建fate.sh"));
//            helper.addAttachment("项目文档.docx", file);
//            jms.send(message);
//            return "发送成功";
//        } catch (Exception e) {
//            e.printStackTrace();
//            return e.getMessage();
//        }
//    }

//    @RequestMapping("sendInlineMail")
//    public String sendInlineMail() {
//        MimeMessage message = null;
//        try {
//            message = jms.createMimeMessage();
//            MimeMessageHelper helper = new MimeMessageHelper(message, true);
//            helper.setFrom(from);
//            helper.setTo("888888@qq.com"); // 接收地址
//            helper.setSubject("一封带静态资源的邮件"); // 标题
//            helper.setText("<html><body>博客图：<img src='cid:img'/></body></html>", true); // 内容
//            // 传入附件
//            FileSystemResource file = new FileSystemResource(new File("src/main/resources/static/img/sunshine.png"));
//            helper.addInline("img", file);
//            jms.send(message);
//            return "发送成功";
//        } catch (Exception e) {
//            e.printStackTrace();
//            return e.getMessage();
//        }
//    }
//
//    @RequestMapping("sendTemplateEmail")
//    public String sendTemplateEmail(String code) {
//        MimeMessage message = null;
//        try {
//            message = jms.createMimeMessage();
//            MimeMessageHelper helper = new MimeMessageHelper(message, true);
//            helper.setFrom(from);
//            helper.setTo("888888@qq.com"); // 接收地址
//            helper.setSubject("邮件摸板测试"); // 标题
//            // 处理邮件模板
//            Context context = new Context();
//            context.setVariable("code", code);
//            String template = templateEngine.process("emailTemplate", context);
//            helper.setText(template, true);
//            jms.send(message);
//            return "发送成功";
//        } catch (Exception e) {
//            e.printStackTrace();
//            return e.getMessage();
//        }
//    }


}
