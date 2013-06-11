/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author camilortte
 */
public class Reparte {
    private ArrayList<Astro> Astros;
    private ArrayList<Astro> Astros_cliente;
    private ArrayList<Astro> Astros_servidor;
    
    
    
    public Reparte(){        
        Astros=new  ArrayList();
        Astros_cliente=new  ArrayList();
        Astros_servidor=new  ArrayList();
        
        Astros.clear();
        inicializacionAstros();
    }

    public ArrayList<Astro> getAstros() {
        return Astros;
    }

    public void setAstros(ArrayList<Astro> Astros) {
        this.Astros = Astros;
    }

    public ArrayList<Astro> getAstros_cliente() {
        return Astros_cliente;
    }

    public void setAstros_cliente(ArrayList<Astro> Astros_cliente) {
        this.Astros_cliente = Astros_cliente;
    }

    public ArrayList<Astro> getAstros_servidor() {
        return Astros_servidor;
    }

    public void setAstros_servidor(ArrayList<Astro> Astros_servidor) {
        this.Astros_servidor = Astros_servidor;
    }
    
    private void inicializacionAstros(){
        Astros.add(new Astro("Mercurio","0",5.0,4.0,5.0,3.0,2.0,1.0,1.0,1.0,1.0));
        Astros.add(new Astro("Venus","1",5.0,4.0,5.0,3.0,2.0,1.0,1.0,1.0,1.0));
        Astros.add(new Astro("Tierra","2",5.0,4.0,5.0,3.0,2.0,1.0,1.0,1.0,1.0));
        Astros.add(new Astro("Marte","3",5.0,4.0,5.0,3.0,2.0,1.0,1.0,1.0,1.0));
        Astros.add(new Astro("Jupiter","4",5.0,4.0,5.0,3.0,2.0,1.0,1.0,1.0,1.0));
        Astros.add(new Astro("Saturno","5",5.0,4.0,5.0,3.0,2.0,1.0,1.0,1.0,1.0));
        Astros.add(new Astro("Urano","6",5.0,4.0,5.0,3.0,2.0,1.0,1.0,1.0,1.0));
        Astros.add(new Astro("Neptuno","7",5.0,4.0,5.0,3.0,2.0,1.0,1.0,1.0,1.0));
        
    }
    
    public void repartirAstros(){
        ArrayList<Integer> numeros=new ArrayList();
        int random = (int) Math.floor(Math.random()*(Astros.size()-1-0+1)+0); 
        while(numeros.size()!=Astros.size()/2){
            if(!numeros.contains(random)){
                numeros.add(random);
            }
            random = (int) Math.floor(Math.random()*(Astros.size()-1-0+1)+0); 
        }
        
        for(int i=0;i<Astros.size();i++){
            if(numeros.contains(i)){
                Astros_cliente.add(Astros.get(i));
            }else{
                Astros_servidor.add(Astros.get(i));
            }
        }        
    }
    
    
}
