package com.jsong.copilot;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author changsong
 */
public class CopilotTest {

   public static void main(String[] args) {

   }

  // 快速排序
  public static void quickSort(int[] arr, int start, int end) {
      if (start >= end) {
          return;
      }
      int pivot = arr[start];
      int i = start;
      int j = end;
      while (i < j) {
          while (i < j && arr[j] >= pivot) {
              j--;
          }
          arr[i] = arr[j];
          while (i < j && arr[i] <= pivot) {
              i++;
          }
          arr[j] = arr[i];
      }
      arr[i] = pivot;
      quickSort(arr, start, i - 1);
      quickSort(arr, i + 1, end);
  }

  // 获取抖音视频开放平台的access_token

   /**
    * 获取抖音开放平台用户信息
    * @param accessToken
    * @return
    */
   public static String getUserInfo(String accessToken) {
       // String url = "https://api.amemv.com/aweme/v1/user/info/";
       // String params = "access_token=" + accessToken + "&ts=1555590512&app_type=normal";
       // String result = HttpUtil.sendGet(url, params);
       // return result;
       return "";
   }

   // // 计算两个数的和
   // public static int add(int a, int b) {
   //    return a + b;
   // }
   //
   // // 计算两个数的差
   // public static int sub(int a, int b) {
   //    return a - b;
   // }
   //
   // // 计算两个数的积
   // public static int mul(int a, int b) {
   //    return a * b;
   // }
   //
   // /**
   //  * 请求抖音开放平台获取用户信息
   //  *
   //  * @param accessToken 抖音开放平台的accessToken
   //  *                    <p>
   //  */
   // public static void requestDouyinUserInfo(String accessToken) {
   //
   // }
   //
   //
   //



   // /*
   //  * RobostTest cases for the copilot application.
   //  */
   // public static void main(String[] args) {
   //
   // }
   //
   //
   // /**
   //  * 计算两个整数的和
   //  */


   /**
    * 请求百度的接口，返回数据   参数：url，参数：params，参数：method，参数：headers，参数：cookies   返回值：String   方法：get   描述：    请求百度的接口，返回数据
    *
    */
   public static String get(String url, String params, String method, String headers, String cookies) {
      return null;
   }

   /**
    * 计算两个整数的和
    *
    * @param a
    * @param b
    * @return a+b
    */
   public static int sum(int a, int b) {
      return a + b;
   }

   /**
    * 迭代列表取出为空的元素
    */
   public static void list() {
      // List<String> list = new ArrayList<String>();
      // list.add("a");
      // list.add("b")
      // for (String str : list) {
      //    if (str == null) {
      //       list.remove(str);
      //    }
      // }
   }

   /**
    * 快速排序
    */
   // public static void quickSort(int[] arr) {
   //    if (arr == null || arr.length == 0) {
   //       return;
   //    }
   //    quickSort(arr, 0, arr.length - 1);
   // }
   //
   //  // Path: attendance-common-api\src\main\java\com\dm\attendance\common\api\response\ResultEntity.java
   //  // quick sort
   //  public static void quickSort(int[] arr, int low, int high) {
   //      if (low < high) {
   //          int middle = getMiddle(arr, low, high);
   //          quickSort(arr, low, middle - 1);
   //          quickSort(arr, middle + 1, high);
   //      }
   //  }

    // search in array
    public static int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (arr[middle] > key) {
                high = middle - 1;
            } else if (arr[middle] < key) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    // return the max value in array
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // return the min value in array
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // compare two list and remove the same element
    public static List<String> compareList(List<String> list1, List<String> list2) {
        List<String> list = new ArrayList<>();
        for (String str : list1) {
            if (!list2.contains(str)) {
                list.add(str);
            }
        }
        return list;
    }

    // 比较两个list，返回相同的元素
    public static List<String> compareList2(List<String> list1, List<String> list2) {
        List<String> list = new ArrayList<>();
        for (String str : list1) {
            if (list2.contains(str)) {
                list.add(str);
            }
        }
        return list;
    }
}
