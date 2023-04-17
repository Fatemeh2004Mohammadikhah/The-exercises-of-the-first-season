package javatest01;
import javax.swing.JOptionPane;

public class AmaliatriaziApp {
    public static void main(String[] args) {
        String n1str = JOptionPane.showInputDialog("Enter first number:");
        Float n1 = Float.parseFloat(n1str);
        String p1par = JOptionPane.showInputDialog("Enter second number:");
        Float p1 = Float.parseFloat(p1par);
        float sum = n1 + p1;
        float zarb = n1 * p1;
        float tafrigh = (n1 -p1);
        float kharegghesmat = n1 / p1;
        float baghimande = n1 % p1;
        JOptionPane.showInputDialog(null,"the sum of two number" + sum + "zarb" + zarb + "tafrigh" +tafrigh+ "kharegghesmat" + kharegghesmat + "baghimande" + baghimande + " ");
    }
}