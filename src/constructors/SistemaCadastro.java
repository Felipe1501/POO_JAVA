package constructors;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa cassio = new Pessoa("123", "CASSIO RAMOS");


        cassio.setEndereco("PARQUE SAO JORGE");

        System.out.println(cassio.getNome() + "-" + cassio.getCpf());
    }
}
