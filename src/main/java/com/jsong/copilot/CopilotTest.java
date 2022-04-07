package com.jsong.copilot;

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

   /**
    * 获取抖音开放平台用户信息
    * @param accessToken
    * @return
    */
   public static String getUserInfo(String accessToken) {
       String url = "https://api.amemv.com/aweme/v1/user/info/";
       String params = "access_token=" + accessToken + "&ts=1555590512&app_type=normal";
       String result = HttpUtil.sendGet(url, params);
       return result;
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
   //  * Test cases for the copilot application.
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
      List<String> list = new ArrayList<String>();
      list.add("a");
      list.add("b")
      for (String str : list) {
         if (str == null) {
            list.remove(str);
         }
      }
   }

   /**
    * 快速排序
    */
   public static void quickSort(int[] arr) {
      if (arr == null || arr.length == 0) {
         return;
      }
      quickSort(arr, 0, arr.length - 1);
   }
}
