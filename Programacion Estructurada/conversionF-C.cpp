#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <math.h>
#include <io.h>
#include <fcntl.h>
#include <time.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <string>
#include <iostream>
using namespace std;

float c, f;
void main() {
	cprintf("Introdusca los grados Farenhein: ");
	cin >> f;
	c = (float)5 / (float)9 * (f - 32);
	cprintf("los grados celcius son: %.10f", c);
}
