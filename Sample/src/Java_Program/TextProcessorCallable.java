package Java_Program;

import java.util.concurrent.Callable;

public class TextProcessorCallable implements Callable<String> {
	String text;

	public TextProcessorCallable(String text) {
		this.text = text;
	}

	public String call() {
		System.out.println(Thread.currentThread().getName() + " is started processing text = " + text);
		processText(); // Simulate the process
		System.out.println(Thread.currentThread().getName() + " is done processing text = " + text);
		return text;
	}

	public void processText() {
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			System.out.println("Failed to process text = " + text);
		}
	}
}