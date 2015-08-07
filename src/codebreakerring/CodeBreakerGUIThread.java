package codebreakerring;

public class CodeBreakerGUIThread implements Runnable {
	
	private CodeBreakerGUI window;

	@Override
	public void run() {
		window = new CodeBreakerGUI();
		window.getFrmCodeBreakerRing().setVisible(true);
	}
	
	public void start() {
		Thread thread = new Thread(this, "GUI");
		thread.start();
	}
	
	public CodeBreakerGUI getWindow() {
		return window;
	}
}
