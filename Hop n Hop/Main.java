#include<iostream>
using namespace std;
int main()
{
  int bx=3,by=4,x,y;
  cin>>x>>y;
  int hop=0;
  while(bx!=x && by!=y){
    hop+=1;
    bx+=1;by+=1;
  }
  if(bx==x){
    hop+=(y-by);}
   else{
     hop+=(x-bx);}
  cout<<hop;
  
     
}