package com.example.demo48;

import org.assertj.core.util.DateUtil;
import org.springframework.util.StopWatch;

import java.text.DecimalFormat;
import java.util.Date;

public class DemoTest01 {
    public static void main(String[] args) throws InterruptedException {
        DemoTest01 test01 = new DemoTest01();
        test01.test();
    }

    private void test() throws InterruptedException {
        StopWatch sw = new StopWatch("Jadan-Z");

        sw.start("起床");
        Thread.sleep(1000);
        sw.stop();

        sw.start("洗漱");
        Thread.sleep(2000);
        sw.stop();

        sw.start("锁门");
        Thread.sleep(500);
        sw.stop();

        System.out.println(sw.prettyPrint());
        System.out.println(sw.getTotalTimeMillis());
        System.out.println(sw.getLastTaskName());
        System.out.println(sw.getLastTaskInfo());
        System.out.println(sw.getTaskCount());
    }
}
