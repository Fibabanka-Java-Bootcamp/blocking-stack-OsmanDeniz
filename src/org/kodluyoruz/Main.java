package org.kodluyoruz;

import com.deniz.StackDemo;

public class Main {

    public static void main(String[] args) {

        StackDemo t1 = new StackDemo();
        StackDemo t2 = new StackDemo();
        StackDemo t3 = new StackDemo();
        StackDemo t4 = new StackDemo();
        StackDemo t5 = new StackDemo();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread bitti.");
    }
}
