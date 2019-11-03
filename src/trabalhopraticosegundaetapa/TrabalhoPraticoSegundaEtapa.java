/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopraticosegundaetapa;

import javax.swing.JOptionPane;

/**
 *
 * @author Fran-pc
 */
public class TrabalhoPraticoSegundaEtapa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double peso = 0.0;
        Double altura = 0.0;
        Double res = 0.0;
        
        
        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu peso:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua altura:"));
        
        res = peso / (altura * altura);
        
        if (res <= 17){
            JOptionPane.showMessageDialog(null, "Atenção você está muito abaixo do peso");
        }
        else if ( res > 17.0 && res <= 18.49 ){
            JOptionPane.showMessageDialog(null, "Atenção você está abaixo do peso");
       }
        else if ( res > 18.50 && res <= 24.99 ){
            JOptionPane.showMessageDialog(null, "Atenção você está com peso normal");
       }
        else if ( res > 25.0 && res <= 29.99 ){
            JOptionPane.showMessageDialog(null, "Atenção você está acima do peso");
       }
        else if ( res > 30.0 && res <= 34.99 ){
            JOptionPane.showMessageDialog(null, "Atenção você está com obesidade tipo 1");
       }
        else if ( res > 35.0 && res <= 39.99 ){
            JOptionPane.showMessageDialog(null, "Atenção você está com obesidade tipo 2 (severo)");
        }
        else {
           JOptionPane.showMessageDialog(null, "Atenção você está com obesidade tipo 3 (mórbida)");
        }
    }
    }
    

