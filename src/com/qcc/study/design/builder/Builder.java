package com.qcc.study.design.builder;

import com.qcc.study.design.factory.MailSender;
import com.qcc.study.design.factory.Sender;
import com.qcc.study.design.factory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: qiancc
 * 2017年07月18日
 * 工厂模式主要是创建单个产品对象,而建造者模式主要是将各种产品集中起来进行管理,用来创建复合对象;
 * 建造者模式将很多功能集成到类中,这个类可以创造出比较复杂的东西;
 */
public class Builder {
    private List<Sender> list = new ArrayList<>();

    public List<Sender> getList() {
        return list;
    }

    public void setList(List<Sender> list) {
        this.list = list;
    }

    public void productMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void productSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.productMailSender(10);
        List<Sender> list = builder.getList();
        for (Sender sender : list) {
            System.out.println(sender);
        }
    }

}
