#include<iostream>
int fact(int a)
{
  if(a==1 || a==0)
  {
    return 1;
  }
  else
    return a*fact(a-1);
}
  
  
int main()
{
  int n,b=0;
  std::cin>>n;
  b=fact(n);
  std::cout<<"The factorial of "<<n<<" is "<<b;
  //Type your code here.
}