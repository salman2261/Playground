#include<iostream>
using namespace std;
struct employee
{
  char name[100];
  int id;
  int age;
  char des[100];
  float sal;
};
int main()
{
  struct employee emp;
  std::cout<<"Enter name:\n";
  std::cin>>emp.name;
  std::cout<<"Enter ID:\n";
  std::cin>>emp.id;
  std::cout<<"Enter age:\n";
  std::cin>>emp.age;
  std::cout<<"Enter designation:\n";
  std::cin>>emp.des;
  std::cout<<"Enter Salary:\n";
  std::cin>>emp.sal;
  std::cout<<"Employee Details\n";
  std::cout<<"Name of the Employee : "<<emp.name<<"\n";
  std::cout<<"ID of the Employee : "<<emp.id<<"\n";
  std::cout<<"Age of the Employee : "<<emp.age<<"\n";
  std::cout<<"Designation of the Employee : "<<emp.des<<"\n";
  std::cout<<"Salary of the Employee : "<<emp.sal<<"\n";
  
  
  //Type your code here.
}