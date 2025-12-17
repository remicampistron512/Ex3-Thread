
public class TestRunnable implements Runnable {
	
	private static final char[] BORDERS = {'!', '"', '#', '$', '%', '&', '\'', '(', ')'};
	
	@Override
	public void run() {
		for (int i = 0; i < BORDERS.length; i++) {
			char border = BORDERS[i];
			System.out.print(border);
			
			for (int j = 0;j<i+1; j++) {
				this.sync();
			}
			System.out.print(border);
			System.out.println();
		}
		
			
			
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new TestRunnable());
		thread.start();
	}
	
	public synchronized void sync() {
    	System.out.print("*");
    	
    }
}
