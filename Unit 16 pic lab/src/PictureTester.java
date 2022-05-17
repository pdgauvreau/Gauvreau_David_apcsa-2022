/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
	public static void testBackgroundSwap()
	  {
	    	Picture mark = new Picture("blue-mark.jpg");
	    	Picture moon = new Picture("moon-surface.jpg");
	    	mark.backgroundSwap(moon);  //replace blue pixels in mark with pixels in moon
						    //replace pixels containing the logo on the t-shirt
	   	mark.explore();
	  }

	 public static void testZeroBlue()
	  {
	    Picture beach = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/beach.jpg");
	    beach.explore();
	    beach.zeroBlue();
	    beach.explore();
	  }
	  
	  public static void testKeepOnlyBlue()
	  {
		  Picture beach = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/beach.jpg");
		  beach.explore();
		  beach.keepOnlyBlue();
		  beach.explore();
	  }
	  
	  public static void testKeepOnlyRed()
	  {
		  Picture beach = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/beach.jpg");
		  beach.explore();
		  beach.keepOnlyRed();
		  beach.explore();
	  }
	  
	  public static void testKeepOnlyGreen()
	  {
		  Picture beach = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/beach.jpg");
		  beach.explore();
		  beach.keepOnlyGreen();
		  beach.explore();
	  }
	  
	  public static void testNegate()
	  {
		  Picture beach = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/beach.jpg");
		  beach.explore();
		  beach.negate();
		  beach.explore();
	  }
	  
	  public static void testGrayscale()
	  {
		  Picture beach = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/beach.jpg");
		  beach.explore();
		  beach.grayscale();
		  beach.explore();
	  }
	  
	  public static void testFixUnderwater()
	  {
		 Picture water = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/water.jpg");
		 water.explore();
		 water.fixUnderwater();
		 water.explore();
	  }
	  
	  /** Method to test mirrorVertical */
	  public static void testMirrorVertical()
	  {
	    Picture caterpillar = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorVertical();
	    caterpillar.explore();
	  }
	  
	  public static void testMirrorHorizontal()
	  {
		  Picture caterpillar = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/caterpillar.jpg");
		  caterpillar.explore();
		  caterpillar.mirrorHorizontal();
		  caterpillar.explore();
	  }
	  
	  public static void testMirrorDiagonal()
	  {
		  Picture caterpillar = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/caterpillar.jpg");
		  caterpillar.explore();
		  caterpillar.mirrorDiagonal();
		  caterpillar.explore();
	  }
	  
	  /** Method to test mirrorTemple */
	  public static void testMirrorTemple()
	  {
	    Picture temple = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/temple.jpg");
	    temple.explore();
	    temple.mirrorTemple();
	    temple.explore();
	  }
	  
	  public static void testMirrorArms()
	  {
	    Picture arms = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/snowman.jpg");
	    arms.explore();
	    arms.mirrorArms();
	    arms.explore();
	  }
	  
	  public static void testMirrorGull()
	  {
	    Picture gull = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/seagull.jpg");
	    gull.explore();
	    gull.mirrorGull();
	    gull.explore();
	  }
	  
	  /** Method to test the collage method */
	  public static void testCollage()
	  {
	    Picture canvas = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/640x480.jpg");
	    canvas.explore();
	    canvas.createCollage();
	    canvas.explore();
	  }
	  
	  public static void testCopy()
	  {
		  Picture canvas = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/640x480.jpg");
		  canvas.copy(new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/kitten2.jpg"), 100, 100, 150, 150, 50, 50);
		  canvas.explore();
	  }
	  
	  /** Method to test edgeDetection */
	  public static void testEdgeDetection()
	  {
	    Picture swan = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/swan.jpg");
	    swan.explore();
	    swan.edgeDetection(10);
	    swan.explore();
	  }
	  
	  public static void testEdgeDetection2()
	  {
		  Picture swan = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/swan.jpg");
		  swan.explore();
		  swan.edgeDetection2(20);
		  swan.explore();
	  }
	  
	  public static void testEnD()
	  {
		  Picture beach = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/beach.jpg");
		  Picture msg = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/appleicon.jpg");
		  beach.encode(msg);
		  beach.explore();
		  beach.decode().explore();
	  }
	  
	  public static void testEncodeAndDecode()
	  {
		  Picture beach = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/beach.jpg");
		  Picture msg = new Picture("/Users/PdGau/OneDrive/Documents/GitHub/Gauvreau_David_apcsa-2022/Unit 16 pic lab/src/images/flower1.jpg");
		  beach.explore();
		  beach.redSumEncoder(msg);
		  beach.explore();
		  beach.RedSumDecoder().explore();
	  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    
  }
}