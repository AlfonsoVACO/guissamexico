package com.guissa.guissa.components;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

// TODO: Auto-generated Javadoc
/**
 * The Class TaskComponent.
 */
@Component("taskComponent")
public class TaskComponent {
	
	/** The Constant LOGGER. */
	private static final Log LOGGER = LogFactory.getLog(TaskComponent.class);

	/**
	 * Do task. to generate task
	 */
	@Scheduled(fixedDelay = 5000)
	public void doTask() {
		LOGGER.info("Time is: " + new Date());
	}
}
