/*
CPS 271 MP3
Nicole Ramanathan
*/
#include <iostream>
#include <cmath>

using namespace std;

#include "Fraction.h"

Fraction::Fraction()
{
	nume = 0;
	denom = 1;
}

Fraction::Fraction(int n, int d)
{
	if (d <= 0)
		d = 1;
	nume = n;
	denom = d;
	this->reduce();
	
}

Fraction::Fraction(double n)
{
	denom = 100000;
	n *= (double)denom;
	nume = (long)n;
	reduce();
}

Fraction::Fraction(const Fraction& f)
{
	nume = f.nume;
	denom = f.denom;
	reduce();
}


void Fraction::reduce()
{

	bool divided = false;
	int min = 0;
	
	if (nume < 0)
		min = -nume;
	else
		min = nume;
	if (denom <= min)
		min = denom;



	for (int i = min; i > 0 && divided == false; i--)
	{
		if (nume % i == 0 && denom % i == 0)
		{
			divided = true;
			nume = nume / i;
			denom = denom / i;

		}
	}

	if (nume == 0)
		denom = 1;
	
}
istream& operator>>(istream& iout, Fraction& f)
{
	char div, again = 1;

	while (again)
	{
		cout << "Enter NN/DD: ";
		cin >> f.nume >> div >> f.denom;

		if (f.denom <= 0)
		{
			cout << "Denominator must be > 0, try again" << endl;
			continue;
		}
		again = 0;
		
	}
	
	return iout;
}

ostream& operator<<(ostream& out, const Fraction& f)
{
	out << f.nume << "/" << f.denom;
	return out;
}

Fraction Fraction::add(const Fraction& f) const
{
	Fraction r;

	r.nume = (nume * f.denom) + (denom * f.nume);
	r.denom = (denom * f.denom);
	r.reduce();
	return r;
}

Fraction Fraction::sub(const Fraction& f) const
{
	Fraction r;

	r.nume = (nume * f.denom) - (denom * f.nume);
	r.denom = (denom * f.denom);
	r.reduce();
	return r;
}

Fraction Fraction::multi(const Fraction& f) const
{
	Fraction r;

	r.nume = (nume * f.nume);
	r.denom = (denom * f.denom);
	r.reduce();
	return r;
}

Fraction Fraction::divid(const Fraction& f) const
{
	Fraction r;

	r.nume = (nume * f.denom);
	r.denom = (denom * f.nume);
	if (r.denom < 0)
	{
		r.nume = -r.nume;
		r.denom = -r.denom;
	}
	else if (r.denom == 0)
	{
		cout << "Error: denominator cannot be zero. The denominator has been reset to 1.";
		r.denom = 1;
	}
	r.reduce();
	return r;
}

Fraction Fraction::operator+(const Fraction& rhs)
{
	Fraction r;
	r = this->add(rhs);
	return r;
}

Fraction Fraction::operator-(const Fraction& rhs)
{
	Fraction r;
	r = this->sub(rhs);
	return r;
}

Fraction Fraction::operator*(const Fraction& rhs)
{
	Fraction r;
	r = this->multi(rhs);
	return r;

}
Fraction Fraction::operator/(const Fraction& rhs)
{
	Fraction r;
	r = this->divid(rhs);
	return r;
}
Fraction Fraction::operator+=(const Fraction& rhs)
{
	nume = nume*rhs.denom + rhs.nume*denom;
	denom = denom * rhs.denom;
	reduce();
	return *this;
}

Fraction Fraction::operator-=(const Fraction& rhs)
{
	nume = nume*rhs.denom - rhs.nume*denom;
	denom = denom * rhs.denom;
	reduce();
	return *this;
}
Fraction Fraction::operator*=(const Fraction& rhs)
{
	nume = nume * rhs.nume;
	denom = denom * rhs.denom;
	reduce();
	return *this;
}
Fraction Fraction::operator/=(const Fraction& rhs)
{
	nume = (nume * rhs.denom);
	denom = (denom * rhs.nume);
	if (denom < 0)
	{
		nume = -nume;
		denom = -denom;
	}
	else if (denom == 0)
	{
		cout << "Error: denominator cannot be zero. The denominator has been reset to 1.";
		denom = 1;
	}
	reduce();
	return *this;
}


Fraction::operator float() const
{
	float f;
	f = (float)nume / (float)denom;
	return f;
}
Fraction::operator double() const
{
	double d;
	d = (double)nume / (double)denom;
	return d;
}

bool Fraction::operator<(const Fraction& rhs) const
{
	double leftSide = (double)nume / denom;
	double rightSide = (double)rhs.nume / rhs.denom;
	bool b = leftSide < rightSide;
	return b;
}
bool Fraction::operator>(const Fraction& rhs) const
{
	double leftSide = (double)nume / denom;
	double rightSide = (double)rhs.nume / rhs.denom;
	bool b = leftSide > rightSide;
	return b;
}
bool Fraction::operator<=(const Fraction& rhs) const
{
	double leftSide = (double)nume / denom;
	double rightSide = (double)rhs.nume / rhs.denom;
	bool b = leftSide <= rightSide;
	return b;
}
bool Fraction::operator>=(const Fraction& rhs) const
{
	double leftSide = (double)nume / denom;
	double rightSide = (double)rhs.nume / rhs.denom;
	bool b = leftSide >= rightSide;
	return b;
}
bool Fraction::operator==(const Fraction& rhs) const
{
	double leftSide = (double)nume / denom;
	double rightSide = (double)rhs.nume / rhs.denom;
	bool b = leftSide == rightSide;
	return b;
}
bool Fraction::operator!=(const Fraction& rhs) const
{
	double leftSide = (double)nume / denom;
	double rightSide = (double)rhs.nume / rhs.denom;
	bool b = leftSide != rightSide;
	return b;
}
bool &Fraction::operator!() const
{
	bool b = !nume;
	return b;
}

Fraction &Fraction::operator-()
{
	nume = -nume;
	reduce();
	return *this;
}
Fraction &Fraction::operator~()
{
	int tmp;
	tmp = denom;
	denom = nume;
	nume = tmp;
	if (denom < 0)
	{
		nume = -nume;
		denom = -denom;
	}
	else if (denom == 0)
	{
		cout << "Error: denominator cannot be zero. The denominator has been reset to 1.";
		denom = 1;
	}
	reduce();
	return *this;
}
Fraction &Fraction::operator++()
{
//++i
	nume = nume + denom;
	reduce();
	return *this;
	
}
Fraction Fraction::operator++(int)
{//i++
	reduce();
	Fraction tmp = *this;
	nume = nume + denom;
	return tmp; 
}
Fraction &Fraction::operator--()
{//--i
	nume = nume - denom;
	reduce();
	return *this;
}
Fraction Fraction::operator--(int)
{//i--
	reduce();
	Fraction tmp = *this;
	nume = nume - denom;
	return tmp;
}

Fraction& Fraction::operator=(const Fraction& rhs)
{
	if (*this != rhs)
	{
		nume = rhs.nume;
		denom = rhs.denom;
	}
	reduce();
	return *this;
}

