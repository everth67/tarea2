
/**
 * Write a description of class ArmaDefuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArmaDefuego{
    private int numeroCalibre;
    private double precio;
    private String tipoArma;
    public ArmaDefuego(int numerocalibre, double precio, String tipopArma){
       this.numeroCalibre = numeroCalibre;
       this.precio = precio;
       this.tipoArma = tipoArma;
    }
    public ArmaDefuego(){
       this.numeroCalibre = 24;
       this.precio = 3500;
       this.tipoArma = "ak47";
    }
    public void cambiarTipoDeArma(String nTipoArma){
        tipoArma = nTipoArma;
    }
    public void cambiarPrecio(double nPrecio){
        precio = nPrecio;
    }
    public void cambiarNumeroCalibre(int nNumeroCalibre){
        numeroCalibre = nNumeroCalibre;
    }
}
