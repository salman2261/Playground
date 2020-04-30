#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  cin>>r>>c>>t;
  if((t>=0 &&t<=c) || (t%c==1)||(t%c==0))
    cout<<"Yes";
  else
    cout<<"No";
}