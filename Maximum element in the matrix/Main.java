#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,temp=0;
  std::cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  temp=a[0][0];
  for(i=0;i<r;i++)
  {
    for(j=1;j<c;j++)
    {
      if(temp<=a[i][j])
      {
        temp=a[i][j];
      }
    }
  }
  std::cout<<"The maximum element is "<<temp;
  //Type your code here.
}