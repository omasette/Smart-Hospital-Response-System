package com.limeguru.tutorial;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;

public class CronScheduler {

	@Scheduled(cron = "*/5 * * * * ?")
	public void run() throws InterruptedException {
		System.out.println("Cron scheduler is running at " + new Date());
		Thread.sleep(3000);
	}

}
