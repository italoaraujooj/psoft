public class Sistema {
    public static void main(String[] args) {
        Produto leite = new Produto("Leite", "Nestle");
        Lote loteLeite = new Lote(leite, 100);
        System.out.println(leite.toString());
        System.out.println(loteLeite.toString());
    }
}
