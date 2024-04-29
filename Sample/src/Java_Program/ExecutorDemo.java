package Java_Program;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorDemo {

		public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
			System.out.println("Hello");
			ExecutorService executor = Executors.newFixedThreadPool(2);
			
			TextProcessor processor1 = new TextProcessor("Hi");
			executor.execute(processor1);
			
			TextProcessor processor2 = new TextProcessor("Hello");
			executor.execute(processor2);
			
			TextProcessor processor3 = new TextProcessor("I'm learning Executor Framework");
			executor.execute(processor3);
			
			TextProcessor processor4 = new TextProcessor("I'm very happy");
			executor.execute(processor4);
			
			TextProcessorCallable processor5 = new TextProcessorCallable("This is callable task performed by Sachin Patel");
			Future<String> future = executor.submit(processor5);
			String text = future.get();
//			String text = future.get(1, TimeUnit.MINUTES);	// Get method with timeout
			
			System.out.println("The data that I got from sumit method whe it runs callable task = " + text);
			
			//executor.shutdown();     // It stop taking new tasks, it will till all the running tasks completes.
//			executor.shutdownNow();	// It stop taking new tasks, and stop the currently running tasks immediately
			/*
			 * if(!executor.awaitTermination(10, TimeUnit.SECONDS)) {
			 * executor.shutdownNow(); }
			 */
		//	System.out.println(executor.isShutdown());
		}

	

}
