public class TestaConta {
    public static void main(String[] args) {
        ContaBancaria rico = new ContaBancaria();

        rico.setTitular("Gerente");
        rico.getSaldo();
        rico.depositar(200);
        rico.sacar(100);

        System.out.println("Exibir detalhes:");
        System.out.println("Titular: " + rico.getTitular());
        System.out.println("Saldo: " + rico.getSaldo());
       




    }
}
