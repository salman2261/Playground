#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,sum=0;
  std::cin>>r>>c;
  int ar[r][c];
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
      sum=sum+ar[i][j];
    }
    std::cout<<sum<<"\n";
    sum=0;
  }
  
  //Type your code here.
}