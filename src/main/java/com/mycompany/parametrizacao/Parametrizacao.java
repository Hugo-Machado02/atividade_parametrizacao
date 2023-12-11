/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parametrizacao;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Parametrizacao {

    public static void main(String[] args) {
        String expressao, exp_filtrada;
        FuncPilha fp = new FuncPilha();
        
        expressao = JOptionPane.showInputDialog("Digite a Expressão");
        exp_filtrada = expressao.replaceAll("[^(){}\\[\\]]", "");
        
        String[] exp = new String[exp_filtrada.length()];       
        for (int i = 0; i < exp_filtrada.length(); i++) {
            exp[i] = String.valueOf(exp_filtrada.charAt(i));
        }
        
        for (String i : exp) {
            fp.push(i);
        }
        
        System.out.print("\n\n============ Resultado ============\n");
        System.out.println("Expressao: "+expressao);
        System.out.println("Status: "+fp.verificarExp());
        System.out.println("===================================");
    }
}
