import banco_digital.Cliente;
import banco_digital.Conta;
import banco_digital.ContaCorrente;
import banco_digital.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Cliente paucia = new Cliente();
        paucia.setNome("Paucia");

        Conta cc = new ContaCorrente(paucia);
        Conta poupanca = new ContaPoupanca(paucia);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}