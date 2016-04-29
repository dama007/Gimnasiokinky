/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio;

import java.util.ArrayList;

/**
 *
 * @author usu21
 */
public class ListaSocios {
    
        private ArrayList<Socio> lista;

    public ListaSocios() {
        lista = new ArrayList<>();
    }

    
    public void altaSocio(Socio s) {
        lista.add(s);
    }
    
    
    public boolean existe(Socio s) {
        return lista.contains(s);
    }
    
    
    public int cantidad() {
        return lista.size();
    }
    
    
    public Socio getSocio(int numSocio) {
        for (Socio s: lista) {
            if (s.getNumSocio() == numSocio) {
            return s;
        }
        }
        return null;
    }
    
    public double cuotasTotales() {
        double total = 0;
        for (Socio s: lista) {
            total += s.getCuota();
        }
        return total;
    }
    
        
    public ArrayList<Socio> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Socio> lista) {
        this.lista = lista;
    }

    
}
