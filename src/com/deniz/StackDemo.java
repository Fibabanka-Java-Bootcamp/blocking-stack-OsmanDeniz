package com.deniz;

import java.util.EmptyStackException;
import java.util.Random;

public class StackDemo extends Thread {
    static StackOperations stackOperations;


    public StackDemo() {
        super();
        stackOperations = new StackOperations();
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " basladi. ");
        System.out.println();
        try {
            for (int i = 0; i < 10; i++) {
                Random rnd = new Random();
                int a = rnd.nextInt(100);
                System.out.println(this.getName() + " item pushed : " + a);
                stackOperations.pushOperation(a);
                a = rnd.nextInt(100);
                System.out.println(this.getName() + " item pushed : " + a);
                stackOperations.pushOperation(a);
                System.out.println(this.getName() + " top item : " + stackOperations.peekOperation());
                System.out.println(this.getName() + " poped : " + stackOperations.popOperation());
                System.out.println(this.getName() + " poped : " + stackOperations.popOperation());
                System.out.println();
            }
        } catch (EmptyStackException ese) {
            System.out.println("Stack bos");
        }
        System.out.println(this.getName() + " bitti.");
    }
}
