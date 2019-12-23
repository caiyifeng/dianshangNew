package com.mehope.app.dianshang.common;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 淘淘商城自定义响应结构
 */
public class Result {

    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    private Boolean success;
    
    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    public static Result build(Boolean success,Integer status, String msg, Object data) {
        return new Result(success,status, msg, data);
    }

    public static Result ok(Object data) {
        return new Result(data);
    }

    public static Result ok() {
        return new Result(null);
    }

    public Result() {

    }


    public Result(Boolean success,Integer status, String msg, Object data) {
    	this.success = success;
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Result(Object data) {
    	this.success = true;
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    
	public static  Result success(String msg, Object data) {
		return build(Boolean.TRUE,200, msg, data);
	}    
	
	public static  Result success() {
		return success(null, null);
	}	
	
	public static  Result success(String msg) {
		return success(msg, null);
	}
	
	public static  Result success(Object data) {
		return success(null, data);
	}	
	
	public static  Result fail(Integer status, String msg) {
		return build(Boolean.FALSE, status,msg, null);
	}	
	
	
	public static  Result fail(Integer status, String msg, Object data) {
		return build(Boolean.FALSE, status,msg, data);
	}	
	
	public static  Result fail(String msg, Object data) {
		return build(Boolean.FALSE, -1,msg, data);
	}
	
	public static  Result fail(String msg) {
		return build(Boolean.FALSE,-1, msg, null);
	}	

	public static  Result fail(Object data) {
		return fail("", data);
	}
	
	public static  Result fail() {
		return fail("", null);
	}	
	
//    public Boolean isOK() {
//        return this.status == 200;
//    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 将json结果集转化为TaotaoResult对象
     * 
     * @param jsonData json数据
     * @param clazz TaotaoResult中的object类型
     * @return
     */
    public static Result formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, Result.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }
            return build(true,jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 没有object对象的转化
     * 
     * @param json
     * @return
     */
    public static Result format(String json) {
        try {
            return MAPPER.readValue(json, Result.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Object是集合转化
     * 
     * @param jsonData json数据
     * @param clazz 集合中的类型
     * @return
     */
    public static Result formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(true,jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

}
