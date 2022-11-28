
package calculadora;

import javax.swing.JOptionPane;


public class Calculadora {

  
    public static void main(String[] args) {
        int numero1,numero2,div,mult,suma,rest;
        char operacion;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        
        operacion = JOptionPane.showInputDialog("Digite la operacion que desea realizar:\n"
                + "S/+ = Suma\n"
                + "D/÷ = Division\n"
                + "M/* = Multiplicacion\n"
                + "R/- = Resta").charAt(0);
        
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
        
        switch(operacion){
            case 's': 
            case 'S':
            case '+': suma = numero1 + numero2;
            JOptionPane.showMessageDialog(null,"La suma es: "+suma);
            break;
            
            case 'd':
            case 'D':
            case '/': div = numero1 / numero2;
            JOptionPane.showMessageDialog(null, "La division es: "+div);
            break;
            
            case 'm':
            case 'M':
            case '*': mult = numero1 * numero2;
            JOptionPane.showMessageDialog(null,"La multiplicacion es: "+mult);
            break;
            
            case 'r':
            case 'R':
            case '-':rest= numero1-numero2;
            JOptionPane.showMessageDialog(null,"La resta es: "+rest);
            break;
            
            default:JOptionPane.showMessageDialog(null,"Operacion equivocada");
            
            
    }
        
    }
    
}
