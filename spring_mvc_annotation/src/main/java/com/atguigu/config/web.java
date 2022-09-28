package com.atguigu.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @author cc
 * @date 2022年09月28日 19:12
 * //用来代替web.xml
 */
public class web extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    //设置配置类代替Spring配置文件
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
                SpringCONFIG.class
        };
    }


    //设置配置类代替springmvc配置文件
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                WEBCONFIG.class
        };
    }

    //设置Springmvc的前端控制器dispatchservlet的url-pattern
    @Override
    protected String[] getServletMappings() {
        return new String[]{
                "/"
        };
    }

    @Override
    //设置当前过滤器
    protected Filter[] getServletFilters() {
        //创建编码过滤器
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        //创建请求方式过滤器
        HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
        return new Filter[]{
                characterEncodingFilter,hiddenHttpMethodFilter
        };
    }
}
