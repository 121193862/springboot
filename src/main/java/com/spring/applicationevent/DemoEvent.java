package com.spring.applicationevent;

import org.springframework.context.ApplicationEvent;

/**
 * 继承ApplicationEvent
 */
public class DemoEvent extends ApplicationEvent {

    private static final long serialVersionUID = -62067743712799118L;

    private String msg;

    public DemoEvent(Object source, String message) {
        super(source);
        this.msg = message;
        System.out.println("this is demoEvent ,the message is -> " + message);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
