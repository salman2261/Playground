#include<iostream>
using namespace std;
int main()
{
  int n,sum=121,i,sum1=0;
  std::cin>>n;
  std::cout<<sum<<" ";
  for(i=3;i<=n+1;i++)
  {
    sum1= 8+(i*32);
    sum=sum+sum1;
    std::cout<<sum<<" ";
  }
    
  //Type your code here.
}