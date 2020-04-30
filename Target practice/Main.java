#include<iostream>
using namespace std;
int main()
{
  int num,s=0,c=0,n;
  std::cin>>num;
  for(c=0;s<num;c++)
  {
    std::cin>>n;
    s=s+n;
  }
  std::cout<<"The number of turns is "<<c;
  //Type your code here.
}