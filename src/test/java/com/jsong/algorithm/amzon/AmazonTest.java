package com.jsong.algorithm.amzon;

import com.jsong.interview.amazon.Amazon;
import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AmazonTest {
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
        List<List<Integer>> grid = new ArrayList<List<Integer>>();

        List<Integer> row1 = Lists.newArrayList();
        row1.add(0, 1);
        row1.add(1, 1);
        row1.add(2, 0);
        row1.add(3, 0);
        grid.add(row1);

        List<Integer> row2 = Lists.newArrayList();
        row2.add(0, 0);
        row2.add(1, 0);
        row2.add(2, 0);
        row2.add(3, 0);
        grid.add(row2);

        List<Integer> row3 = Lists.newArrayList();
        row3.add(0, 0);
        row3.add(1, 0);
        row3.add(2, 1);
        row3.add(3, 1);
        grid.add(row3);

        List<Integer> row4 = Lists.newArrayList();
        row4.add(0, 0);
        row4.add(1, 0);
        row4.add(2, 0);
        row4.add(3, 0);
        grid.add(row4);

        Amazon Amazon = new Amazon();
        int count = Amazon.numberAmazonTreasureTrucks(4,4,grid );
        System.out.println(count);
    }
}
