package com.jsong.oom.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:堆内存溢出
 *
 * @author jsong
 *         Date: 29/12/2017 18:22
 * @since JDK 1.8
 */
public class LombokOOM {

    public static void main(String[] args) {
        //创建磅秤商品更新策略
        List<lombokADto> listDtos = new ArrayList<lombokADto>();

        for(int i =0 ;i < 100000; i++ ){

            LombokBDto b = new LombokBDto();
            listDtos.add(new lombokADto() {{
                setRegionNo(b.getRegionNo());
                setRetailerNo(b.getRetailerNo());
                setOrgNo(b.getOrgNo());
                setSku(b.getSku());
            }});

//            lombokADto a = new lombokADto();
//            a.setRegionNo(b.getRegionNo());
//            a.setRetailerNo(b.getRetailerNo());
//            a.setOrgNo(b.getOrgNo());
//            a.setSku(b.getSku());
//            listDtos.add(a);

            try{
                Thread.sleep(5);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
