package tema2;

public class Funcionario extends Pessoa implements IFuncoes{
    public int codFuncionario;
    public double valorSalario;
    
    
    @Override
    public void mostrarNomeCompleto(){
        System.out.println("Nome Funcionario: " + nome + " " + sobrenome);
    }
    @Override
    public void mostrarIdade(){
        System.out.println("Idade Funcionario: " + idade);
    }

    @Override
    public void MostrarSalario() {
        System.out.println("Salario: " + valorSalario);
    }

    @Override
    public void MostrarCodFuncionario() {
        System.out.println("Cod. Funcionario: " + codFuncionario);
    }
}
