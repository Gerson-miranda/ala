package org.example.ex1;

public class Cliente {
    private  String nome;
    private int indade;
    private  Pet pet;


    public Cliente(String nome, int indade, Pet pet) {
        this.nome = nome;
        this.indade = indade;
        this.pet = pet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIndade() {
        return indade;
    }

    public void setIndade(int indade) {
        this.indade = indade;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", indade=" + indade +
                ", pet=" + pet +
                '}';
    }
}
