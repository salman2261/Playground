#include<iostream>
int hcf(int x,int y)
{
  int s,h,i;
  if(x>y)
  {
    s=y;
  }
  else
  {
    s=x;
  }
  for(i=1;i<=s;i++)
  {
    if((x%i==0) &&(y%i==0))
      h=i;
  }
  return h;
}
int main()
{
  int a,b,c=0;
  std::cin>>a>>b;
  c=hcf(a,b);
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<c;
  return 0;
  //Type your code here.
}