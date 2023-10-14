/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

/**
 *
 * @author david
 */
public class Portero extends Futbolista implements Comparable{
    
    public int golesRecibidos;
    public byte dorsal;
        
    public Portero(String nombre, int edad, int golesRecibidos, byte dorsal){
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public int compareTo(Object f) {
        Portero p = (Portero) f;
        return Math.abs(this.golesRecibidos - p.golesRecibidos);
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }
    
    public String toString(){
        String s = super.toString();
        return s+" con el dorsal " +dorsal+". Le han marcado "+ golesRecibidos; 
    }
    
}
