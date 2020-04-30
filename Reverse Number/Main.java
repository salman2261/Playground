#include <iostream>
int main() 
{
  int n,rem=0,sum=0;
  std::cin>>n;
  while(n>0)
  {
    rem=n%10;
    sum=sum*10+rem;
    n=n/10;
  }
  std::cout<<sum;
	// Type your code here
	return 0;
}