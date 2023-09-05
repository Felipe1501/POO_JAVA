package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(18);
        felipe.setSexo("MASCULINO");

        System.out.println("O Aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos e é do sexo " + felipe.getSexo() + ".");
    }
}
