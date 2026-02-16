/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CarlosLuevanos
 */

public class Venta {
    
    // 01 - Definir variables de instancia
    
    private int cantidad;
    private Vehiculo vehiculo;
    private Cliente cliente;
   
    
    // 02 - Definir constructor
    
    public Venta(int cantidad, Vehiculo vehiculo, Cliente cliente) {
        
       this.cantidad = cantidad;
       this.vehiculo = vehiculo;
       this.cliente = cliente;
        
    }
 
    // 03 - Metodos
    
    public int getCantidad() {
        
        return this.cantidad;
        
    }
    
    public Vehiculo getVehiculo() {
        
        return this.vehiculo;
        
    }
    
    public Cliente getCliente() {
        
        return this.cliente;
        
    }
    
    public void setCantidad(int cantidad) {
        
        this.cantidad = cantidad;
        
    }
    
    public void setVehiculo(Vehiculo vehiculo) {
        
        this.vehiculo = vehiculo;
        
    }
    
    public void setCliente(Cliente cliente) {
        
        this.cliente = cliente;
        
    }
    
    @Override
    
    public String toString() {
        
        String cadena;
        cadena = "Cantidad = " + this.cantidad 
                + "\nVehiculo = " + this.vehiculo 
                + "\nCliente = " + this.cliente; 
        
        return cadena;
        
    }
    
}
