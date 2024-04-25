import javax.swing.JOptionPane;

public class Principal {


    static int  total = 0;
  static  int a = 0;
  static  int b = 0;
    public static void main(String[] args) {

JOptionPane.showMessageDialog(null, "Bienvenido a sumar dos numeros...");

        
        
        sumatoria();

    }


    public static void sumatoria (){
        total = a + b;
        System.out.println("El resultado de suma es de: "+total);
    }

}
