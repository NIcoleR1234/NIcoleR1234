#pragma once
#include <iostream>
using namespace std;

class Bayes
{
public:
	double perPop, testAcc, falPos;
	Bayes(double p, double t, double f)
	{
		perPop = p;
		testAcc = t;
		falPos = f;
	}

	double disAndPos()
	{
		return (perPop * testAcc) / ((perPop * testAcc) + ((1 - perPop) * falPos));
	}
	double disAndNeg()
	{
		return (perPop * (1-testAcc) / ((perPop * (1-testAcc)) + (1 - perPop) * (1 - falPos)));
	}
	double noDisAndPos()
	{
		return ((1 - perPop) * falPos) / ((perPop * testAcc) + ((1 - perPop) * falPos));
	}
	double noDisAndNeg()
	{
		return ((1-perPop) * (1 - falPos) / ((perPop * (1-testAcc)) + (1 - perPop) * (1 - falPos)));
	}

};
