/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Marco
 */
public class Cadenas {
 
public final long ITERA = 100000;

private long tiempo;

public static void main (String[] args){
    
    Cadenas objetoCadenas=new Cadenas();
    String valorCadena="CoDeJaVu";
    String usoString=objetoCadenas.calculaTiempoString(valorCadena);
    String usoStringBuffer=objetoCadenas.calculaTiempoStringBuffer(valorCadena);
    String usoStringBuilder=objetoCadenas.calculaTiempoStringBuilder(valorCadena);
    
    System.out.println("Tiempo concatenacion string: "+usoString+ "\n Tiempo de concatenacion string buffer: "+usoStringBuffer+"\n Tiempo de concatenacion String builder: "+usoStringBuilder);
            
 }


public String calculaTiempoString(String valor)

{
    
    String cadena= "";
    tiempo = System.currentTimeMillis() - tiempo;
    for(int i=0; i<ITERA; i++){
    cadena += valor;
     }
    tiempo = System.currentTimeMillis() - tiempo;
    return tiempo + "milisegundos";
    
        
    }
    
    public String calculaTiempoStringBuffer(String valor)
    {
    StringBuffer cadena= new StringBuffer();
    long tiempo = System.currentTimeMillis();
    for(int i=0; i<ITERA; i++){
        cadena.append(valor);
    }
    
    tiempo = System.currentTimeMillis() - tiempo;
    return tiempo + "milisegundos";
    
    
 }
    public String calculaTiempoStringBuilder(String valor)
    {
    StringBuilder cadena= new StringBuilder();
    long tiempo = System.currentTimeMillis();
    for(int i=0; i<ITERA; i++){
        cadena.append(valor);
    }
    
    tiempo = System.currentTimeMillis() - tiempo;
    return tiempo + "milisegundos";
    
    
 }
        
    
}
