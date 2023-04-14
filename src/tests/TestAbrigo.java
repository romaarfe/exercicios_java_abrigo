/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tests;

import business.Abrigo;
import business.Animal;
import business.Box;

/**
 *
 * @author efapp0122
 */
public class TestAbrigo {
    public static void main(String[] args) {
        
        Abrigo a = new Abrigo("Savana Lusitana", 78647564, "Rui Covidas");
        
        Box b1 = new Box("Mamíferos", "Gato", 3);
        
        Animal a1 = new Animal("Roderick", "Gato", "Malhado", 6);
        b1.adicionarAnimais(a1);
        
        Animal a2 = new Animal("Selvanu", "Cão", "Rajado", 8);
        b1.adicionarAnimais(a2);
        
        a.adicionarBoxes(b1);
        
        Box b2 = new Box("Répteis", "Quelônio", 3);
        
        Animal a3 = new Animal("Romulus", "Quelônio", "Cascuda", 9);
        b2.adicionarAnimais(a3);
        
        Animal a4 = new Animal("Hugus", "Ave", "Plumado", 10);
        b2.adicionarAnimais(a4);
        
        a.adicionarBoxes(b2);
        
        System.out.println(a.toString());
    }
}
