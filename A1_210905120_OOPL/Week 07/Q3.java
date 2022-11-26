import java.util.*;

interface Series{
int getNext();
void reset();
void setStart(int start);
}

class ByTwo implements Series{
int start;
int initial;

@Override
public void setStart(int start){
this.start = start;
this.initial = start;
}

@Override
public int getNext(){
return start++;
}

@Override
public void reset(){
start = initial;
}
}

class Q3{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
ByTwo s1 = new ByTwo();
int choice;
while(true){
System.out.println("Enter the option \n1. Set the initial value \n 2. Get the next number \n 3. Reset the series \n 4. Reset the series and set inital value \n 5. Exit");
choice = sc.nextInt();
switch(choice){
case 1:
 System.out.println("Enter initial value");
 s1.setStart(sc.nextInt());
 break;
case 2:
 System.out.println("The next number is " +(s1.getNext()+1));
 System.out.println("----------------------------------------");
 break;
case 3:
 s1.reset();
 System.out.println("System Reset");
 break;
case 4:
  s1.reset();
 System.out.println("System Reset");
  System.out.println("Enter initial value");
 s1.setStart(sc.nextInt());
 break;
case 5:
System.exit(0);
}
}    
}
}
 

