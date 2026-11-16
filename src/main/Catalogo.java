package main;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Serie> catalogo = new ArrayList();

    public Catalogo() {
        catalogo = new ArrayList();
    }

    public void AdicionarSerie(Serie serie) {
        this.catalogo.add(serie);
    }

    public Serie buscarSerie(String nomeBusca) {
        for (Serie serie : catalogo) {
            if (serie.getNome().equals(nomeBusca)) {
                return serie;
            }
        }
        return null;
    }
}
