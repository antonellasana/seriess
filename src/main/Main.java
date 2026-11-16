package main;

import utils.Input;

public class Main {
    static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Serie s1 = new Serie ("HBO Max", "Smallville");
        Serie s2 = new Serie ("Supernatural");
        System.out.println(s1.getNome());
        s1.setNota(Input.db("Informe uma nota:"));
        System.out.println(s2.getNome());
        s2.setNota(Input.db("Informe uma nota:"));


        System.out.println(s1.toString());
        System.out.println(s2.toString());

        if (!s1.setNota(Input.db("Informw uma nota:"))) {
            System.out.println("Nota inválida!");
        }

        catalogo.AdicionarSerie(s1);
        catalogo.AdicionarSerie(s2);

        Serie busca = catalogo.buscarSerie(Input.st("Informe o nome da série:"));
        if (busca != null) {
            System.out.println("Plataforma:" + busca.getPlataforma());
            System.out.println("Nota: " + busca.getNota());
        } else{
            System.out.println("Serie nao encontrada!");
        }
    }




}
