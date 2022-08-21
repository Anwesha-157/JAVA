import java.util.Scanner;
public class Mobike{
    private int bno;
    private Long phno;
    private String name;
    private int days;
    private int charge;

    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the bike number:");
        bno=sc.nextInt();
        System.out.println("Enter the phno:");
        phno=sc.nextLong();
        System.out.println("Enter the no. of days:");
        days=sc.nextInt();
        System.out.println("Enter the name of the customer:");
        name=sc.next();
    }
    public void compute(){
        if(days<=5)
        charge=days*500;
        else if(days<=10)
        charge=5*500+((days-5)*400);
        else
        charge=5*500+5*400+((days-10)*200);
    }
    public void display(){
        System.out.println("bike no\tphn no\tname\tno. of days\tcharge");
        System.out.println(bno + "\t" + phno + "\t" + name + "\t" + days + "\t" + charge);
    }
    public static void main(String args[]){
        Mobike ob=new Mobike();
        ob.input();
        ob.compute();
        ob.display();
    }

}