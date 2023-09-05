package pilares;

public class Carro extends Veiculo {


    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel(){
        System.out.println("CONFERE COMBUSTIVEL");
    }

    private void confereCambio(){
        System.out.println("CONFERE CAMBIO EM P");
    }
}
