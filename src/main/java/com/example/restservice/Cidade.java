/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.restservice;

/**
 *
 * @author vinicius
 */
public class Cidade {
    private Long ID;
    private String nome;
    private Estado estado;

     public Cidade(){}
    public Cidade(Long id,String nome, Estado estado){
        this.setID(id);
        this.setNome(nome);
        this.setEstado(estado);
        
    }
    
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    

    
   
}
