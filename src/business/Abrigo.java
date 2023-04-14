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
public class Abrigo {
    
    
    public Abrigo(String nomeInicial, int telefoneInicial, String veterinarioInicial) {
        nome = nomeInicial;
        telefone = telefoneInicial;
        veterinario = veterinarioInicial;
    }

    public Abrigo() {
    }
    
    private String nome = ""; 
    private int telefone = 0; 
    private String veterinario = "";
    private ArrayList<Box> lista_boxes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public ArrayList<Box> getLista_boxes() {
        return lista_boxes;
    }

    public void setLista_boxes(ArrayList<Box> lista_boxes) {
        this.lista_boxes = lista_boxes;
    }
    
    public void adicionarBoxes(Box b) {
        lista_boxes.add(b);
    }
    
    public void removerAnimais(Box b) {
        lista_boxes.remove(b);
    }
    
    public void removerAnimais(int pos) {
        if (pos > 0 && pos < lista_boxes.size()) {
            lista_boxes.remove(pos);
        }
    }
    
    public String toString() {
        String str = "";
        
        str += "\nNome: " + nome + ", Telefone: " + telefone + ", "
                + "Veterinário: " + veterinario + "\n\tBoxes: " + lista_boxes;

        return str;
    }
}
