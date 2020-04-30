#include<iostream>
int main()
{
  int n,i;
  float sum=0.5;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i==1)
    {
      std::cout<<sum<<" ";
    }
    else
    {
      sum=sum*3;
      std::cout<<sum<<" ";
    }
  }
}