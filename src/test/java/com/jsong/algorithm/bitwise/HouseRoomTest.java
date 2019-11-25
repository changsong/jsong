package com.jsong.algorithm.bitwise;

import org.junit.Test;

public class HouseRoomTest {
    /**
     *
     * Testcase 1:
     * Input:[1, 0, 0, 0, 0, 1, 0, 0],
     * Expected Return Value:
     * 0 1 0 0 1 0 1 0
     *
     * Testcase 2:
     * Input:
     * [1, 1, 1, 0, 1, 1, 1, 1], 2
     *
     * Expected Return Value:
     * 0 0 0 0 0 1 1 0
     */
    @Test
    public void test1(){
        int[] inputAr = new int[]{1, 0, 0, 0, 0, 1, 0, 0};
        HouseRoom houseRoom = new HouseRoom();
        houseRoom.cellCompete(inputAr, 1);


        inputAr = new int[]{1, 1, 1, 0, 1, 1, 1, 1};
        houseRoom.cellCompete(inputAr, 2);
    }
}
