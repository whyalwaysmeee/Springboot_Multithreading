package com.taskexecutor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
@Service
public class AsyncTS {
@Async                     //声明这是一个并行方法
public void executeAsyncTask(Integer i) {
	System.out.println("execute asynchronous task: "+ i);
}

@Async
public void executeAsyncTaskPlus(Integer i) {
	System.out.println("execute asynchronous task+1: "+(i+1));
}
}
