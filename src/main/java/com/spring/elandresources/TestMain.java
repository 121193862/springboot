package com.spring.elandresources;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@ComponentScan("com.spring.elandresources")
@Configuration
@PropertySource("classpath:com/spring/elandresources/test.properties")
public class TestMain {

    /**
     * 普通赋值
     */
    @Value("this is normal")
    private String normal;

    /**
     * 注入系统变量
     */
    @Value("#{systemProperties['os.name']}")
    private String osName;

    /**
     * 注入表达式
     */
    @Value("#{ T(java.lang.Math).random() * 100.0 }")
    private Double randomNumber;

    /**
     * 注入bean属性值
     */
    @Value("#{demoService.testValue}")
    private String fromAnther;

    /**
     * 注入文件内容
     */
    @Value("classpath:com/spring/elandresources/test.txt")
    private Resource fileContent;

    /**
     * 注入网址资源
     */
    @Value("http://www.baidu.com")
    private Resource urlContent;

    /**
     * 注入配置文件内容
     * 需要Environment和PropertySourcesPlaceholderConfigurer
     */
    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    private void printEverything() {

        try {
            System.out.println("normal ->" + normal);
            System.out.println("osName ->" + osName);
            System.out.println("randomNumber ->" + randomNumber);
            System.out.println("fromAnther ->" + fromAnther);
            System.out.println("fileContent ->" + IOUtils.toString(fileContent.getInputStream()));
            System.out.println("urlContent ->" + IOUtils.toString(urlContent.getInputStream()));
            System.out.println("bookName ->" + bookName);
            System.out.println("bookName ->" + environment.getProperty("book.author"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestMain.class);
        TestMain testMain = context.getBean(TestMain.class);
        testMain.printEverything();
    }
}
