package gimnasio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usu21
 */
public class Socio {
    
    
    private int numSocio;
    private String nombre;
    private String telefono;
    
    private double cuota;
    
    private boolean vip;

    public Socio() {
    }

    public Socio(int numSocio, String nombre, String telefono, double cuota, boolean vip) {
        this.numSocio = numSocio;
        this.nombre = nombre;
        this.telefono = telefono;
        this.cuota = cuota;
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Socio{" + "numSocio=" + numSocio + ", nombre=" + nombre + ", telefono=" + telefono + ", cuota=" + cuota + ", vip=" + vip + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.numSocio;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Socio other = (Socio) obj;
        if (this.numSocio != other.numSocio) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
    

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }


    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

}
