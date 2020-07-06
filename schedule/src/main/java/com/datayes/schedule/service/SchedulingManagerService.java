package com.datayes.schedule.service;

import com.datayes.schedule.models.Scheduling;

public interface SchedulingManagerService {
    /**
	  * 添加一个定时任务
     */
    void addCronJob(Scheduling scheduling);

    /**
          * 暂停任务
     */
    void pauseJob(String jobName, String jobGroup);

    /**
          * 恢复任务
     */
    void resumeJob(String triggerName, String triggerGroup);

    /**
          * 删除job
     */
    void deleteJob(String jobName, String jobGroup);
}
