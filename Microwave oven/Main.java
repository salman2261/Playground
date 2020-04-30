#include<iostream>
using namespace std;
int main()
{
  int n;float time;
  cin>>n>>time;
 if(n>3){
   cout<<"Number of items is more";
   return 0;
 }
  if(n==2)
    cout<<time+(time/2);
  else
    cout<<time+time;
}