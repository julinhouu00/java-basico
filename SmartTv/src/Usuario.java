public class Usuario {
    public static void main(String[] args) throws Exception {
        
SmartTv smartTv = new SmartTv();

System.out.println("Volume atual: "+smartTv.volume);
System.out.println("Canal atual: "+smartTv.canal);

smartTv.diminuirvolume();
smartTv.diminuirvolume();
smartTv.diminuirvolume();
smartTv.aumentarvolume();

smartTv.mudarCanal(13);

System.out.println("TV ligada? "+smartTv.ligada);
System.out.println("Canal atual: "+smartTv.canal);
System.out.println("Volume atual: "+smartTv.volume);

smartTv.ligar();
System.out.println("TV ligada? Novo Status: "+smartTv.ligada);

smartTv.Desligar();
System.out.println("TV ligada? Novo Status: "+smartTv.ligada);
    }
}


