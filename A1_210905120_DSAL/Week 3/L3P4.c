#include<stdio.h>
#include<stdlib.h>
struct DOB
{
    int day;
    int *month;
    int year;
};
struct info
{
    int regNo;
    char *name;
    char address[100];
};
struct clg
{
    char *collName;
    char uniName[100];
};
struct Student
{
    struct DOB dmy;
    struct info stuInfo ;
    struct clg college ;
};
void readInfo(struct Student *p)
{
    printf("Enter Name: ");
    scanf("%s", p->stuInfo.name);
    printf("Enter Registration Number: ");
    scanf("%d", &p->stuInfo.regNo);
    printf("Enter date of birth : ");
    scanf("%d %d %d", &(p->dmy->day), *(p->dmy->month), &(p->dmy->year));
    printf("Enter Address: ");
    scanf("%s", p->stuInfo.address);
    printf("Enter College Name: ");
    scanf("%s", p->college.collName);
    printf("Enter University name: ");
    scanf("%s", p->college.uniName);
}
void display(struct Student *p){
    printf("Date of Birth: %d-%d-%d\n", &(p->dmy->day), *(p->dmy->month), &(p->dmy->year));
    printf("Reg No: %d\n",p->stuInfo.regNo);
    printf("Name: %s\n",p->stuInfo.name);
    printf("Address: %s\n",p->stuInfo.address);
    printf("College name: %s\n", p->college.collName);
    printf("University name: %s\n",p->college.uniName);
    printf("\n");
}
int main()
{
    struct Student *p;
    int n;
    printf("Enter the number of students : \n ");
    scanf("%d",&n);
    p = (struct Student*) malloc (n*sizeof(struct Student));
    for(int i =0;i<n;i++){
        (p+i)->dmy = (struct DOB*) malloc (n*sizeof(struct DOB));
        (p+i)->dmy->month = (int*) malloc (n*sizeof(int));
        (p+i)->stuInfo.name = (char *) malloc (n*sizeof(char));
        (p+i)->college.collName = (char *) malloc (n*sizeof(char));

    }
    p->dmy = (struct DOB*) malloc (n*sizeof(struct DOB));
    p->dmy->month = (int*) malloc (n*sizeof(int));
    p->stuInfo.name = (char *) malloc (n*sizeof(char));
    p->college.collName = (char *) malloc (n*sizeof(char));
    for(int i =0;i<n;i++){
        readInfo(p+i);

    }
   
    printf("\n");
    for(int i =0;i<n;i++){
        display(p+i);

    }
   
}