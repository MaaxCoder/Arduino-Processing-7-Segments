import processing.serial.*;

Serial myPort;

int tslx = 105, tsly = 25;
int compteur = 0;

color A = #FFFFFF;
color B = #FFFFFF;
color C = #FFFFFF;
color D = #FFFFFF;
color E = #FFFFFF;
color F = #FFFFFF;
color G = #FFFFFF;
color DP = #FFFFFF;

void setup() {
	size(610, 650);
	myPort = new Serial(this, Serial.list()[0], 9600);
	
}

// mouseX > _ && mouseX < _ && mouseY > _ && mouseY < _

void draw() {

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
		if (mousePressed == true && mouseButton == LEFT && F == #FFFFFF) {
			F = #FF0000;
			myPort.write("f");
		}
		if (mousePressed == true && mouseButton == RIGHT && F == #FF0000) {
			F = #FFFFFF;
			myPort.write("f");
		}
	} // F
	else if (mouseX > tslx + 50 + 30  && mouseX < tslx + 50 + 30 + 240 && mouseY > tsly && mouseY < tsly + 50) {
		cursor(HAND);
		if (mousePressed == true && mouseButton == LEFT && A == #FFFFFF) {
			A = #FF0000;
			myPort.write("a");
		}
		if (mousePressed == true && mouseButton == RIGHT && A == #FF0000) {
			A = #FFFFFF;
			myPort.write("a");
		}
	} // A
	else if (mouseX > tslx + 50 + 30 + 240 + 30 && mouseX < tslx + 50 + 30 + 240 + 30 + 50 && mouseY > tsly && mouseY <tsly + 285) {
		cursor(HAND);
		if (mousePressed == true && mouseButton == LEFT && B == #FFFFFF) {
			B = #FF0000;
			myPort.write("b");
		}
		if (mousePressed == true && mouseButton == RIGHT && B == #FF0000) {
			B = #FFFFFF;
			myPort.write("b");
		}
	} // B
	
	else if (mouseX > tslx + 50 + 30 && mouseX < tslx + 50 + 30 + 240 && mouseY > tsly + 285 + 30 - 50 && mouseY < tsly + 285 + 30) {
		cursor(HAND);
		if (mousePressed == true && mouseButton == LEFT && G == #FFFFFF) {
			G = #FF0000;
			myPort.write("g");
		}
		if (mousePressed == true && mouseButton == RIGHT && G == #FF0000) {
			G = #FFFFFF;
			myPort.write("g");
		}
	} //G
	else if (mouseX > tslx && mouseX < tslx + 50 && mouseY > tsly + 285 + 30 && mouseY < tsly + 285 + 30 + 285) {
		cursor(HAND);
		if (mousePressed == true && mouseButton == LEFT && E == #FFFFFF) {
			E = #FF0000;
			myPort.write("e");
		}
		if (mousePressed == true && mouseButton == RIGHT && E == #FF0000) {
			E = #FFFFFF;
			myPort.write("e");
		}
	} // E
	else if (mouseX > tslx + 50 + 30 && mouseX < tslx + 50 + 30 + 240 && mouseY > tsly + 285 + 30 + 285 - 50 && mouseY < tsly + 285 + 30 + 285) {
		cursor(HAND);
		if (mousePressed == true && mouseButton == LEFT && D == #FFFFFF) {
			D = #FF0000;
			myPort.write("d");
		}
		if (mousePressed == true && mouseButton == RIGHT && D == #FF0000) {
			D = #FFFFFF;
			myPort.write("d");
		}
	} // D
	else if (mouseX > tslx + 50 +30 +240 + 30 && mouseX < tslx + 50 +30 +240 + 30 + 50 && mouseY > tsly + 285 + 30 && mouseY < tsly + 285+ 30 +285) {
		cursor(HAND);
		if (mousePressed == true && mouseButton == LEFT && C == #FFFFFF) {
			C = #FF0000;
			myPort.write("c");
		}
		if (mousePressed == true && mouseButton == RIGHT && C == #FF0000) {
			C = #FFFFFF;
			myPort.write("c");
		}
	} // C
	else if (mouseX > tslx + 50 + 30 + 240 + 30 + 50 + 30 && mouseX < tslx + 50 + 30 + 240 + 30 + 50 + 30 + 50 && mouseY > tsly + 285 + 30 + 285 - 50 && mouseY < tsly + 285 + 30 + 285) {
		cursor(HAND);
		if (mousePressed == true && mouseButton == LEFT && DP == #FFFFFF) {
			DP = #FF0000;
			myPort.write("p");
		}
		if (mousePressed == true && mouseButton == RIGHT && DP == #FF0000) {
			DP = #FFFFFF;
			myPort.write("p");
		}
	} // DP
	else {
		cursor(ARROW);
	
}	
}