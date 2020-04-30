#include<iostream>
using namespace std;
int main()
{
  int a,b,c,m=0,n=0,sum=0;
  std::cin>>a>>b>>c;
  m= b*75;
  n=c*30;
  sum=m+n;
  if(sum>a)
    std::cout<<"Boat will drow";
  else
    std::cout<<"Boat is stable";
}
  
  //Type your code here.
