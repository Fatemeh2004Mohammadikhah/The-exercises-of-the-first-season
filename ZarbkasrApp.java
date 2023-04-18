import java.util.Scanner;
public class ZarbkasrApp {
    public static void main(String[] args){
        Scanner Input=new Scanner(System.in);
        double num1,num2,denome1,denome2,z,p,hasel;
        System.out.println("Enter first numerator:");
        num1=Input.nextDouble();
        System.out.println("Enter first denamitor:");
        denome1=Input.nextDouble();
        System.out.println("Enter second numerator:");
        num2= Input.nextDouble();
        System.out.println("Enter second denamitor:");
        denome2= Input.nextDouble();
        z=num1*num2;
        p=denome1*denome2;
        hasel=z/p;
        System.out.println("multiplication"+hasel+" ");
    }
}
