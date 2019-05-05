package com.felix.design.pattern.creational.prototype.version_init;

/**
 * Created by felix
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        for (int i = 0; i < 10; i++) {
            mail.setName("姓名" + i);
            mail.setEmailAddress("姓名" + i + "@imooc.com");
            mail.setContent("恭喜您，此次慕课网活动中奖了");
            MailUtil.sendMail(mail);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
