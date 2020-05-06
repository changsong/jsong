### 亚马逊笔试题

> Amazon plans to open Treasure Truck Pop-Ups in the park areas of Technicia.
> Technicia is represented as a grid of M > N blocks.
> Each block represents either a park area, denoted by 1,
>  or a commercial area, denoted by 0.
>  Adjacent blocks with value 1 are considered a contiguous park.
>  Diagonal blocks with value 1 are not considered part of the same contiguity.
>  Amazon plans to have a Treasure Truck Pop-Up in each contiguous park.
> 
>  Write an algorithm to find the number of Treasure Truck Pop-Ups that Amazon can open in the area of Technicia.
> 
>  Input
>  The input to the function/method consists of three arguments:-
>  rows, an integer representing the number of rows in the grid;
>  column, an integer representing the number of columns in the grid;
>  grid, a two-dimensional integer array representing Technicia.
> 
>  Output
>  Return an integer representing the number of Treasure Truck Pop-Ups that Amazon can open in the area of Technicia.
> 
>  Example
>  Input:
>  rows = 5
>  column = 4
>  grid =
>  1 1 0 0
>  0 0 1 0
>  0 0 0 0
>  1 0 1 1
>  1 1 1 1
> 
>  Output:
>  3
> 
>  Explanation:
>  The first cluster is the two adjacent 1's in row one.
>  The second cluster is the 1 on row two, which is not adjacent to any other 1's (diagonal blocks are not considered part of the same cluster).
>  The third cluster is the set of seven adjacent 1's in rows four and five.
>  The total number of clusters of open areas = 3.
> 

[代码查看](https://github.com/changsong/jsong/blob/master/src/main/java/com/jsong/interview/amazon/TreasureTruck.java)

 ```java
 public class TreasureTruck {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int numberAmazonTreasureTrucks(int rows, int column,
                                   List<List<Integer>> grid)
    {
        // check parmeter
        if(grid.size() < rows){
            return 0;
        }
        if(grid.get(0).size() < column){
            return 0;
        }

        // define a stack
        Stack<Integer> stack = new Stack<Integer>() ;

        int count = 0;
        for(int i =0 ; i< grid.size(); i ++ ){
            List<Integer> dataRows = grid.get(i);
            for(int j =0 ; j< dataRows.size(); j ++ ){
                Integer data = dataRows.get(j);
                // check this i,j if the right time to clear stack and count + 1
                // checkout up
                Integer up = 0;
                if(i -1 >= 0){
                    up = grid.get(i - 1).get(j);
                }

                Integer down = 0;
                if(i + 1 < grid.size()){
                    down = grid.get(i + 1).get(j);
                }

                Integer right = 0;
                if(j + 1 < grid.get(0).size()){
                    right = grid.get(i).get(j + 1);
                }

                Integer left = 0;
                if(j -1 >= 0){
                    left = grid.get(i).get(j - 1);
                }

                // check up,down,right,left
                if(data.intValue() == 1){
                    stack.push(data);
                    // if the node around is all 0, clear stack and count ++
                    if(up == 0 && down ==0 && right == 0 && left == 0){
                        stack.empty();
                        count ++;
                    }
                }
            }
        }

        return count;
    }
}
```

%[{ contactme.md }]%