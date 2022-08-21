import java.util.Scanner;
public class Honda{
  private int type;
  private int cost;
  private double newcost;
  
  public void gettype(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the type of Engine:");
    type=sc.nextInt();
    System.out.println("Enter the previous cost: ");
    cost=sc.nextInt();
  }
  public void find(){
    switch(type){
    case 2:
    newcost=cost+ (cost*0.1);
    break;

    case 4:
    newcost=cost+ (cost*0.12);
    break;

    default:
    System.out.println("Incorrect type");
    break;
  }
}
 public void printcost(){
    System.out.println("Type="+type);
    System.out.println("newcost="+newcost);
 }
 
 public static void main(String args[]){
    Honda ob=new Honda();
    ob.gettype();
    ob.find();
    ob.printcost();
 }

}