import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        Scanner read= new Scanner (System.in);
        int r;
        r= read.nextInt();
        double pi=3.14;
        System.out.printf("%.2f
",pi*r*r);
        System.out.printf("%.2f",2*pi*r);
    }
}