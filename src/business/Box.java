/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author efapp0122
 */
public class Box {
    
    public Box(String setorInicial, String tipoInicial, int MAX) {
        incrementarContadorID(this);
        setor = setorInicial;
        tipo = tipoInicial;
        MAX_ESPECIE = MAX;
    }
    

    public Box() {
        MAX_ESPECIE = 3;
    }
    
    private final int MAX_ESPECIE; 
    private String setor = ""; 
    private int numero = contador;
    private static int contador = 1; 
    private String tipo = "";
    private ArrayList<Animal> lista_animais = new ArrayList<>();

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Animal> getLista_Animais() {
        return lista_animais;
    }

    public void adicionarAnimais(Animal a) {
        if (tipo == a.getGenero()) {
            lista_animais.add(a);
        }    
        
        else {
            System.out.println("Não foi permitido adicionar o animal " + a.getNome() + " pois é do tipo " 
                    + a.getGenero() + " e a Box tem apenas " + tipo + ".");
        }
        
        if (lista_animais.size() < MAX_ESPECIE) {
            lista_animais.add(a);
        }
        else {
            System.out.println("Limite de animais alcançado!");
        }
    }
    
    public void removerAnimais(Animal a) {
        lista_animais.remove(a);
    }
    
    public void removerAnimais(int pos) {
        if (pos > 0 && pos < lista_animais.size()) {
            lista_animais.remove(pos);
        }
    }
    
    public int getNumero(Box b) {
        return numero;
    }
    
    public static void incrementarContadorID(Box b) {
        contador++;
    }
    
    public void moverAnimal(Box box, Animal animal) {
        ;
        
    }
    
    public String toString() {
        String str = "";
        
        str += "\n\tSetor: " + getSetor() + ", Número: " + numero + ", "
                + "Tipo: " + getTipo() + "\n\t\tAnimais: " + getLista_Animais();

        return str;
    }
    
}
