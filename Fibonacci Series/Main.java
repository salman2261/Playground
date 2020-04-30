#include<iostream>
int fibo(int a)
{
  if((a==0)||(a==1))
     return a;
    else
     return (fibo(a-1)+fibo(a-2));
}
int main()
{
  int n,b;
  std::cin>>n;
  b=fibo(n-1);
  std::cout<<"The term "<<n<<" in the fibonacci series is "<<b;
  return 0;
  //Type your code here.
}