package com.jsong.algorithm.graph;

/**
 * 求排列组合数
 * 假设给定3个数：1，2，3，求出其所有的排列组合情况。

 * 例如：
 * 1，1，1
 * 1，1，2
 * 1，1，3
 * 1，2，1
 * 1，2，2
 * 1，2，3
 * ……
 * 3，3，3
 *
 *这个问题也可以使用DFS算法求解。
 *
 * 那么该如何开始思考这个问题呢？
 * 首先定义一个数组：
 *
 * int[] array = new int[3];
 * 数组元素表示为：array[0]=1; array[1]=2;array[2]=3

 这个数组代表搜索的开始。从array[0]开始，第一种情况组合就是：1，1，1

 设计DFS搜索函数的原型为：

 public void dfsExample(int index)
 1
 其中：参数的含义是从目标数组中依次取出第几个元素。index代表数组元素的下标。
 */
public class DfsCombination {

    int[] num = new int[3];

    public void dfsExample(int index)
    {
        // 边界条件
        if (index == 3)
        {
            for (int i = 0; i < 3; i++)
            {
                System.out.print(num[i]+" ");
            }
            System.out.println();
            //走不下去了就 return了
            return;
        }

        for (int i = 1; i <= 3; i++)
        {
            num[index] = i;
            // index+1 枚举下一种情况
            dfsExample(index+1);
        }
    }

    public static void main(String[] args) {
        DfsCombination dfsdemo=new DfsCombination();
        dfsdemo.dfsExample(0);
    }
}