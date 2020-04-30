#include<iostream>
using namespace std;
int main()
{
  int r,c,j,i;
  std::cin>>r>>c;
  int ar[r][c],br[r][c],cr[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>ar[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>br[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cr[i][j]=ar[i][j]+br[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cout<<cr[i][j]<<" ";
    }
    std::cout<<"\n";
  }
  
  //Type your code here.
}