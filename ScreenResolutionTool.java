import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

public final class ScreenResolutionTool {
	private double hScreenLen; // Horizontal Screen Resolution
	private double vScreenLen; // Vertical Screen Resolution
	private double hFrameLen; // Horizontal Frame Resolution
	private double vFrameLen; // Vertical Frame Resolution
	private double percent; // Percent of the screen that shows
	private Dimension screenResolution; // Screen Resolution
	
	public ScreenResolutionTool(double percent) {
		this.percent = percent / 100;
		this.screenResolution = Toolkit.getDefaultToolkit().getScreenSize(); // Getting screen resolution
		this.hScreenLen = this.screenResolution.width; // Setting Horizontal resolution
		this.vScreenLen = this.screenResolution.height; // Setting Vertical resolution
		this.hFrameLen = this.hScreenLen * this.percent; // Setting Horizontal frame len
		this.vFrameLen = this.vScreenLen * this.percent; // Setting Vertical frame len
	}
	
	public Dimension getFrameSize() {
		return new Dimension((int) this.hFrameLen, (int) this.vFrameLen); // Creating a Dimension
	}
	
	public Point getFrameLocation() {
		int hPoint = ((int) this.hScreenLen - (int) this.hFrameLen) / 2; // Calculate Horizontal point
		int vPoint = ((int) this.vScreenLen - (int) this.vFrameLen) / 2; // Calculate Vertical point
		
		return new Point(hPoint, vPoint); // Creating a point;
	}
	
	public double gethScreenLen() {
		return this.hScreenLen;
	}

	public double getvScreenLen() {
		return this.vScreenLen;
	}

	public double gethFrameLen() {
		return this.hFrameLen;
	}

	public double getvFrameLen() {
		return this.vFrameLen;
	}

	public double getPercent() {
		return this.percent;
	}

	public Dimension getScreenResolution() {
		return this.screenResolution;
	}
}
