#include<iostream>
int main()
{
  int n,i,key,c=0;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  std::cin>>key;
  for(i=0;i<n;i++)
  {
    if(a[i]==key)
    {
		c++;
    }
  }
  if(c==1)
  {
    std::cout<<"She passed her exam";
  }
  else
  {
    std::cout<<"She failed";
  }
  // Type your code here
}