public class Gerente extends Funcionario{

    private String departamento;

    public String getdepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public void gerenciar(){
        System.out.print("O gerente " + this.nome + " trata de: " + this.departamento);
    }
}