#include<iostream>
using namespace std;
int main()
{
  int age;float time;
  cin>>age>>time;
  if(age>13){
    if(int(time)==10)
      cout<<"$8.00";
    else
      cout<<"$5.00";
  }
  else{
    if(int(time)==10)
      cout<<"$4.00";
    else
      cout<<"$2.00";
  }
}