package com.sunda.product.util;

import com.sunda.product.vo.ResultVO;

/**
 * Created by 老蹄子 on 2018/10/26 下午4:38
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
