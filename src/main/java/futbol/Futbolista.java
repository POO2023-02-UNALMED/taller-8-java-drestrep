/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

/**
 *
 * @author david
 */
public  class Futbolista implements Comparable{
    private String nombre;
    private int edad;
    private final String posicion;
    
    public Futbolista(String nombre, int edad, String posicion){
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }
    
    public Futbolista(){
        this.nombre = "Maradona";
        this.edad = 30;
        this.posicion = "delantero";
    }
    
    @Override
    public String toString(){
        return "El futbolista "+ nombre+ " tiene " + edad +", y juega de "+ posicion;
    }
    
    
    public boolean equals (Futbolista f){
        Object d = (Object) f; 
        return this.equals(d);

//        if (this.edad == f.edad  && this.nombre.equals(f.nombre) && this.posicion.equals(f.posicion)){
//            return true;
//        }else{
//            return false;
//        }
    }
    
    public boolean jugarConLasManos(){
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion(){
        return posicion;
    }

    @Override
    public int compareTo(Object o){
        return 0;
    }

}
