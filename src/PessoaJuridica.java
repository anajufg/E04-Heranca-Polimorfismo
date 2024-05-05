public class PessoaJuridica extends Cliente {
    String cnpj;
    int numFuncionarios;
    String setor;

    @Override
    void imprimir() {
        System.out.println("Data de criação: " + this.data);
        System.out.println("Dono da conta: " + this.nome);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Setor: " + this.setor);
        System.out.println("Numero de funcionarios: " + this.numFuncionarios);

    }
}
