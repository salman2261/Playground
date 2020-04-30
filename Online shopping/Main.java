#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,sa,sd,ss,aa,ad,as;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  int fl=(fa-(fa*fd/100))+fs;
  int sn=(sa-(sa*sd/100))+ss;
  int am=(aa-(aa*ad/100))+as;
  cout<<"In Flipkart Rs."<<fl<<"\n";
cout<<"In Snapdeal Rs."<<sn<<"\n";
cout<<"In Amazon Rs."<<am<<"\n";
  if(fl<=sn && fl<=am)
    cout<<"He will prefer Flipkart";
  else if(sn<fl && sn<<am)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
    
}
