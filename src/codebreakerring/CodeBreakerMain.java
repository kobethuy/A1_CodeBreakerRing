/**
 * 
 */
package codebreakerring;

import java.awt.EventQueue;

/**
 * @author kobethuy
 *
 */
public class CodeBreakerMain {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CodeBreakerGUI window = new CodeBreakerGUI();
					window.getFrmCodeBreakerRing().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
