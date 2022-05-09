public class Produto {
    private String ID;
    private String nome;
    private String fabricante;

    public Produto(String nome, String fabricante) {
        this.nome = nome;
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "ID='" + ID + '\'' +
                ", nome='" + nome + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
