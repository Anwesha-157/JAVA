import java.util.Scanner;
public class Stock{
    private String title;
    private String author;
    private String pub;
    private int noc;
    public void getData(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter book title:");
        title=sc.nextLine();
        System.out.println("Enter book author:");
        author=sc.nextLine();
        System.out.println("Enter book publisher:");
        pub=sc.nextLine();
        System.out.println("Enter no. of copies:");
        noc=sc.nextInt();
    }
    public void purchase(String t,String a,String p,int n){
        if(title.equalsIgnoreCase(t) && author.equalsIgnoreCase(a) && pub.equalsIgnoreCase(p)){
            if(noc>n){
                noc-=n;
            System.out.println("updated noc="+noc);
            }
            else{
                System.out.println("stock is under flowing");
            }
        }
        else{
            System.out.println("Book is not available");
        }
    }
    public static void main(String args[]){
        Stock obj=new Stock();
        obj.getData();
        obj.purchase("Wings of fire","APj Abdul Kalam","Universities press",10);
        obj.purchase("Ignited minds","APJ Abdul Kalam","penguin",5);
        obj.purchase("Wings Of Fires","APJ Abdul Kalam","Universities press",20);
    }
}