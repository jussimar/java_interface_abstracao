package tema2;

public class Cliente extends Pessoa{
    public int codCliente;
    public double saldoDisponivel;
    public double valorGasto;
    
    @Override
    public void mostrarNomeCompleto(){
        System.out.println("Nome Cliente: " + nome + " " + sobrenome);
    }
    @Override
    public void mostrarIdade(){
        System.out.println("Idade Cliente: " + idade);
    }
    
    public void CalcularSaldoDisp(){
        double total;
        
        total = saldoDisponivel - valorGasto;
        
        System.out.println("Saldo Dipsonivel: " + total);
    } 
}
