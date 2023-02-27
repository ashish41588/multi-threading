package com.example.testapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThreadingApplicationDemo {

    @SuppressWarnings({"unchecked"})
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ThreadingApplicationDemo.class, args);
        Counter cnt=new Counter();

        //Initialize the thread-1
        Thread t1=new Thread(() -> {
            for(int i=0;i<1000;i++){
                cnt.increment();
            }
        });
        // start the thread-1
        t1.start();
        // wait for thread-1 to complete
        t1.join();
        System.out.println("Count after running thread 1st thread is: "+cnt.count);

        // Initialize the thread-2
        Thread t2=new Thread(() -> {
            for(int i=0;i<1000;i++){
                cnt.increment();
            }
        });

        // start the thread-2
        t2.start();
        // wait for thread-2 to complete
        t2.join();
        System.out.println("Count after running thread 2nd thread is: "+cnt.count);
    }

}
