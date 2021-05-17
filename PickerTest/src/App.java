import javax.swing.SwingUtilities;

/**
 * 
 */

/**
 * @author Maxine Hammett May 17, 2021
 * 
 */
public class App {

	public App() {
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TestJFilePicker();
			}
		});
	}

}
