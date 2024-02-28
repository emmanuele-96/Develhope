package Oggetti1;

public class Studente {

    private String nome;
    private String cognome;
    private int identificativo;

    public Studente(String nome, String cognome, int identificativo) {
        this.nome = nome;
        this.cognome = cognome;
        this.identificativo = identificativo;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getidentificativo() {
        return identificativo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setIdentificativo(int identificativo) {
        this.identificativo = identificativo;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\n" + "cognome: " + cognome + "\n" + "ID: " +
                identificativo;
    }

}
