/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CarlosLuevanos
 */

public class Vehiculo {
    
    // 01 - Definir variables de instancia
    
    private String marca;
    private double precio;
    private String motor;
   
    
    // 02 - Definir constructor
    
    public Vehiculo(String marca, double precio, String motor) {
        
       this.marca = marca;
       this.precio = precio;
       this.motor = motor;
        
    }
 
    // 03 - Metodos
    
    public String getMarca() {
        
        return this.marca;
        
    }
    
    public double getPrecio() {
        
        return this.precio;
        
    }
    
    public String getMotor() {
        
        return this.motor;
        
    }
    
    public void setMarca(String marca) {
        
        this.marca = marca;
        
    }
    
    public void setPrecio(double precio) {
        
        this.precio = precio;
        
    }
    
    public void setMotor(String motor) {
        
        this.motor = motor;
        
    }
    
    @Override
    
    public String toString() {
        
        String cadena;
        cadena = "Marca = " + this.marca 
                + "\nPrecio = " + this.precio 
                + "\nMotor = " + this.motor; 
        
        return cadena;
        
    }
    
}