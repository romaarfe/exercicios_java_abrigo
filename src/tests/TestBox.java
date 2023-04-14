/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import business.Animal;
import business.Box;
import java.util.ArrayList;

/**
 *
 * @author efapp0122
 */
public class TestBox {
    public static void main(String[] args) {
        ArrayList<Box> boxes = new ArrayList<>();
        
        Box b1 = new Box("Mamíferos", "Gatos", 3);
       
//        b.setSetor("Mamíferos");
//        b.setTipo("Gatos");
        
        Animal a1 = new Animal("Roderick", "Felis", "catus", 6);
        
//        a1.setNome("Roderick");
//        a1.setGenero("Felis");
//        a1.setEspecie("catus");
//        a1.setIdade(6);
        b1.adicionarAnimais(a1);
        
        Animal a2 = new Animal("Selvanu", "Felis", "catus", 8);
        
//        a2.setNome("Selvanu");
//        a2.setGenero("Felis");
//        a2.setEspecie("catus");
//        a2.setIdade(8);
        b1.adicionarAnimais(a2);
        boxes.add(b1);
       
        Box b2 = new Box("Répteis", "Quelônios", 3);
        
        Animal a3 = new Animal("Romulus", "Caretta", "caretta", 9);
        
//        a3.setNome("Romulus");
//        a3.setGenero("Felis");
//        a3.setEspecie("catus");
//        a3.setIdade(9);
        b2.adicionarAnimais(a3);
        boxes.add(b2);
        
        System.out.println(boxes.toString());
    }  
}
