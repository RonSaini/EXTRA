class Time{
    int hours;
    int mins;
    int secs;
    Time(){
        hours=3;
        mins=3;
        secs=45;
        System.out.println("Inside default constructor, Values are hours:"+hours+" mins:"+mins+" secs:"+secs);
    }
    Time(int a,int b,int c){
        hours=a;
        mins=b;
        secs=c;
    }
    void Display(){
        System.out.println("Time is "+hours+":"+mins+":"+secs);
    }
}
class L4P2 {
    public static void main(String[] args){
        Time t1= new Time();
        Time t2= new Time(7,12,33);
        System.out.println("Time Using Display() method: ");
        t1.Display();
        t2.Display();
    }
}