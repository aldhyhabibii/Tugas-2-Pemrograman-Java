package tugas2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Aldhy
 */
public class Tugas2
{
    public static void Bag1()
    {
        Scanner Angka = new Scanner (System.in);
        int a;
        int b;
        int c;
        System.out.print("Nomor 1 = ");
        a = Angka.nextInt();
        System.out.print("Nomor 2 = ");
        b = Angka.nextInt();
        System.out.print("Nomor 3 = ");
        c = Angka.nextInt();
        System.out.println("Rata-Rata = " + ((a+b+c)/3));
    }
    public static void Bag2()
    {
        String nomor1 = JOptionPane.showInputDialog("Nomor 1 = ");
        String nomor2 = JOptionPane.showInputDialog("Nomor 2 = ");
        String nomor3 = JOptionPane.showInputDialog("Nomor 3 = ");
        int n1 = Integer.parseInt(nomor1);
        int n2 = Integer.parseInt(nomor2);
        int n3 = Integer.parseInt(nomor3);
        int rata = (n1+n2+n3)/3;
        String msg = "Nomor 1 = " +n1+ "\n Nomorr 2 = " +n2+ "\n Nomor 3 = " +n3+ "\n\n Rata-Rata = "+rata;
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void main(String[] args)
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex)
        {
            Logger.getLogger(Tugas2.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Bag1();
        Bag2();
    }
}
