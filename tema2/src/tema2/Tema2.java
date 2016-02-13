
package tema2;

public class Tema2 {

    public static void main(String[] args) {
        
        //inicio cliente
        Cliente c = new  Cliente();
        c.nome = "Maria";
        c.sobrenome = "Bragança Silva";
        c.idade = 20;
        c.codCliente = 789456;
        c.saldoDisponivel = 3000;
        c.valorGasto = 1500;
        
        c.mostrarNomeCompleto();
        c.mostrarIdade();
        c.CalcularSaldoDisp();
        //fim cliente
        
        System.out.println("---------------------------------------");
        
        //inicio funcionario
        Funcionario f = new Funcionario();
        f.nome = "José";
        f.sobrenome = "Fernando Ferreira";
        f.idade = 30;
        f.codFuncionario = 123;
        f.valorSalario = 3000;
        
        f.mostrarNomeCompleto();
        f.mostrarIdade();
        f.MostrarCodFuncionario();
        f.MostrarSalario();
        
        //fim Funcionario
    }
    
}
