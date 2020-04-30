#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,sum=0;
  std::cin>>r>>c;
  int ar[r][c];
  for(i=1;i<=r;i++)
  {
    for(j=1;j<=c;j++)
    {
      std::cin>>ar[i][j];
    }
  }
  for(i=1;i<=r;i++)
  {
    for(j=1;j<=c;j++)
    {
      if(i==1 || i==r || i==j)
      {
        sum=sum+ar[i][j];
      }
    }
  }
  std::cout<<"Sum of Zig-Zag pattern is "<<sum;
  
  //Type your code here.
}