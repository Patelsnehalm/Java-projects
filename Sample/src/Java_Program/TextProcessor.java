package Java_Program;

public class TextProcessor implements Runnable {
	
	String text;
	
	
	public TextProcessor(String text) {
		super();
		this.text = text;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is started processing text = " + text);
		processText();		// Simulate the process
		System.out.println(Thread.currentThread().getName() + " is done processing text = " + text);
	}
	
	public void processText() {
		try {
			Thread.sleep(4000);
		} catch(Exception e) {
			System.out.println("Failed to process text = " + text);
		}
	}

}