#include<iostream>
int main()
{
int n,i,sum=6;
std::cin>>n;
for(i=0;i<n;i++)
{
  if(i==0)
  {
    std::cout<<sum<<" ";
  }
  else
  {
  	sum=sum+ 5*i;
    std::cout<<sum<<" ";
  }
}
}