package com.lt.bootdemo.config;

import com.lt.bootdemo.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfigurerAdapter implements WebMvcConfigurer {
    /**
     * 配置静态访问资源
     * @param registry
     */
  /*  @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        自定义静态资源映射目录
        registry.addResourceHandler("/my/**").addResourceLocations("classpath:/my/");
//        指定外部目录
//        registry.addResourceHandler("/my/**").addResourceLocations("file:E:/my/");
        super.addResourceHandlers(registry);
    }*/

    /**
     * 以前要访问一个页面需要先创建个Controller控制类，再写方法跳转到页面1.x
     * 在这里配置后就不需要那么麻烦了，直接访问http://localhost:8080/toLogin就跳转到login.jsp页面了
     * @param registry
     */
   /* @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/toLogin").setViewName("login");
        super.addViewControllers(registry);
    }*/

    /**
     * 拦截器
     * @param registry
     */
    /*@Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/toLogin","/login","/assets/**");
    }*/
}
