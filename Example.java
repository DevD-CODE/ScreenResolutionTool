import javax.swing.*;

public class Example {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {			
			@Override
			public void run() {
				DrawGUI();
			}
		});
	}
	
	private static void DrawGUI() {
		JFrame frame = new JFrame();
		
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Setting frame size and position
		ScreenResolutionTool resolutionTool = new ScreenResolutionTool(75);
		frame.setSize(resolutionTool.getFrameSize());
		frame.setLocation(resolutionTool.getFrameLocation());
		
		frame.setVisible(true);
	}
}
