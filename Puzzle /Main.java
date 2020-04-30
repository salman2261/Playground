#include<iostream>
int main()
{
  int r,c,i,j;
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
    for(j=0;j<r;j++)
    {
      std::cout<<ar[j][i]<<" ";
    }
    printf("\n");
  }
  
    // Type your code here
}