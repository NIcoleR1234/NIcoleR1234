#include "Bayes.h"
#include <string>

int main()
{
	Bayes sc2(.06, .92, .27);
	cout << "No disease if positive: "<< sc2.noDisAndPos()*100 << "%"<< endl;
	cout << "Disease if positive: " << sc2.disAndPos() * 100 << "%" << endl;
	cout << "No disease if negative: " << sc2.noDisAndNeg() * 100 << "%" << endl;
	cout << "Disease if positive: " << sc2.disAndNeg() * 100 << "%" << endl;
	cout << sc2.noDisAndPos()+sc2.disAndPos() << endl<< sc2.noDisAndNeg()+ sc2.disAndNeg() << endl;
}
