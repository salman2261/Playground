#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s[100],r[100];
  int i,j,a,b,flag=0;
  gets(s);
  gets(r);
  i=strlen(s);
  j=strlen(r);
  if(i!=j)
  {
    flag=0;
  }
  else
  {
    for(a=0,b=j-1;a<=i,b>=0;a++,b--)
    {
      if(s[a]==r[b])
      {
        flag=1;
      }
      else
      {
        flag=0;
        break;
      }
    }
  }
  if(flag==0)
  {
     std::cout<<"It is wrong";
  }
  else
  {
    std::cout<<"It is correct";
  }
  
  
  //Type your code here.
}