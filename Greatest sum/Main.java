#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,sum=0,c1=1,temp=0,sum1=0,c2=1,temp1=0;
  std::cin>>r>>c;
  int ar[r][c];
  int ra[r],ca[c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>ar[i][j];
    }
  }
  std::cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      sum=sum+ar[i][j];
    }
    std::cout<<sum<<" ";
    ra[i]=sum;
    sum=0;
  }
  std::cout<<"\n";
  temp=ra[0];
  for(i=1;i<r;i++)
  {
    if(temp<ra[i])
    {
      temp=ra[i];
      c1++;
    }
    
  }
  std::cout<<"Row "<<c1<<" has maximum sum\n";
  std::cout<<"Sum of columns is ";
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
      sum1=sum1+ar[j][i];
    }
    std::cout<<sum1<<" ";
    ca[i]=sum1;
    sum1=0;
  }
  std::cout<<"\n";
  temp1=ca[0];
  for(i=1;i<c;i++)
  {
    if(temp1<ca[i])
    {
      temp1=ca[i];
      c2++;
    }
    
  }
  std::cout<<"Column "<<c2<<" has maximum sum";
  
  //Type your code here.
}