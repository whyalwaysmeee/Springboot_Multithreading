package com.taskexecutor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TEConfig.class);
	
	AsyncTS asyncTS = context.getBean(AsyncTS.class);
	
	for (int i = 0; i < 10;i++) {
		asyncTS.executeAsyncTask(i);
		asyncTS.executeAsyncTaskPlus(i);
	}
context.close();}
}
