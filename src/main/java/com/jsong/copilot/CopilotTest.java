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

   // 堆排序
   //  public static void heapSort(int[] arr) {
   //      // 1.构建大顶堆
   //      for (int i = arr.length / 2 - 1; i >= 0; i--) {
   //          adjustHeap(arr, i, arr.length);
   //      }
   //      // 2.调整堆结构+交换堆顶元素与末尾元素
   //      for (int j = arr.length - 1; j > 0; j--) {
   //          swap(arr, 0, j);// 将堆顶元素与末尾元素进行交换
   //          adjustHeap(arr, 0, j);// 重新对堆进行调整
   //      }
   //  }
    // 两个列表去掉重复的元素
    public static List<String> removeDuplicate(List<String> list1, List<String> list2) {
        List<String> list = new ArrayList<>();
        for (String str : list1) {
            if (!list2.contains(str)) {
                list.add(str);
            }
        }
        return list;
    }

    // remove the duplicate elements in the list
    public static List<String> removeDuplicate(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            if (!result.contains(str)) {
                result.add(str);
            }
        }
        return result;
    }

    // 获取两个整数之和
    public static int getSum(int a, int b) {
        return a + b;
    }
    // 获取两个整数之差
    public static int getSub(int a, int b) {
        return a - b;
    }
    // 获取两个整数之积
    public static int getMul(int a, int b) {
        return a * b;
    }

    // 获取bigDecimal数组求总和
    // public static BigDecimal getSum(BigDecimal[] arr) {
    //     BigDecimal sum = new BigDecimal(0);
    //     for (BigDecimal bigDecimal : arr) {
    //         sum = sum.add(bigDecimal);
    //     }
    //     return sum;
    // }
    // LocalDate转换为 Date
    // public static Date localDateToDate(LocalDate localDate) {
    //     return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    // }

    // 计算两个日期之间的天数
    // public static int getDaysBetween(Date date1, Date date2) {
    //     return (int) ((date2.getTime() - date1.getTime()) / (1000 * 3600 * 24));
    // }


    //分布式锁
    // public static void lock(String key) {





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
    public static String getAccessToken() {
        // String url = "https://open.douyin.com/oauth/access_token/";
        // Map<String, String> params = new HashMap<>();
        // params.put("client_key", "xxx");
        // params.put("client_secret", "xxx");
        // params.put("grant_type", "client_credential");
        // String result = HttpUtil.post(url, params);
        // JSONObject jsonObject = JSON.parseObject(result);
        // return jsonObject.getString("access_token");
        return "";
    }

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
