#include<iostream>
int main()
{
  int n,temp,i;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    std::cin>>a[i];
  temp=a[0];
  for(i=1;i<n;i++)
  {
    if(temp<a[i])
    {
      temp=a[i];
    }
  }
  std::cout<<temp;
  // Type your code here
}