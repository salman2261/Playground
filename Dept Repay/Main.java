#include<iostream>
using namespace std;
int main()
{
  int x,r,y;
  cin>>x>>r>>y;
  int intr=(x*r*y)/100;
  int amnt=x+intr;
  float dis=(2.0/100)*intr;
  float fin=amnt-dis;
  cout<<intr<<"\n"<<amnt<<"\n"<<dis<<"\n"<<fin;
  
}