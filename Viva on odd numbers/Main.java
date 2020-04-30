#include<iostream>
using namespace std;
int main()
{
  int n,c=0;
  float s=0.0;
  do{
    std::cin>>n;
    if(n<0)
    {
      s=s-1.0;
    }
    else if(n%2==1)
    {
      c++;
      s++;
    }
    else
    {
      s=s-0.5;
    }
  }while(n>0 && c!=3);
  std::cout<<s;
  //Type your code here.
}