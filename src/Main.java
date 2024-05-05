import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Conta[] contas = new Conta[2];
        PessoaFisica ana = new PessoaFisica();
        PessoaJuridica loja = new PessoaJuridica();

        ana.data = new Date();
        ana.nome = "Ana";
        ana.endereco = "Minha casa";
        ana.cpf = "123456789";
        ana.sexo ='f';
        ana.idade = 16;

        loja.data = new Date();
        loja.nome = "Acquavia";
        loja.endereco = "Loja";
        loja.cnpj = "123456789";
        loja.setor = "Comércio";
        loja.numFuncionarios = 10;

        contas[0] = new Conta();
        contas[0].setDono(ana);
        contas[0].setNumero(87654321);
        contas[0].setLimite(5000);
        contas[0].depositar(4000);
        contas[0].imprimir();

        System.out.println();

        contas[1] = new Conta();
        contas[1].setDono(loja);
        contas[1].setNumero(87654322);
        contas[1].setLimite(1000000);
        contas[1].depositar(80000);
        contas[1].imprimir();
        
        // Imprime a média de operações realizadas em relação ao número de contas
        System.out.println("Média de operações realizadas em relação ao número de contas: " + (Operacao.getTotalOperacoes()/Conta.getTotalContas()));

    }
}
