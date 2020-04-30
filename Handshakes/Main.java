#include<iostream>
using namespace std;
int main()
{
  int n,i,j,c=0;
  std::cin>>n;
  for(i=1;i<n;i++)
  {
    for(j=i;j<n;j++)
    {
      c=c+1;
    }
  }
  std::cout<<c;
  //Type your code here.
}