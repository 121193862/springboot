package com.spring.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;

    private ResourceLoader loader;

    /**
     * 实现BeanNameAware 需要重写setBeanName方法
     *
     * @param name
     */
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    /**
     * 实现ResourceLoader 需要重写setResourceLoader
     *
     * @param resourceLoader
     */
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void putPrint() {
        try {
            System.out.println("this beanName  -> " + beanName);
            Resource resource = loader.getResource("classpath:com/spring/aware/test.txt");
            System.out.println("文件内容->" + IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
