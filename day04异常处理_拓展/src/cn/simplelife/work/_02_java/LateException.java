package cn.simplelife.work._02_java;

import java.util.Date;

/**
 * @ClassName LateException
 * @Description
 * @Author simplelife
 * @Date 2022/8/5 11:23
 * @Version 1.0
 */

public class LateException extends Exception {
    private Date arriveTime; // 迟到的时间
    private String reason; // 迟到的原因

    public LateException(Date arriveTime, String reason) {
        this.arriveTime = arriveTime;
        this.reason = reason;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "LateException{" +
                "arriveTime=" + arriveTime +
                ", reason='" + reason + '\'' +
                '}';
    }
}
