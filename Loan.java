import java.util.Scanner;
public class Loan{
    private int time;
    private double principal;
    private double rate;
    private double interest;
    private double amt;

public void getdata(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the principal:");
    principal=sc.nextDouble();
    System.out.println("Enter the time:");
    time=sc.nextInt();
}
public void calculate(){
    if(time<=5)
    rate=15.0;
    else if(time<=10)
    rate=12.0;
    else
    rate=10;
interest=(principal*rate*time)/100;
amt=principal+interest;
}
public void display(){
    System.out.println("Interest="+interest);
    System.out.println("Amount="+amt);
}
public static void main(String args[]){
    Loan obj=new Loan();
    obj.getdata();
    obj.calculate();
    obj.display();
}
}