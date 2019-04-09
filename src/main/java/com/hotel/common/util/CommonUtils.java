package com.hotel.common.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import com.hotel.common.constant.Constants;
import com.hotel.common.validation.EntityValidate;
import com.hotel.common.validation.EntityValidator;
import com.hotel.common.validation.ValidateResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonUtils {
    private static final Logger log = LoggerFactory.getLogger(CommonUtils.class);
    private final static String  ERROR_MESSAGE_PREFIX = "返回错误的请求结果：";

    private CommonUtils() {

    }
    public static JSONObject buildGoodResponseJSONObject(String jsonString) {
        JSONObject jsonResult = JSON.parseObject(jsonString);
        if (jsonResult != null && jsonResult.getInteger(Constants.CODE_FLAG) == 200L) {
            return jsonResult.getJSONObject(Constants.DATA_FLAG);
        } else if (jsonResult != null) {
            log.error(ERROR_MESSAGE_PREFIX + jsonString);
        }
        log.error("返回结果：{}", jsonString);
        return null;
    }

    public static JSONArray buildGoodResponseJSONArray(String jsonString) {
        JSONObject jsonResult = JSON.parseObject(jsonString);
        if (jsonResult != null && jsonResult.getLong(Constants.CODE_FLAG) == 200L) {
            return jsonResult.getJSONArray(Constants.DATA_FLAG);
        } else if (jsonResult != null) {
            log.error(ERROR_MESSAGE_PREFIX + jsonString);
        }
        return null;
    }

    public static <T> void validateEntityBean(T t, Class<?> clazz) {
        ValidateResult vr = EntityValidator.validate(t, clazz);
        EntityValidate.hasValidateException(vr.hasError(), vr.getErrorMessages());
    }

    public static <T> void validateEntityBean(T t) {
        ValidateResult vr = EntityValidator.validate(t);
        EntityValidate.hasValidateException(vr.hasError(), vr.getErrorMessages());
    }

}
