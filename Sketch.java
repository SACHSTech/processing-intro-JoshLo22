import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(300, 300);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 0, 153);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	
  rect(100, 200, 200, 200);  // Draw a square at (100, 200) with width 200 and height 200
  rect(210, 100, 20, 30);
  // Draw the triangle
  triangle(200, 100, 100, 200, 300, 200);
   rect(150, 250, 100, 100);
   
  }
  
  // define other methods down here.
}