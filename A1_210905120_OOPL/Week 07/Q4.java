import java.util.*;

class Student{
int marks;
int number;

void setMarks(int marks){
this.marks = marks;
}

void setNumber(int number){
this.number = number;
}

int getMarks(){
return marks;
}

int getNumber(){
return number;
}

}

interface Sports{
char getGrade();
}

class Result extends Student implements Sports{
char grade;

Result(int marks,int number,char grade){
super.setMarks(marks);
super.setNumber(number);
this.grade = grade;
}
@Override
public char getGrade(){
return grade;
}

void answer(){
System.out.println("The Roll no is : " + getNumber() + "\nThe marks are : " + getMarks() + "\nThe grade is : " + getGrade());
}
}

class Q4{
public static void main (String args[]){
Result res = new Result(88,24,'A');
res.answer();
}
}


