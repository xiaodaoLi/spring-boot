package org.springframework.boot.context.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.ResolvableType;

import java.util.concurrent.Executor;

public class MySimpleApplicationEventMulticaster extends SimpleApplicationEventMulticaster {

	private static final Logger logger = LoggerFactory.getLogger(MySimpleApplicationEventMulticaster.class);

	@Override
	public void multicastEvent(ApplicationEvent event) {
//		logger.info("multicastEvent {} ", event.getClass());
		super.multicastEvent(event);
	}

	@Override
	public void multicastEvent(ApplicationEvent event, ResolvableType eventType) {
		logger.info("multicastEvent is {}, eventType is {} ", event.getClass(), (eventType != null ? eventType.getClass() : "null"));
		// super.multicastEvent(event, eventType);

		ResolvableType type = (eventType != null ? eventType : resolveDefaultEventType(event));
		Executor executor = getTaskExecutor();
		for (ApplicationListener<?> listener : super.getApplicationListeners(event, type)) {
			logger.info("invoke listener {} for event {}", listener.getClass(), event.getClass());
			if (executor != null) {
				executor.execute(() -> invokeListener(listener, event));
			} else {
				invokeListener(listener, event);
			}
		}
	}


	private ResolvableType resolveDefaultEventType(ApplicationEvent event) {
		return ResolvableType.forInstance(event);
	}
}
