package com.my.bbs.config;

import com.my.bbs.common.Constants;
import com.my.bbs.interceptor.MyBBSLoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyBBSWebMvcConfigurer implements WebMvcConfigurer {

    private final MyBBSLoginInterceptor myBBSLoginInterceptor;

    public MyBBSWebMvcConfigurer(MyBBSLoginInterceptor myBBSLoginInterceptor) {
        this.myBBSLoginInterceptor = myBBSLoginInterceptor;
    }

    public void addInterceptors(InterceptorRegistry registry) {
        // 登陆拦截
        registry.addInterceptor(myBBSLoginInterceptor)
                .excludePathPatterns("/register")
                .excludePathPatterns("/login")
                .addPathPatterns("/logout")
                .addPathPatterns("/addPostPage")
                .addPathPatterns("/addPost")
                .addPathPatterns("/addCollect/**")
                .addPathPatterns("/editPostPage/**")
                .addPathPatterns("/editPost")
                .addPathPatterns("/detail/**")
                .addPathPatterns("/uploadFile")
                .addPathPatterns("/uploadFiles")
                .addPathPatterns("/updateUserInfo")
                .addPathPatterns("/updateHeadImg")
                .addPathPatterns("/updatePassword")
                .addPathPatterns("/userCenter")
                .addPathPatterns("/userCenter/**")
                .addPathPatterns("/myCenter")
                .addPathPatterns("/userSet");
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**").addResourceLocations("file:" + Constants.FILE_UPLOAD_DIC);
    }
}