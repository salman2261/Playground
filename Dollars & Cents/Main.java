#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,sum=0,sum1=0,rem=0,add=0,add1=0;
  std::cin>>a>>b>>c>>d;
  sum=a+c;
  sum1=b+d;
  rem= sum1 % 100;
  add= (sum1-rem)/100;
  add1=add+sum;
  std::cout<<add1<<"\n"<<rem;
  
  //Type your code here.
}