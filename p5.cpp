//david anderson
//10/10/13
//takes a number and converts is to a double
//

#include <iostream>
#include <string>
#include <stack> 
#include <queue> 

using namespace std;
string toDouble(string num);


int main()
{
   cout << toDouble("6") << endl; //6.000000
   cout << toDouble("7,000,000") << endl; //7000000.000000
   cout << toDouble(" $$$7 000 000 ") << endl; //7000000.000000
   cout << toDouble("5,678.13") << endl; //5678.130000
   cout << toDouble("0.25") << endl; //0.250000
   cout << toDouble(" .25") << endl; //0.250000
   cout << toDouble("-8.96") << endl; //-8.960000

   return 0;
}


string toDouble(string num)
{
   queue<double> q;
   stack<double> l;


   for(int x=0; x<num.length(); x++)
   {
	int num1 = (int)num[x] - 48;
      if( num1 >= 0 || num1 <= 9 ){
	 if(num[x] == "."){
	    q.push_back(num[x]);
	    q.push_back(num[x+1]);
	    q.push_back(num[x+2]);
	    x = num.length();
	 }
	 else
	    l.push_back(num[x]);


      }
   }

   decimal = num.find(".");
   int stack=1;
   int queue=1;
  
   for(int x = (decimal - 1); x >=0; x--)
{

}


   return num;

}

