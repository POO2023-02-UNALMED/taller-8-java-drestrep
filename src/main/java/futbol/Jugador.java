/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

/**
 *
 * @author david
 */
public class Jugador extends Futbolista implements Comparable{
    
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }
    
    public Jugador(){
        super();
        golesMarcados = 289;
        dorsal = 7;
    }
    
    @Override
    public boolean jugarConLasManos(){
        return false;
    }
    
    @Override
    public int compareTo(Object f) {
        Jugador j = (Jugador) f;
        return Math.abs(j.getEdad() - this.getEdad());
    }
    
    public String toString(){
        String s = super.toString();
        return s+" con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
    }
}
