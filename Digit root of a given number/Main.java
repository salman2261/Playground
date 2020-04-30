#include<iostream>
int main()
{
  int a,rem=0,rem1=0,sum=0,sum1=0,temp=0;
  std::cin>>a;
  while(a>0)
  {
    rem=a%10;
    sum=sum+rem;
    a=a/10;
  }
  while(sum>0)
  {
    rem1=sum%10;
    sum1=sum1+rem1;
    sum=sum/10;
  } 
std::cout<<sum1;
}