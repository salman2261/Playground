#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,temp=0;
  std::cin>>r>>c;
  int ar[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>ar[i][j];
    }
  }
  for(i=0;i<c;i++)
  {
    temp=ar[0][i];
    for(j=1;j<r;j++)
    {
      if(temp<ar[j][i])
      {
        temp=ar[j][i];
      }
    }
    std::cout<<temp<<"\n";
  }
      
}