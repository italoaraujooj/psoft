public class Lote {

    private String ID;
    private Produto produto;
    private int quantidade;

    public Lote(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "ID='" + ID + '\'' +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }
}
