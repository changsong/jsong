package com.jsong.gc;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * VM参数：-XX:+UseSerialGC
 * @author zzm
 */
public class SerialGCAllocationTest {

    private static final int _1MB = 1024 * 1024;

    /**
     * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     */
    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];

        // 出现一次Minor GC
        waitForInput();
        allocation4 = new byte[4 * _1MB];
        waitForInput();
    }

    public static void main(String[] args) {
        // 暂停检查
        for(int i = 0; i< 10;  i++){
            try{
                testAllocation();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        byte[] allocation5;
        // 出现一次Full Minor GC
        allocation5 = new byte[10 * _1MB];
        waitForInput();
    }

    public static void waitForInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Please input a line");
                String line = scanner.nextLine();
                System.out.printf("User input was: %s%n", line);
                if (!line.isEmpty()) {
                    break;
                }
            }
        } catch(IllegalStateException | NoSuchElementException e) {
            System.out.println("System.in was closed; exiting");
        }
    }
}
