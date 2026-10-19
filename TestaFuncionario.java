public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario cuiudo = new Funcionario();

        cuiudo.setNome("Jadir");
        cuiudo.setSalario(2800);
        

        System.out.println("\nExibir detalhes de " + cuiudo.getNome() + ":");
        System.out.println("Salario: " + cuiudo.getSalario());

         Gerente Leandro = new Gerente();

        Leandro.setNome("Leandro");
        Leandro.setSalario(4500);
        Leandro.setDepartamento("Importação e exportação");

        System.out.println("\nExibir detalhes de " + Leandro.getNome() + ":");
        System.out.println("Salario: " + Leandro.getSalario());
        Leandro.gerenciar();
        
    }
}