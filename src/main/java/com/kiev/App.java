package com.kiev;

import com.kiev.config.SpringConfig;
import com.kiev.service.TestBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        TestBean testBean = ctx.getBean(TestBean.class);

        String name = testBean.getName();
        log.info("Hello World, " + name);
    }
}