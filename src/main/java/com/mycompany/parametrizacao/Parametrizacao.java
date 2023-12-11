/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parametrizacao;

/**
 *
 * @author Usuario
 */
public class Parametrizacao {

    public static void main(String[] args) {
        String expressao, exp_filtrada;
        FuncPilha fp = new FuncPilha();
        
        expressao = "{Salve{} Rapaziada [Todos Tranquilos? (Vocês são Feras)]}";
        
        exp_filtrada = expressao.replaceAll("[^(){}\\[\\]]", "");
        
        System.out.println("Frase: "+expressao);
        System.out.println("Frase Filtrada: "+exp_filtrada);

        char[] exp = exp_filtrada.toCharArray();
        
        for (char i : exp) {
            //fp.push(i);
            System.out.println("Array de caracteres: "+ i);
        }
        
        if(fp.getStatus() == 0){
            System.out.print("\n\nExprecao Incorreta");
        }
        
    }
}
