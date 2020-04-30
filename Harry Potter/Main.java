#include<iostream>
using namespace std;
int main()
{
  int a,ans=0;
  cin>>a;
 
  ans+=a%10;
  ans+=a/1000;
  cout<<ans;
}