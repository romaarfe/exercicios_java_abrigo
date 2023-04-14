/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

/**
 *
 * @author efapp0122
 */
public class Animal {
    
    public Animal(String nomeInicial, String generoInicial, String especieInicial, int idadeInicial) {
        incrementarContadorID(this);
        nome = nomeInicial;
        genero = generoInicial;
        especie = especieInicial;
        idade = idadeInicial;
    }
    
    public Animal() {
    
    }
    private int CHIP = contadorID;
    private static int contadorID = 1; 
    private String nome = "";
    private String genero = "";
    private String especie = "";
    private int idade = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCHIP(Animal a) {
        return CHIP;
    }
    
    public static void incrementarContadorID(Animal a) {
        contadorID++;
    }
            
    public String toString() {
        String str = "";
        
        str += "\n\t\tNome: " + getNome() + ", Chip: " + CHIP + ", "
                + "Gênero: " + getGenero() + ", Espécie: " + getEspecie() + ", "
                + "Idade: " + getIdade();

        return str;
    }
  
}
