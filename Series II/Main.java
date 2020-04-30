#include<iostream>
int main()
{
  int n,i,sum=0,sum1=121;
  std::cin>>n;
  std::cout<<"121"<<" ";
  for(i=3;i<=n+1;i++)
  {
    sum= 8 + (i*32);
    sum1=sum1+sum;
    std::cout<<sum1<<" ";
  }
}
  
    
    