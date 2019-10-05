package com.spring.applicationevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 时间监听器
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {


    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("this listener ,the msg is ->" + msg);
    }
}
