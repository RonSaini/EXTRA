import java.util.Scanner;

class NewThread implements Runnable {
    String name;
    Thread t;
    int n;
    String table;
    NewThread(String s,int a) {
        name = s;
        n = a;
        table="";
        t = new Thread(this,name);
        // System.out.println("New thread: "+t);
        t.start();
    }
    public void run() {
        for (int i=1;i<=10;i++) {
            table=table+" "+(i*n);
        }
        // System.out.println(name+" exiting.");
    }
}

class Tables {
    NewThread t;
    Tables(int n) {
        String temp = ""+n;
        t = new NewThread(temp, n);
    }
}

class q1 {
    public static void main(String args[]) {
        // NewThread f = new NewThread("Five", 5);
        // NewThread s = new NewThread("Seven", 7);
        Tables obj1 = new Tables(5);
        Tables obj2 = new Tables(7);
    
        /*
        try{
            System.out.println("Sleeping for 0.5 seconds");
            Thread.sleep(500);
        }
        catch(InterruptedException e) {
            System.out.println("Interrupted..");
        }
        */
        System.out.println("Multiplicaton Table of 5: "+obj1.t.table);
        System.out.println("Multiplicaton Table of 7: "+obj2.t.table);
    }
}
