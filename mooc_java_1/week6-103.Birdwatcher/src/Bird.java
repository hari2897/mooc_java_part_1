/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hakr
 */
import java.util.ArrayList;

public class Bird {
    
    private String name;
    private String latName;
    private int observed = 0;
    
    public Bird(String name, String latname){
        this.name = name;
        this.latName = latname;
        this.observed = 0;
    }
    
public String getName()
{
    return this.name;
}

public String getLatin(){
    return this.latName;
}

public void Observed(){
    //The observation counter
    this.observed++;
}

public int Observation(){
    
    //Returns the observed number . Number of times the bird is observed
    return this.observed;
}
}
    
    