package com.sunda.order.utils;

import com.sunda.order.vo.ResultVO;

/**
 * Created by 老蹄子 on 2018/10/26 下午9:13
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
