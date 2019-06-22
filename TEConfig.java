package com.taskexecutor;
import java.util.concurrent.Executor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;

@Configuration
@EnableAsync     //开启对并行任务的支持 
@ComponentScan("com.taskexecutor")
public class TEConfig implements AsyncConfigurer{    //实现AsyncConfigurer接口
	//@Override
	public Executor getAsyncExecutor() {              //重写getAsyncExecutor方法并返回一个ThreadPoolTaskExecutor
ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
taskExecutor.setCorePoolSize(5);
taskExecutor.setMaxPoolSize(10);
taskExecutor.setQueueCapacity(25);
taskExecutor.initialize();
return taskExecutor;               //一个线程池
	}
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler(){
	return null;
}
}
