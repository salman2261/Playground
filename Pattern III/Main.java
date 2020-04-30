#include<iostream>
int main()
{
  int n,i,j;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(i==1 && j==1)
        std::cout<<i;
      else
      {
        if(i!=j)
        std::cout<<i<<"*";
        else
          std::cout<<i;
      }
    }
    std::cout<<"\n";
  }
  for(i=n;i>=1;i--)
  {
    for(j=i;j>=1;j--)
    {
      if(j==1)
         std::cout<<i;
      else
      std::cout<<i<<"*";
    }
    std::cout<<"\n";
  }
}
