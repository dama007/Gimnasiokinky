/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio;

import java.util.Objects;

/**
 *
 * @author usu21
 */
public class Actividad {
    
    private String nombre;
        
    private int maxPlazas;
    
    private int inscritos;
    
    private double precio;

    public Actividad() {
    }

    public Actividad(String nombre, int maxPlazas, double precio) {
        this.nombre = nombre;
        this.maxPlazas = maxPlazas;
        this.precio = precio;
        inscritos = 0;
    }
    
    
    public boolean isFull() {
        return maxPlazas ==inscritos;
    }
    
    public int getPlazasDisponibles() {
        return maxPlazas -inscritos;
    }

    @Override
    public String toString() {
        return "Actividad{" + "nombre=" + nombre + ", maxPlazas=" + maxPlazas + ", inscritos=" + inscritos + ", precio=" + precio + '}';
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.nombre);
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
        final Actividad other = (Actividad) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public int getInscritos() {
        return inscritos;
    }

    public void setInscritos(int inscritos) {
        this.inscritos = inscritos;
    }


    public int getMaxPlazas() {
        return maxPlazas;
    }

    public void setMaxPlazas(int maxPlazas) {
        this.maxPlazas = maxPlazas;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
