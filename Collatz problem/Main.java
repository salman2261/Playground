#include<iostream>
using namespace std;
void collatz(int n,int cnt){
  if(n==1){
    cout<<n<<"\n";
    cout<<cnt;
    return;
  }
  else{
    cout<<n<<"\n";
    int temp;
    temp=n%2==0?(n/2):(3*n+1);
    cnt+=1;
    collatz(temp,cnt);
    return;
  }
}
int main()
{
  int a;
  cin>>a;
  collatz(a,0);
}