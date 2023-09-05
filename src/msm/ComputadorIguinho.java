package msm;

public class ComputadorIguinho {
    public static void main(String[] args) {
       System.out.println("MSM");
       MSMMensseger msn = new MSMMensseger();
       msn.enviarMensagem(); 
       msn.receberMensagem();

       System.out.println("FACE");
       FacebookMensseger fb = new FacebookMensseger();
       fb.enviarMensagem(); 
       fb.receberMensagem();

       System.out.println("TELEGRAM");
       TelegramMensseger tl = new TelegramMensseger();
       tl.enviarMensagem(); 
       tl.receberMensagem();
    }
    
}
