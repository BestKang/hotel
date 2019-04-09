package com.hotel.pojo.entity.taskinfo;

import com.alibaba.fastjson.annotation.JSONField;
import com.hotel.common.util.FastJsonUtil;
import com.hotel.pojo.entity.BasePO;
import java.util.Date;

public class TaskInfoPO extends BasePO {
    @JSONField(name = "task_id")
    String taskId;

    @JSONField(name = "task_category")
    String taskCategory;

    @JSONField(name = "issue_time",format = "yyyy-MM-dd HH:mm:ss")
    Date issueTime;

    @JSONField(name = "deadline",format = "yyyy-MM-dd HH:mm:ss")
    Date deadline;

    @JSONField(name = "task_detail")                                                    //频率，每周，每月，每年一次
    String taskDetail;

    @JSONField(name = "task_area")                                                      //删去
    String taskArea;

    @JSONField(name = "publisher")
    String publisher;

    @JSONField(name = "finish_status")                                                      //删去
    String finishStatus;

    @JSONField(name = "allocate_status")                                                    //
    private int allocateStatus;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskCategory() {
        return taskCategory;
    }

    public void setTaskCategory(String taskCategory) {
        this.taskCategory = taskCategory;
    }

    public Date getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }

    public String getTaskArea() {
        return taskArea;
    }

    public void setTaskArea(String taskArea) {
        this.taskArea = taskArea;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getFinishStatus() {
        return finishStatus;
    }

    public void setFinishStatus(String finishStatus) {
        this.finishStatus = finishStatus;
    }

    public int getAllocateStatus() { return allocateStatus; }

    public void setAllocateStatus(int allocateStatus) { this.allocateStatus = allocateStatus; }

    @Override
    public String toString() {
        return FastJsonUtil.toJSONString(this);
    }
}
