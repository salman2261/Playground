#include<iostream>
#include<string.h>
int main() 
{ 
  char str[100],te;
  int i,j;
  std::cin.getline(str,100);
  j=strlen(str)-1;
  for(i=0;i<j;i++,j--)
  {
    te=str[i];
    str[i]=str[j];
    str[j]=te;
  }
  std::cout<<str;
   
//Type your code here
}