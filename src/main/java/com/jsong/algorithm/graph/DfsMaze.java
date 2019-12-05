package com.jsong.algorithm.graph;

/**
 * 给定一个M*N的矩阵（二维数组），
 * 分别用0和1表示通路和障碍物。即 0 表示 通路；1 表示 障碍物。
 * 从矩阵的左上角开始，每次只能向右，下，左，上移动位置，不能斜着走。请给出从入口到出口的路线
 *
 * 怎么开始思考呢？
 * 首先想想，这个题目其实是找从入口（Entrance）到出口（Exit）的可能的路径。
 * 矩阵（二维数组）从左上角开始，坐标为（0，0），可以向右走，坐标为（0，1）；
 * 或者向下走，坐标为（1，0）。
 *
 * 对于一般的位置（x，y），
 * 可以有4个搜索方向：右（x，y+1），下（x+1，y），左（x，y-1），上（x-1，y）。
 *
 * 如何设计DFS搜索函数呢？
 * 二维数组（M行，N列）的右下角出口位置可以表示为：（m-1, n-1）
 * 路径表示为path ； 但是路径可能有很多条，其中最短的路径表示为：shortestPath。
 *
 * 至少这个函数需要三个参数。dfs(x坐标，y坐标，搜索矩阵即二维数组)
 *
 * 所定义dfs函数为：
 * public static void dfsMaze(int x,int y, int[][] maze)
 *
 * //这里有一个问题，如果最短的路线不只一条，怎么处理？这个算法中并没有考虑这个问题。
 * //所以这个算法还是有一定的瑕疵的。
 */
public class DfsMaze {

    /**
     * DFS算法解决走迷宫问题
     * 0: 表示通路
     * 1: 表示死路
     *
     */
    static String path = "";
    static String shortestPath = "";

    public static void dfsMaze(int x, int y, int[][] maze) {
        /*
         * 获得矩阵的大小
         * */
        int m=maze.length;
        int n=maze[0].length;
        //设置结束条件
        if (x < 0 || y < 0){
            return;
        }
        // 如果坐标越界，或者 maze[x][y]==1 表示遇到障碍
        if (x > m - 1 || y > n - 1 || maze[x][y] ==1){
            return;
        }

        //表示遇到障碍
        if (maze[x][y] == 1){
            return; // 判断是否通路和越界
        }
        if (x == m - 1 && y == n - 1) { // 判断是否抵达出口
            path = path + "(" + x + "," + y + ")";
            if (shortestPath.length() == 0 || shortestPath.length() > path.length()){
                shortestPath = path;
            }
            System.out.println("找到路线:" + path);
            return;
        }

        String temp = path;
        path = path + "(" + x + "," + y + ")" + "-"; // 记录路线
        maze[x][y] = 1; // 将走过的路标记
        // 向四个方向搜索
        dfsMaze(x + 1, y, maze);  //向右搜索
        dfsMaze(x, y + 1, maze);  //向下搜索
        dfsMaze(x, y - 1, maze);  //向上搜索
        dfsMaze(x - 1, y, maze);  //向左搜索
        // 将路线和标记恢复成上一次的状态
        maze[x][y] = 0;
        //清除
        path = temp;
    }

    public static void main(String[] args) {
        // 初始化一个迷宫地图
        // 0: 表示通路
        // 1:表示死路
        int[][] maze = {
                {0, 0, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 0, 1, 1, 0, 1},
                {1, 0, 1, 0, 0, 1, 0, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 0, 1},
                {1, 1, 0, 1, 1, 0, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 0}
        };

        int[][] maze2 = {
                {0, 0, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 0, 1, 1, 0, 1},
                {1, 0, 1, 0, 0, 1, 0, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 0, 1},
                {1, 1, 0, 1, 1, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 0}
        };
        /*
         * 从矩阵的左上角位置开始搜索
         * */
        dfsMaze(0, 0, maze);
        if (shortestPath.length() != 0){
            System.out.println("最短路线为：" + shortestPath);
        }
        else{
            System.out.println("没有找到路线！");
        }

    }
}
