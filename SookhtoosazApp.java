import java.util.Scanner;
public class SookhtoosazApp {
    public static void main(String[] args){
        Scanner Input=new Scanner(System.in);
        Double M,hl,Mam,hm;
        System.out.println("Enter masafat tey shde:");
        M= Input.nextDouble();
        hl=180000/M;
        Mam=60/M;
        hm=Mam*1200;
        System.out.println("The cost of each liter of gasaline"+hl+"car fuel consumption"+Mam+"the cost of the trip"+hm+" ");
    }
}
