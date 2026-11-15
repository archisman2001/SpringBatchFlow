package com.springbatch.demo.listener;

import org.springframework.batch.core.annotation.AfterJob;
import org.springframework.batch.core.annotation.BeforeJob;
import org.springframework.batch.core.job.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListener;

public class MyJobExecutionListener {

    @BeforeJob
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("Job name:"+jobExecution.getJobInstance().getJobName());
        System.out.println("Job Parameters:"+jobExecution.getJobParameters());
        System.out.println("Job Start time:"+jobExecution.getStartTime());
    }

    @AfterJob
    public void afterJob(JobExecution jobExecution) {
        System.out.println("Job name:"+jobExecution.getJobInstance().getJobName());
        System.out.println("Job Parameters:"+jobExecution.getJobParameters());
        System.out.println("Job End time:"+jobExecution.getEndTime());
    }
}
