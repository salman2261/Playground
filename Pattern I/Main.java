#include<iostream>
int main()
{
  int n,i,j;
  std::cin>>n;
  std::cout<<n<<"\n";
  for(i=n+1;i<=n+3;i++)
  {
    for(j=n;j<=i;j++)
    {
      printf("%d",i);
    }
    printf("\n");
  }
  for(i=n+3;i>=n;i--)
  {
    for(j=n;j<=i;j++)
    {
      printf("%d",i);
    }
    printf("\n");
  }
}