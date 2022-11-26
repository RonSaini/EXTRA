import java.util.*;
class NewThread implements Runnable
{
Thread t;
String threadname;
static List<Integer> list=new ArrayList<Integer>();
NewThread(String threadname)
{
this.threadname=threadname;
t=new Thread(this,threadname);
t.start();
}
@Override
public void run()
{
Random r=new Random();
int temp;
if(threadname.compareTo("producer")==0)
{
try
{
while(true)
{
synchronized(list)
{
while(list.size()==10)
{
System.out.println(threadname+" is waiting for consumer to consume");
list.wait();
}
temp=r.nextInt();
list.add(temp);
System.out.println("list is"+list);
System.out.println(threadname+" produces"+temp);
list.notifyAll();
Thread.sleep(1000);
}
}}
catch(InterruptedException e)
{
System.out.println(threadname+" "+e);
}
}
else if(threadname.compareTo("consumer")==0)
{
try
{
while(true)
{
synchronized(list)
{
while(list.size()==0)
{
System.out.println(threadname+" is waiting for producer to produce");
list.wait();
}
temp=list.remove(0);
System.out.println(threadname+" consumes"+temp);
list.notifyAll();
Thread.sleep(50);
}
}}
catch(InterruptedException e)
{
System.out.println(threadname+" "+e);
}
}
}}
class producer
{
public static void main(String[] args)
{
new NewThread("producer");
new NewThread("consumer");
}
}