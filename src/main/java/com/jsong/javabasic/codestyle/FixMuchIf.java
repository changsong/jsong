package com.jsong.javabasic.codestyle;

/**
 * 解决If嵌套问题
 */
public class FixMuchIf {

    public static void main(String[] args) {
        boolean isExisted = false;
        boolean isDone = false;
        boolean isContains = false;

        // first judge
        if (isExisted) {
            // second judge
            if (isDone) {
                // do s1 something
            } else {
                // third judge
                if (isContains) {
                    //do s2 something
                } else {
                    //do s3 something
                }
            }
        } else {
            //do s4 something
        }

        if (!isExisted) {
            //do s4 something
            return;
        }

        if (isExisted && isDone) {
            // do s1 something
            return;
        }



        // 5
        //
        // comment
        if (! isExisted) {
            //do s4 something
            return;
        }

        if(isExisted && isDone){
            // do s1 something
            return;
        }

        if(isExisted && !isDone && isContains){
            //do s2 something
            return;
        }

        if(isExisted && !isDone && !isContains){
            //do s3 something
            return;
        }
    }
}
