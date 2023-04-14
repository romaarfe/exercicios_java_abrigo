/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tests;

import java.util.ArrayList;
import business.Animal;
/**
 *
 * @author efapp0122
 */
public class TestAnimal {

    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        
        Animal a1 = new Animal("Cookie", "Felis", "catus", 6);

//        a1.setNome("Cookie");
//        a1.setGenero("Felis");
//        a1.setEspecie("catus");
//        a1.setIdade(6);
        animais.add(a1);
        
        Animal a2 = new Animal("Selvanus", "Canis", "lupus", 8);
        
//        a2.setNome("Selvanu");
//        a2.setGenero("Canis");
//        a2.setEspecie("lupus");
//        a2.setIdade(8);
        animais.add(a2);
        
        Animal a3 = new Animal("Rodrigus", "Caretta", "caretta", 10);
        animais.add(a3);
 
        System.out.println(animais.toString());
    }
    
}
