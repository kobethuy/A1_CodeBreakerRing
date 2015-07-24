/**
 * 
 */
package codebreakerring;

import java.awt.EventQueue;
import java.util.Scanner;

/**
 * @author kobethuy
 *
 */
public class CodeBreakerMain {
	
	private static Code code;
	private static Scanner inp;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		code = new Code();
		inp = new Scanner(System.in);
		System.out.print("Code: ");
		
		for (int a = 0; a < code.getMarbles().size(); a++) {
			System.out.print(code.getMarbles().get(a).getColor_code() + " ");
		}
		
		System.out.println();
		
		for (int b = 0; b < code.getMarbles().size(); b++) {
			System.out.print("Enter: ");
			System.out.println(code.hint(inp.nextInt(), b));
		}
		inp.close();
		*/
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
