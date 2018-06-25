package com.yy.common;

import javax.servlet.http.HttpServletRequest;

/**
 * AUTHOR: youyu  工号：S37565
 * CREATED_DATE: 2018/6/25 15:12
 */
public class RequestUtil {

    public static String getUserIp(HttpServletRequest request){

        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || "unknown".equalsIgnoreCase(ip)){
            ip = request.getHeader("X-Real-IP");
        }
        if (ip == null || "unknown".equalsIgnoreCase(ip)){
            ip = request.getRemoteAddr();
        }
        if(ip != null){
            ip = ip.split(",")[0];
            if (isIp(ip)){
                return ip;
            }
        }
        return "";
    }

    /**
     * 判断是否是一个IP
     * @param ip IP
     * @return Boolean
     */
    public static boolean isIp(String ip) {
        if(ip == null || ip.trim().length() < 7) {
            return false;
        }

        ip = ip.trim();
        if (ip.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")) {
            String[] s = ip.split("\\.");
            if (Integer.parseInt(s[0]) <= 255) {
                if (Integer.parseInt(s[1]) <= 255) {
                    if (Integer.parseInt(s[2]) <= 255) {
                        if (Integer.parseInt(s[3]) <= 255) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
