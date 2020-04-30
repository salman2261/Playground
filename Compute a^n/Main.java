#include<iostream>
using namespace std;
int pow(int x,int y)
{
  if(y!=0)
  {
    return x*pow(x,y-1);
  }
  else
  {
    return 1;
  }
}
	
int main()
{
  int a,n,i;
  std::cin>>a>>n;
  i=pow(a,n);
  std::cout<<"Enter the value of a"<<"\n";
  std::cout<<"Enter the value of n"<<"\n";
  std::cout<<"The value of "<<a<<" power "<<n<<" is "<<i;
  return 0;
  
}