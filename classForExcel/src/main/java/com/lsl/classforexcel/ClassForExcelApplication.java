package com.lsl.classforexcel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@Slf4j
@SpringBootApplication
public class ClassForExcelApplication {

    public static void main(String[] args) {
        log.info("===================程序启动成功===================");
        SpringApplication.run(ClassForExcelApplication.class, args);
    }

}
