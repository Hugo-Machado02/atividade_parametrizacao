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
    int status = 1;
    
    void push(String ele){
        if(ele == "{" || ele == "[" || ele == "("){
            Celula nova = new Celula();
            nova.setDados(ele);
            nova.setAnterior(this.topo);
            this.topo = nova;
        }else{
            pop(ele);
        }
    }
    
    void pop(String ele){
        if(this.topo != null){
            if(ele == "}" && this.topo.getDados() == "{"){
                System.out.println("Removendo Chaves da Pilha");
                this.topo = this.topo.getAnterior();
            }
            else if(ele == "]" && this.topo.getDados() == "["){
                System.out.println("Removendo Colchetes da Pilha");
                this.topo = this.topo.getAnterior();
            }
            else if(ele == ")" && this.topo.getDados() == "("){
                System.out.println("Removendo Parênteses da Pilha");
                this.topo = this.topo.getAnterior();
            }
            else{
                System.out.println("Expressão Está Incorreta");
                this.status = 0;
            }
        }
        else{
            System.out.println("Expressão Está Correta");
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
    
    int getStatus(){
        return(this.status);
    }
}
