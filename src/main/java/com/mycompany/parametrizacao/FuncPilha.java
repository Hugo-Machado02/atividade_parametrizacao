/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parametrizacao;

/**
 *
 * @author Usuario
 */
public class FuncPilha {
    Celula topo;
    Boolean status = true;
    
    void push(String ele){
        if(ele.equalsIgnoreCase("{") || ele.equalsIgnoreCase("[") || ele.equalsIgnoreCase("(")){
            Celula nova = new Celula(ele, this.topo);
            this.topo = nova;
        }else{
            pop(ele);
        }
    }
    
    void pop(String ele){
        if(this.topo != null){
            if(ele.equalsIgnoreCase("}") && this.topo.getDados().equalsIgnoreCase("{")){
                this.topo = this.topo.getAnterior();
            }
            else if(ele.equalsIgnoreCase("]") && this.topo.getDados().equalsIgnoreCase("[")){
                this.topo = this.topo.getAnterior();
            }
            else if(ele.equalsIgnoreCase(")") && this.topo.getDados().equalsIgnoreCase("(")){
                this.topo = this.topo.getAnterior();
            }
            else{
                this.status = false;
            }
        }
    }
    
    int tamanhoPilha(){
        Celula c;
        c = this.topo;
        int tamanho = 0;
        
        while(c != null){
            c = c.getAnterior();
            tamanho++;
        }
        
        return(tamanho);
    }
    
    String verificarExp(){
        if(this.status == true && tamanhoPilha() == 0){
            return("Expressão Correta");
        }else{
            return("Expressão Incorreta");
        }
    }
}
