/*
CPS 271 MP3
Nicole Ramanathan
*/
#include <iostream>
#include <string>
#include "Fraction.h"

using namespace std;

int main()
{
	string action = "0";
	Fraction x, y, z;
	double dz;
	int wh, amount = 2;
	float fz;
	bool tz;
	do {

        cout << "\nWould you like to (+), (-), (*), (/), \n "<< 
			"(+=), (-=), (*=), (/=),\n " <<
			"(<), (>), (<=), (>=), (==), (!=), (!)\n "<<
			" (-C), (~), (C++), (++C), (C--), (--C), (f), (d), (=)"<< "or quit (q or Q)? " << endl;
		cin >> action;
		
		if (action == "+")
		{
			
			cin >> x; cout << " + \n";  cin >> y; cout << endl;
			z = x + y;	cout << z;
		}
		else if (action == "-")
		{
			
			cin >> x;	cout << " - \n";  cin >> y; cout << endl;
			z = x - y; cout << z;
		}
			
		else if (action == "*")
		{
			
			cin >> x;	cout << " * \n";  cin >> y; cout << endl;
			z = x * y; cout << z;
		}
			
		else if (action == "/")
		{
			
			cin >> x;	cout << " / \n";  cin >> y; cout << endl;
			z = x / y; cout << z;
		}
		else if (action == "<")
		{
			
			cin >> x;	cout << " < \n";  cin >> y; cout << endl;
			tz = x < y;
			if (tz == true)
				cout << "true";
			else
				cout << "false";
		}
		else if (action == ">")
		{
			
			cin >> x;	cout << " > \n";  cin >> y; cout << endl;
			tz = x > y;
			if (tz == true)
				cout << "true";
			else
				cout << "false";
		}
		else if (action == "<=")
		{
			
			cin >> x;	cout << " <= \n";  cin >> y; cout << endl;
			tz = x <= y;
			if (tz == true)
				cout << "true";
			else
				cout << "false";
		}
		else if (action == ">=")
		{
			
			cin >> x;	cout << " >= \n";  cin >> y; cout << endl;
			tz = x >= y;
			if (tz == true)
				cout << "true";
			else
				cout << "false";
		}
		else if (action == "==")
		{
			
			cin >> x;	cout << "== \n";  cin >> y; cout << endl;
			tz = x == y;
			if (tz == true)
				cout << "true";
			else
				cout << "false";
		}
		else if (action == "!=")
		{
			
			cin >> x;	cout << " > \n";  cin >> y; cout << endl;
			tz = x != y;
			if (tz == true)
				cout << "true";
			else
				cout << "false";
		}
		else if (action == "!")
		{
			
			cin >> x;
			tz = !x;
			cout << tz;
		}
		else if (action == "-C")
		{

			cin >> x;
			z = -x;
			cout << z;
		}
		else if (action == "~")
		{

			cin >> x;
			z = ~x;
			cout << z;
		}
		else if (action == "C++")
		{

		cin >> x;
		z=x++;
		cout << "C:" << x << " Result:" << z;
		}
		else if (action == "++C")
		{

		cin >> x;
		z = ++x;
		cout << "C:" << x << " Result:" << z;
		}
		else if (action == "C--")
		{

		cin >> x;
		z= x--;
		cout << "C:" << x << " Result:" << z;
		}
		else if (action == "--C")
		{

		cin >> x;
		z=--x;
		cout << "C:" << x << " Result:" << z;
		}

		else if (action == "+=")
		{
			
			cin >> x;	cout << " += \n";  cin >> y; cout << endl;
			x += y;
			cout << x;
		}
		else if (action == "-=")
		{
			
		cin >> x;	cout << " -= \n";  cin >> y; cout << endl;
			x -= y;
			cout << x;
		}
		else if (action == "*=")
		{
		
		cin >> x;	cout << " *= \n";  cin >> y; cout << endl;
		x *= y;
		cout << x;
		}
		else if (action == "/=")
		{
		cout << " " << endl;
		cin >> x;	cout << " /= \n";  cin >> y; cout << endl;
		x /= y;
		cout << x;
		}
		else if (action == "f" || action=="F")
		{
		
		cin >> x; cout << endl;
		fz=float(x);
		cout << fz;
		}
		else if (action == "d" || action == "D")
		{
		
		cin >> x; cout << endl;
		dz = double(x);
		cout << dz;
		}
		else if (action == "=")
		{

		cin >> x;
		x=y;
		cout <<y;
		}
					
	} while (!(action=="q" || action =="Q" ));

	system("pause"); 
	return 0;
		
}
