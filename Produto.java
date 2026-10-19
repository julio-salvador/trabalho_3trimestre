public class Produto {
    
    private String nome;
    private double  preco;
    private int qtdEstoque;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double  getPreco(){
        return preco;
    }

    public void setPreco(int preco){
        if(preco > 0){
            this.preco = preco;
        }
        else{
            System.out.println("Ta achando que é doação? fiote");
        }
    }

    public int getQtdEstoque(){
        return qtdEstoque;
    }

    public void setqtdEstoque(int qtdEstoque){
        this.qtdEstoque = qtdEstoque;
    }


    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            this.qtdEstoque += qtd;
            System.out.println(qtd + " unidades adicionada ao estoque.");
        } else {
            System.out.println("Erro: A quantia para adicionar deve ser maior que zero.");
        }
    }


    public void removerEstoque(int qtd) {
        if (qtd <= 0) {
            System.out.println("Erro: A qtd a ser removida deve ser maior que zero.");
        } else if (qtd <= this.qtdEstoque) {
            this.qtdEstoque -= qtd;
            System.out.println(qtd + " unidades removida do estoque.");
        } else {
            System.out.println("Erro: Estoque insuficiente! Estoque atual: " + this.qtdEstoque);
        }
    }

}

