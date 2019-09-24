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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Participante objParticipante = new Participante("Joao");
        
        System.out.println(objParticipante.programando());
        System.out.println(objParticipante.lendo());
    }    
}
