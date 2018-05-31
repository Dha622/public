//connect4.cpp
//david anderson
//8/19/13
//playing the connect 4 game.


#include <iostream>
#include <string>
#include <iomanip>
#include "connect4.h"

using namespace std;

connect4::connect4()
{
   for(int r=0; r<4; r++){
      for(int c=0; c<4; c++){
	 game[r][c] = 0;
      }
   }
}

void connect4::output()
{
   cout << "+   +   +   +   +" << endl;
   for(int r=0; r<4; r++){
      cout << "|";
      for(int c=0; c<4; c++){
	 cout << setw(3) << game[r][c] << "|";
      }
      cout << endl << "+---+---+---+---+" << endl;
   }
   cout << endl;
}

void connect4::play(int move, int player)
{


   for(int x=1; x<5; x++)
   {
      if(move == x)
      {
	 for(int a=3; a>=0; a=a-1)
	 {
	    if(a == 0)
	    {
	       game[0][a] = player;
	       a = -1;
	    } 
	 }
      }

   }

}
