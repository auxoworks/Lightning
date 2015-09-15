import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {



public void setup()
{
	background (0,0,0);
	size(300,300);
	strokeWeight(1);
	noLoop();

}

public void draw()
{

noStroke();
fill(200,200,200);
ellipse(30,150,15,15);
quad(0,142.5f,0,157.5f,30,152,30,148);
rect(5,137,5,30);
rect(15,140,5,20);
int startX=30;
int startY=150;
int endX=30;
int endY=150;
	
stroke ((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));

while(endX<300){
endX=startX+(int)(Math.random()*10);
endY=startY+(int)((Math.random()*10)-5);
line(startX,startY,endX,endY);	

startX=endX;
startY=endY;



}
}

public void mousePressed()
{
redraw();
int startX=30;
int startY=150;
int endX=30;
int endY=150;
}

public void mouseClicked()
{
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
