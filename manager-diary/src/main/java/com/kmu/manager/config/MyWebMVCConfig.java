package com.kmu.manager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @作者：Deng 时间：2020/8/19 9:52
 */
@Configuration
public class MyWebMVCConfig implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//
//        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new LoginInterceptor());
//        interceptorRegistration.addPathPatterns("/**").excludePathPatterns("/login.html","/login.do","/**/*.js", "/**/*.css","/**/*.woff*", "/**/*.ttf");

//    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //上传的图片在E盘下的uploadFile目录下，访问路径如：http://localhost:8081/myHead/d3cf0281-bb7f-40e0-ab77-406db95ccf2c.jpg
        //其中myHead表示访问的前缀。"file:E:/uploadFile/"是文件真实的存储路径
        registry.addResourceHandler("/myHead/**").addResourceLocations("file:E:/uploadFile/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }

}
