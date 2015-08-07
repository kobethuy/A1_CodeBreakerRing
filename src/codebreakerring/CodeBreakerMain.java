/**
 * 
 */
package codebreakerring;

/**
 * @author kobethuy
 *
 */
public class CodeBreakerMain {
	
	private static Timer timer;
	private static CodeBreakerGUIThread guiThread;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		guiThread = new CodeBreakerGUIThread();
		guiThread.start();
		timer = new Timer(3);
	}
	
	public static Timer getTimer() {
		return timer;
	}
	
	public static CodeBreakerGUIThread getGuiThread() {
		return guiThread;
	}
}
