package codebreakerring;

public class Timer implements Runnable {
	
	private int timer; 
	private static boolean start = false, stop = false;
	
	public Timer(int timer) {
		this.timer = timer;
	}
	
	@Override
	public void run() {
		
		if (!start)
			start = true;
		int foo = timer * 60;
		while (foo != 0 && !stop) {
			
			try {
				CodeBreakerGUI.setTimer("Time: " + String.format("%02d", (foo / 60)) + ":" + String.format("%02d", foo % 60));
				Thread.sleep(1000);
				foo--;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		CodeBreakerGUI.setTimer("Time: 00:00");
		start = false;
		
		if (stop) {
			return;
		} else {
			CodeBreakerGUI.gameOver(CodeBreakerMain.getGuiThread().getWindow().getGame_container(),
					CodeBreakerMain.getGuiThread().getWindow().getAcceptButton(),
					CodeBreakerMain.getGuiThread().getWindow().getGiveUpButton());
		}
	}
	
	public void start() {
		stop = false;
		Thread thread = new Thread(this, "timer");
		thread.start();
	}
	
	public static boolean getStart() {
		return start;
	}
	
	public static void setStart(boolean start) {
		Timer.start = start;
	}
	
	public int getTimer() {
		return this.timer;
	}
	
	public void setTimer(int timer) {
		this.timer = timer;
	}
	
	public void stop() {
		stop = true;
	}
}
