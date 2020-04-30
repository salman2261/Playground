#include<iostream>
using namespace std;
int main()
{
  int n,even=0,odd=0,i;
  std::cin>>n;
  int ar[n];
  for(i=0;i<n;i++)
    std::cin>>ar[i];
  for(i=0;i<n;i++)
  {
    if(ar[i]%2==0)
      even+=ar[i];
    else
      odd+=ar[i];
  }
  std::cout<<"The sum of the even numbers in the array is "<<even<<"\n";
  std::cout<<"The sum of the odd numbers in the array is "<<odd;
  //Type your code here.
}