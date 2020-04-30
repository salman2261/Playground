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
  for(i=0;i<r;i++)
  {
    temp=ar[i][0];
    for(j=0;j<c;j++)
    {
      if(temp<=ar[i][j])
      {
        temp=ar[i][j];
      }
      
    }
    std::cout<<temp<<"\n";
      temp=0;
  }
  
  //Type your code here.
}