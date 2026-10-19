public class TestaProduto {
 
    public static void main(String[] args) {
        Produto item = new Produto();

        item.setNome("Chaleira");
        item.setPreco(180);
        

        System.out.println("Exibir detalhes:");

        System.out.println("\nItem: " + item.getNome());
        item.adicionarEstoque(360);
        item.removerEstoque(250);
        System.out.println("Estoque" + item.getQtdEstoque());
        System.out.println("Preço:" + item.getPreco());
        
    }

}
