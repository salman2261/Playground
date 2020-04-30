#include<iostream>
int main()
{
  int a,b,i,j;
  std::cin>>a>>b;
  int ar[a][b],br[a][b],cr[a][b];
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      std::cin>>ar[i][j];
    }
  }
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      std::cin>>br[i][j];
    }
  }
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      cr[i][j]=ar[i][j]+br[i][j];
    }
  }
  for(i=0;i<a;i++)
  {
    for(j=0;j<b;j++)
    {
      std::cout<<cr[i][j]<<" ";
    }
    std::cout<<"\n";
  }
  
    // Type your code here
}