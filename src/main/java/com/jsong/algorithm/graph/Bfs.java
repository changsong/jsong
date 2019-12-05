package com.jsong.algorithm.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 广度优先算法
 *
 * #include <iostream>
 * #include <queue>
 * #define N 5
 * using namespace std;
 * int maze[N][N] = {
 *     { 0, 1, 1, 0, 0 },
 *     { 0, 0, 1, 1, 0 },
 *     { 0, 1, 1, 1, 0 },
 *     { 1, 0, 0, 0, 0 },
 *     { 0, 0, 1, 1, 0 }
 * };
 * int visited[N + 1] = { 0, };
 * void BFS(int start)
 * {
 *     queue<int> Q;
 *     Q.push(start);
 *     visited[start] = 1;
 *     while (!Q.empty())
 *     {
 *         int front = Q.front();
 *         cout << front << " ";
 *         Q.pop();
 *         for (int i = 1; i <= N; i++)
 *         {
 *             if (!visited[i] && maze[front - 1][i - 1] == 1)
 *             {
 *                 visited[i] = 1;
 *                 Q.push(i);
 *             }
 *         }
 *     }
 * }
 * int main()
 * {
 *     for (int i = 1; i <= N; i++)
 *     {
 *         if (visited[i] == 1)
 *             continue;
 *         BFS(i);
 *     }
 *     return 0;
 * }
 */
public class Bfs {

     int N  = 5;

     int[][] maze = {{0, 1, 1, 0, 0},
                    { 0, 0, 1, 1, 0},
                    { 0, 1, 1, 1, 0},
                    { 1, 0, 0, 0, 0},
                    { 0, 0, 1, 1, 0}};

    int[] visited = new int[N + 1];

    /**
     * 入口
     *
     * @return
     */
    public int start(){
        visited[0] = 0;
        for (int i = 1; i <= N; i++)
        {
             if (visited[i] == 1){
                 continue;
             }
             bfs(i);
         }
         System.out.println(visited.toString());
         return 0;
    }

    /**
     * 从某一个节点开始
     *
     * @param start
     */
    void bfs(int start){
      Queue<Integer> q = new LinkedList<Integer>();
      q.offer(start);

      visited[start] = 1;
      while (!q.isEmpty())
      {
         int front = ((LinkedList<Integer>) q).getFirst();
         ((LinkedList<Integer>) q).pop();
         for (int i = 1; i <= N; i++)
         {
             if (visited[i] != 1  && maze[front - 1][i - 1] == 1)
             {
                 visited[i] = 1;
                 ((LinkedList<Integer>) q).addLast(i);
             }
         }
      }
    }

    public static void main(String[] args) {
        Bfs bfs=new Bfs();
        bfs.start();
    }

}
