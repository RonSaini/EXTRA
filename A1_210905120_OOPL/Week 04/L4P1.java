class Complex {
    int x;
    int y;
    Complex(){
        x=2;
        y=10;
        System.out.println("Inside Default constructor, the values are: real part="+x+" imaginary part="+y);
    }
    Complex(int a,int b){
        x=a;
        y=b;
        System.out.println("Inside Parameterized constructor, the values are: real part="+x+" imaginary part="+y);
    }
    void display(){
        System.out.println("The Complex no. is: "+x+"+i"+y);
    }
} 

class L4P1{
    public static void main(String [] args){
        Complex c1= new Complex();
        Complex c2= new Complex(5,3);  
        System.out.println("Using display() method: ")  ;
        c1.display();
        c2.display();    
    }
}