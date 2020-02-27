package com.jsong.guava;

import org.apache.commons.lang.StringUtils;

/**
 * 缓存处理故障
 * 线上故障： App登录出现大批量的账号失效
 *
 * 分析过程：
 *  App --> App 中间层服务--》Erp（User）
 *
 */
public class LocalCacheTest {

    public static void main(String[] args) {
        // 不同用户登录两千次
        for(int i=0; i < 2000; i++){
            login("1861717123"+ i );
        }

        // https://github.com/changsong/jsong.git
    }

    /**
     * 登录处理
     *
     * @param mobile
     */
    private static void login(String mobile){
        // 不同用户登录两千次
        for(int i=0; i < 2000; i++){
            String key = "loginUserCache_" + mobile;
            String val = LocalCache.getData(key);
            if(StringUtils.isEmpty(val)){
                try{
                    // get user status from erp to
                    // check user is invalid or not.
                    String newval = "response data";
                    LocalCache.setData(key, newval, 3600);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

}
