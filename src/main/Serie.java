package main;

public class Serie {
    private String nome;
    private String plataforma;
    private double nota;


    public Serie(String plataforma, String nome) {
        this.plataforma = plataforma;
        this.nome = nome;
        this.nota = 0;
    }


    public Serie (String nome) {
        this.nome = nome;
        this.plataforma = "plataforma indefinida.";
        this.nota = 0;
    }




    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getPlataforma() {
        return plataforma;
    }


    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }


    public double getNota() {
        return nota;
    }


    public boolean setNota(double novaNota) {
        if (nota >= 0 && nota<= 10) {
            this.nota = nota;
            return true;
        }
        return false;
    }



    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", nota=" + nota +
                '}';
    }
}