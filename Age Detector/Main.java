#include<iostream>
using namespace std;
int main()
{
  int a,b;
  int sum=0;
  std::cin>>a>>b;
  if(a>b)
  {
    a=a+1900;
    b=b+2000;
    sum=b-a;
    std::cout<<sum;
  }
  else
  {
    sum=b-a;
    std::cout<<sum;
  }
  
  
  
  
  //Type your code here.
}