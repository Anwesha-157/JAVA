import java.util.Scanner;
class Library{
    private String name;
    private int price;
    private int day;
    private double fine;
    void input(String name,int price){
        this.name=name;
        this.price=price;
    }
    void calculate(int day){
        this.day=day;
        if(day<=7)
        fine=day*0.25;
        else if(day<=15)
        fine=day*0.40;
        else if(day<=30)
        fine=day*0.60;
        else if(day>30)
        fine=day*0.80;
    }
    void display(){
        System.out.println("name="+name);
        System.out.println("fine="+fine);
    }
}
class libraryCalculate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the book:");
        String name=sc.nextLine();
        System.out.println("Enter the price of the book:");
        int price=sc.nextInt();
        Library ob=new Library();
        ob.input(name,price);
        System.out.println("Enter the no of days to calculate the fine:");
        int day=sc.nextInt();
        ob.calculate(day);
        ob.display();
    }
}