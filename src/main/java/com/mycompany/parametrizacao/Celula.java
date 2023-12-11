/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parametrizacao;

/**
 *
 * @author Usuario
 */
public class Celula {
    String elemento;
    Celula anterior;
    
    Celula(String ele, Celula ant){
        this.elemento = ele;
        this.anterior = ant;
    }

    Celula() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    void setDados(String ele){
        this.elemento = ele;
    }
    
    String getDados(){
        return(this.elemento);
    }
    
    Celula getAnterior(){
        return(this.anterior);
    }
    
    void setAnterior(Celula ant){
        this.anterior = ant;
    }
}
