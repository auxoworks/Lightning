

void setup()
{
	background (0,0,0);
	size(300,300);
	strokeWeight(1);
	noLoop();

}

void draw()
{

noStroke();
fill(200,200,200);
ellipse(30,150,15,15);
quad(0,142.5,0,157.5,30,152,30,148);
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

void mousePressed()
{
redraw();
int startX=30;
int startY=150;
int endX=30;
int endY=150;
}

void mouseClicked()
{
}

