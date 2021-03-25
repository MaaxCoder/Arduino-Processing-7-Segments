char cara[8] =    {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'p'};
int pin[8] =      { 2,   3,   4,   5,   6,   7,   8,   9};
boolean etat[8] = { 1,   1,   1,   1,   1,   1,   1,   1};

// GF AB
// -----
// -----
// DE C.

void setup()
{
    Serial.begin(9600);
    for(int i=0; i<8; i++)
    {
        pinMode(pin[i], OUTPUT);
    }
}

void loop()
{
    if (Serial.available() > 0)
    {
        char derCara = Serial.read();

        for(int i=0; i<8; i++)
        {
            if (derCara == cara[i])
            {
                digitalWrite(pin[i], etat[i]);
                etat[i] = !etat[i];
            }
            
        }
        
        
        
    }
    
}