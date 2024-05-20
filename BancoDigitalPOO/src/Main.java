import java.awt.image.BaseMultiResolutionImage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("João");
        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(cliente);
        cc.transferir(100,cp);
        cc.extracted();
        cp.extracted();
        Banco banco = new Banco();
        banco.setNome("Banco do Brasil");
        banco.adicionarConta(cc);
        banco.adicionarConta(cp);
        banco.listarContas();
        banco.removerConta(cc);
        banco.listarContas();




    }
}