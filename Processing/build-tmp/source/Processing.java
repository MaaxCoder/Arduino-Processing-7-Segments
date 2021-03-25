import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.serial.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Processing extends PApplet {



Serial myPort;

int tslx = 105, tsly = 25;
int compteur = 0;

int A = 0xffFFFFFF;
int B = 0xffFFFFFF;
int C = 0xffFFFFFF;
int D = 0xffFFFFFF;
int E = 0xffFFFFFF;
int F = 0xffFFFFFF;
int G = 0xffFFFFFF;
int DP = 0xffFFFFFF;

public void setup() {
	
	myPort = new Serial(this, Serial.list()[0], 9600);
	
}

// mouseX > _ && mouseX < _ && mouseY > _ && mouseY < _

public void draw() {

	translate(105, 25);
	fill(F);
	rect(0, 0, 50, 285); // F
	fill(A);
	rect(50+30, 0, 240, 50); // A
	fill(B);
	rect(50+30+240+30, 0, 50, 285); // B
	fill(E);
	rect(0, 285+30, 50, 285); // E
	fill(C);
	rect(50+30+240+30, 285+30, 50, 285); // C
	fill(D);
	rect(50+30, 285+30+285-50, 240, 50); // D
	fill(G);
	rect(50+30, 275, 240, 50); // G
	fill(DP);
	ellipseMode(CORNER);
	ellipse(50+30+240+30+50+30, 285+30+285-50, 50, 50); // DP



	if (mouseX > tslx && mouseX < 50+ tslx && mouseY > tsly && mouseY < tsly+285) {
		cursor(HAND);
		if (mousePressed == true && mouseButton == LEFT && F == 0xffFFFFFF) {
			F = 0xffFF0000;
			myPort.write("f");
		}
		if (mousePressed == true && mouseButton == RIGHT && F == 0xffFF0000) {
			F = 0xffFFFFFF;
			myPort.write("f");
		}
	} // F
	else if (mouseX > tslx + 50 + 30  && mouseX < tslx + 50 + 30 + 240 && mouseY > tsly && mouseY < tsly + 50) {
		cursor(HAND);
		if (mousePressed == true && mouseButton == LEFT && A == 0xffFFFFFF) {
			A = 0xffFF0000;
			myPort.write("a");
		}
		if (mousePressed == true && mouseButton == RIGHT && A == 0xffFF0000) {
			A = 0xffFFFFFF;
			myPort.write("a");
		}
	} // A
	else if (mouseX > tslx + 50 + 30 + 240 + 30 && mouseX < tslx + 50 + 30 + 240 + 30 + 50 && mouseY > tsly && mouseY <tsly + 285) {
		cursor(HAND);
		if (mousePressed == true && mouseButton == LEFT && B == 0xffFFFFFF) {
			B = 0xffFF0000;
			myPort.write("b");
		}
		if (mousePressed == true && mouseButton == RIGHT && B == 0xffFF0000) {
			B = 0xffFFFFFF;
			myPort.write("b");
		}
	} // B
	
	else if (mouseX > tslx + 50 + 30 && mouseX < tslx + 50 + 30 + 240 && mouseY > tsly + 285 + 30 - 50 && mouseY < tsly + 285 + 30) {
		cursor(HAND);
		if (mousePressed == true && mouseButton == LEFT && G == 0xffFFFFFF) {
			G = 0xffFF0000;
			myPort.write("g");
		}
		if (mousePressed == true && mouseButton == RIGHT && G == 0xffFF0000) {
			G = 0xffFFFFFF;
			myPort.write("g");
		}
	} //G
	else if (mouseX > tslx && mouseX < tslx + 50 && mouseY > tsly + 285 + 30 && mouseY < tsly + 285 + 30 + 285) {
		cursor(HAND);
		if (mousePressed == true && mouseButton == LEFT && E == 0xffFFFFFF) {
			E = 0xffFF0000;
			myPort.write("e");
		}
		if (mousePressed == true && mouseButton == RIGHT && E == 0xffFF0000) {
			E = 0xffFFFFFF;
			myPort.write("e");
		}
	} // E
	else if (mouseX > tslx + 50 + 30 && mouseX < tslx + 50 + 30 + 240 && mouseY > tsly + 285 + 30 + 285 - 50 && mouseY < tsly + 285 + 30 + 285) {
		cursor(HAND);
		if (mousePressed == true && mouseButton == LEFT && D == 0xffFFFFFF) {
			D = 0xffFF0000;
			myPort.write("d");
		}
		if (mousePressed == true && mouseButton == RIGHT && D == 0xffFF0000) {
			D = 0xffFFFFFF;
			myPort.write("d");
		}
	} // D
	else if (mouseX > tslx + 50 +30 +240 + 30 && mouseX < tslx + 50 +30 +240 + 30 + 50 && mouseY > tsly + 285 + 30 && mouseY < tsly + 285+ 30 +285) {
		cursor(HAND);
		if (mousePressed == true && mouseButton == LEFT && C == 0xffFFFFFF) {
			C = 0xffFF0000;
			myPort.write("c");
		}
		if (mousePressed == true && mouseButton == RIGHT && C == 0xffFF0000) {
			C = 0xffFFFFFF;
			myPort.write("c");
		}
	} // C
	else if (mouseX > tslx + 50 + 30 + 240 + 30 + 50 + 30 && mouseX < tslx + 50 + 30 + 240 + 30 + 50 + 30 + 50 && mouseY > tsly + 285 + 30 + 285 - 50 && mouseY < tsly + 285 + 30 + 285) {
		cursor(HAND);
		if (mousePressed == true && mouseButton == LEFT && DP == 0xffFFFFFF) {
			DP = 0xffFF0000;
			myPort.write("p");
		}
		if (mousePressed == true && mouseButton == RIGHT && DP == 0xffFF0000) {
			DP = 0xffFFFFFF;
			myPort.write("p");
		}
	} // DP
	else {
		cursor(ARROW);
	
}	
}
  public void settings() { 	size(610, 650); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Processing" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
