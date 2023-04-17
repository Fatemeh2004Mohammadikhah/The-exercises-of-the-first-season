package javatest01;
import javax.swing.JOptionPane;
public class ConversionApp {
    public static void main (String args[]) {
        String n1str = JOptionPane.showInputDialog ("Enter saniye:");
        int n1 = Integer.parseInt(n1str);
        int b = a / 3600;
        int c = a % 3600;
        int k = c / 60;
        int f = c % 60;
        JOptionPane.showInputDialog(null, "hore" + b + "minute" + c + "second" + f + " ");
    }
}