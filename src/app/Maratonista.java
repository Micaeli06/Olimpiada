package app;

public class Maratonista extends Deportista{

    public String categoría;
    public double marca;
    public double velocidad;
    public double kmRecorrido;
    public int energia;
    public int edad;

    public boolean correr(){
        if (this.energia>0){
            this.velocidad = 20;
            this.energia-=5;
            this.playAnimacionCorrer();
            return true;
        }
        return false;
    }
    
    public void acelerar(){
        velocidad++;

    }
    public void playAnimacionCorrer() {

        System.out.print("\r");
        String blancos = "";
        for (int i = 100; i > energia; i--) {

            blancos += " ";

        }
        String cuerpo = "\\o/";

        if (this.energia % 2 != 0)
            cuerpo = "/o\\";

        System.out.print(blancos + cuerpo);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}