/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author usu21
 */
public class ListaActividades implements Serializable {
    
    private ArrayList<Actividad> lista;

    public ListaActividades() {
        lista = new ArrayList<>();
    }
    
    
    public void altaActividad(Actividad a) {
       lista.add(a);
    }
    public boolean existe(Actividad a) {
        return lista.contains(a);
    }
    
    
    public int cantidad() {
        return lista.size();
    }
    
    
    public Actividad getActividad(String nombre) {
        for (Actividad a: lista) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                return a;
            }
        }
        return null;
        
    }
    
    
    public ArrayList<Actividad> actividadesDisponibles() {
        ArrayList<Actividad> disponibles = new ArrayList<>();
        for (Actividad a: lista) {
            if (!a.isFull()) {
                disponibles.add(a);
            }
        }
        return disponibles;
    }
        
        
        
        

    public ArrayList<Actividad> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Actividad> lista) {
        this.lista = lista;
    }

    
    
    
}
