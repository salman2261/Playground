#include<iostream>
using namespace std;
int main()
{
  int n,sum=0;
  std::cin>>n;
  if(n<=200)
  {
    sum=n*0.5;
    std::cout<<"Rs."<<sum;
  }
  else if(n>200 && n<=400)
  {
    sum=n*0.65 + 100;
    std::cout<<"Rs."<<sum;
  }
  else if(n>400 && n<=600)
  {
    sum=n*0.8 + 200;
    std::cout<<"Rs."<<sum;
  }
  else
  {
    sum=n*1.25 + 425;
    std::cout<<"Rs."<<sum;
  }
    
  //Type your code here.
}