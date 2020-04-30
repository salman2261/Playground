#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int c,count=0,chk;
  cin>>c;
  count=c;
  chk=c*(1/sqrt(c));
  while(chk>1){
    count=count+int(chk);
    chk=int(chk)*(1/sqrt(c));
  }
  cout<<count+1;
  
}