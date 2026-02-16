/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CarlosLuevanos
 */

public class Cliente {
    
    // 01 - Definir variables de instancia
    
    private String rs;
    private String rfc;
    private String email;
   
    
    // 02 - Definir constructor
    
    public Cliente(String rs, String rfc, String email) {
        
       this.rs = rs;
       this.rfc = rfc;
       this.email = email;
        
    }
 
    // 03 - Metodos
    
    public String getRs() {
        
        return this.rs;
        
    }
    
    public String getRfc() {
        
        return this.rfc;
        
    }
    
    public String getEmail() {
        
        return this.email;
        
    }
    
    public void setRs(String rs) {
        
        this.rs = rs;
        
    }
    
    public void setRfc(String rfc) {
        
        this.rfc = rfc;
        
    }
    
    public void setEmail(String email) {
        
        this.email = email;
        
    }
    
    @Override
    
    public String toString() {
        
        String cadena;
        cadena = "rs = " + rs 
                + "\nrfc = " + rfc 
                + "\nemail = " + email; 
        
        return cadena;
        
    }
    
}