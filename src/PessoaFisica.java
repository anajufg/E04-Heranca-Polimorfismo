import java.sql.SQLOutput;

public class PessoaFisica extends Cliente {
    String cpf;
    int idade;
    char sexo;

    @Override
    void imprimir() {
        System.out.println("Data de criação: " + this.data);
        System.out.println("Dono da conta: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Gênero " + this.sexo);
        System.out.println("Idade: " + this.idade);
        System.out.println("Endereço: " + this.endereco);
    }
}
