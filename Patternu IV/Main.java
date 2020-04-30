#include <iostream>
using namespace std;
int main() {
  int n,i,j,temp=0;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=n;j++)
    {
      if(i%2==1 && j==n)
      {
        temp= i+1;
        std::cout<<temp;
        temp=0;
      }
      else if(i%2==0 && j==1)
      {
        temp= i+j;
        std::cout<<temp;
        temp=0;
      }
      else
      {
        std::cout<<i;
      }
    }
    std::cout<<"\n";
  }
      
      
      
      
    // Type your code here
    return 0;
}