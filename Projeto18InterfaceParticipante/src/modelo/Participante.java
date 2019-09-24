/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Participante implements ILeitor, IProgramador{
    
    protected String nome;
//Construtor
    public Participante() {
    }
    public Participante(String nome) {
        this.nome = nome;
    }
//Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
//Implementação
    @Override
    public String lendo() {
        return "Lendo o código";
    }
    @Override
    public String programando() {
        return "Programando o código";
    }    
}
