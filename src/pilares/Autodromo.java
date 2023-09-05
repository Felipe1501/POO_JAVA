package pilares;

public class Autodromo {
    public static void main(String[] args) {
        Carro mercedes = new Carro();
        mercedes.setChassi("416465");
        // mercedes.ligar();

        Moto f800 = new Moto();
        f800.setChassi("54455");
        // f800.ligar();

        Veiculo coringa = mercedes;

        coringa.ligar();
    }
}
