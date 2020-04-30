#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
  int a,b,c,s;
  cin>>a>>b>>c;
  int max=a>b?(a>c?a:c):(b>c?b:c);
  if(a==max){
    if(b>c)
      s=b;
    else
      s=c;
  }
  else if(b==max){
    if(a>c)
      s=a;
    else
      s=c;
  }
  else{
    if(a>b)
      s=a;
    else
      s=b;
  }
  int gc=max;
  for(int i=max;i>0;i--){
    if(a%i==0 && b%i==0 && c%i==0){
      gc=i;
      break;
    }
  }
  cout<<"The treasure is in box which has number "<<s<<"\n";
  cout<<"The code to open the box is "<<gc;
}