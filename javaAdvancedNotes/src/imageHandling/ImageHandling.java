package imageHandling;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageHandling {

	public static void main(String[] args) throws IOException {
		
		int width = 963;
		int height = 640;
		BufferedImage image = null;
		
		image = readFromFile(width,height,image);
		
		writeToFile(image);
	}
	
	private static BufferedImage readFromFile(int width, int height, BufferedImage image) {
		
		try {
			
			File sampleFile = new File("/Users/Yudzilla/Pictures/ImageIcons/football.png");
			
			image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			
			// Reading input file
			image = ImageIO.read(sampleFile);
			
			System.out.println("Reading Complete " + image);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		return image;
	}
	
	private static void writeToFile(BufferedImage image) {
		try {
			File output = new File("/Users/Yudzilla/Desktop/output.png");
			
			ImageIO.write(image, "png", output);
			
			System.out.println("Writing Complete");
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}