#include<iostream>
using namespace std;
int main()
{
  int n,rem=0,sum=0,temp=0;
  std::cin>>n;
  temp=n;
  while(n>0)
  {
    rem=n%10;
    sum=sum+rem;
    n=n/10;
  }
  if(temp%sum==0)
  {
    std::cout<<"Harshad Number";
  }
  else
  {
    std::cout<<"Not Harshad Number";
  }
  //Type your code here.
}