/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author samum
 */
public class ContainerEff<T extends Inteface> {
    T temp;
    public ContainerEff(T c) {
       this.temp = c;       
    }
    public int execute(Pokemon p)
    {
        return temp.execute(p);
    }
            
    
}
