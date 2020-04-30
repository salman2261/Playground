#include<iostream>
int main()
{
  int n,c=0,rem=0;
  std::cin>>n;
  do{
    rem=n%10;
    c=c+1;
    n=n/10;
  }while(n>0);
  std::cout<<c;
  // Type your code here
}