import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
public class ImageOpen{

	private static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		//gets the image you specifically want to modify
		System.out.print("Please type in the directory of the image you want to change: ");
		String file = kb.next();
		BufferedImage image = null;
		int width, height;
		int[] pixels;
		File f = new File(file);

		try{
  			image = ImageIO.read(f);
		}catch(IOException e){
  			e.printStackTrace();
		}
			
		width = image.getWidth();
		height = image.getHeight();
		pixels = new int[width * height];

		//creates an array of the image's pixels
		int counter = 0;
		for(int x = 0; x < width; x++){
			for(int y = 0; y < height; y++){
				pixels[counter] = image.getRGB(x, y);
				counter++;
			}
		}
		counter = 0;

		//sets the RGB values
		int[] rgb = new int[3];
		rgb[0] = (pixels[0] >> 16) & 0xff;
		rgb[1] = (pixels[0] >> 8) & 0xff;
		rgb[2] = pixels[0] & 0xff;

		//prints out the RGB values
		System.out.print("R: " + rgb[0] + " G: " + rgb[1] + " B: " + rgb[2]);

		//calculates the RGB average
		int average = 0;
		for(int i = 0; i < rgb.length; i++){
			average += rgb[i];
		}
		average /= rgb.length;

		//subtracts the RGB average from the image's pixels
		for(int x = 0; x < width; x++){
			for(int y = 0; y < height; y++){
				image.setRGB(x, y, pixels[counter] - average);
				counter++;
			}
		}

		//
		try{
  			ImageIO.write(image, "png", f);
		}catch(IOException e){
  			e.printStackTrace();
		}
	}
}