package com.bananna.finow.external;

import lombok.Data;

/**
 * all methods in controllers must return a instance of this class.
 * @Date 2021.06.03
 * @Author Dong Shanwei
 */
@Data
public class ApiResp<T> {
    private static Integer TRUE = 0;
    private static Integer FALSE = 1;
    private Integer success;
    private Object data;
    private String errMsg;
    private Long traceId;
    private ApiResp(){}

    public static <T> ApiResp<T> success(T t){
        ApiResp apiResp = new ApiResp();
        apiResp.setSuccess(TRUE);
        apiResp.setData(t);
        apiResp.setTraceId(AggregateThreadLocal.getTraceId());
        return apiResp;
    }
    public static ApiResp success(){
        return success(null);
    }
    public static ApiResp error(String errMsg){
        ApiResp apiResp = new ApiResp();
        apiResp.setSuccess(FALSE);
        apiResp.setErrMsg(errMsg);
        apiResp.setTraceId(AggregateThreadLocal.getTraceId());
        return apiResp;
    }
}
