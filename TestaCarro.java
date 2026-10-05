public class TestaCarro {
    
    public static void main(String[] args) {
        Carro bao = new Carro();

        bao.getMarca();
        bao.getModelo();
        bao.getPortas();

        System.out.println("Exibir detalhes:");
        System.out.println("Marca: " + bao.getMarca());
        System.out.println("Modelo: " + bao.getModelo());
        System.out.println("Portas: " + bao.getPortas());
    }
}
