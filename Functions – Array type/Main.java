#include<iostream>
using namespace std;
int main()
{
  int a,arr[20],i,even=0,odd=0;
  std::cout<<"Enter the number of elements in the array\n";
  std::cin>>a;
  std::cout<<"Enter the elements in the array\n";
  for(i=0;i<a;i++)
  {
    std::cin>>arr[i];
  }
  for(i=0;i<a;i++)
  {
    if(arr[i]%2==0)
      even++;
    else
      odd++;
  }
  if(even !=0 && odd !=0)
  {
    std::cout<<"The array is Mixed";
  }
  else if(even>0)
    std::cout<<"The array is Even";
  else
    std::cout<<"The array is Odd";
  //Type your code here.
}