package com.shield;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类-评论项目
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.shield")
public class CommentApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(CommentApplication.class,args);
    }
}
