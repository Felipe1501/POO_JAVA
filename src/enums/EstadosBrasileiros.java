package enums;

public enum EstadosBrasileiros {
    SAO_PAULO ("SP", "São Paulo", 11),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 12),
    PIAUI ("PI", "Piaui", 13),
    MARANHAO ("MA", "Maranhao", 14),
    MINAS_GERAIS ("MG", "Minas Gerais", 15);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadosBrasileiros(String sigla, String nome, int ibge){
         this.sigla = sigla;
         this.nome = nome;
         this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getSigla(){
        return sigla;
    }

    public String getNome() {
        return nome;
    }

   public String getNomeMaiusculo(){
        return nome.toUpperCase();
   }
}
