package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "José Henrique";

        c1.adicionarItem("Caderno",2,30.72 );
        c1.adicionarItem("Caneta",22,3.72 );
        c1.adicionarItem("Borracha",12,13.72 );


        System.out.println(c1.itens.size());
        System.out.println(c1.obterValorTotal());
        // apenas para demonstrar a relação bi-direcional
        double total = c1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
        System.out.println("O total é "+ total);
    }
}
