/*
CPS 271 MP3
Nicole Ramanathan
*/
#pragma once
using namespace std;

class Fraction
{
private:
	int nume;
	int denom;
	void reduce();
	
public:
	
	Fraction();
	Fraction(const Fraction &f);
	Fraction(double irratio);
	Fraction(int n, int d=1);

	Fraction add(const Fraction &a) const;
	Fraction sub(const Fraction &a) const;
	Fraction multi(const Fraction &c) const;
	Fraction divid(const Fraction &c) const;
	
	Fraction operator+(const Fraction& right);
	Fraction operator-(const Fraction& right);
	Fraction operator*(const Fraction& right);
	Fraction operator/(const Fraction& right);

	Fraction operator+=(const Fraction& rhs);
	Fraction operator-=(const Fraction& rhs);
	Fraction operator*=(const Fraction& rhs);
	Fraction operator/=(const Fraction& rhs);

	operator float() const;
	operator double() const;

	bool operator<(const Fraction& rhs) const;
	bool operator>(const Fraction& rhs) const;
	bool operator<=(const Fraction& rhs) const;
	bool operator>=(const Fraction& rhs) const;
	bool operator==(const Fraction& rhs) const;
	bool operator!=(const Fraction& rhs) const;
	bool &operator!() const;

	Fraction& operator-();
	Fraction& operator~();
	Fraction operator++(int);
	Fraction& operator++();
	Fraction operator--(int);
	Fraction& operator--();

	Fraction& operator=(const Fraction& rhs);

	friend istream& operator>>(istream& iout, Fraction& f);
	friend std::ostream& operator<<(std::ostream& out, const Fraction& f);	
};
