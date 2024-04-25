import javax.swing.JOptionPane;

public class Principal {

    static int total = 0;
    static int a = 0;
    static int b = 0;

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenido a sumar dos numeros...");
        String numero1 = JOptionPane.showInputDialog("Inserte el numero a: ");
        a = Integer.parseInt(numero1);
        String numero2 = JOptionPane.showInputDialog("Inserte el numero b: ");
        b = Integer.parseInt(numero2);

        total = a + b;
       JOptionPane.showMessageDialog(null, "El resultado de suma es de: " + total);

    }

}
