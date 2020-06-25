/* this is war
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author amrit
 */
public class Citizen {
     private String name = "Anjaan the Unknown";
    private double skillLevel = 0;
    public Citizen(){
        
    }
    public Citizen(String name , double skillLevel){
        this.name = name;
        this.skillLevel =skillLevel;
        
    }

    public void setName(String name) {
        if(name != "")
        this.name = name;
        else 
            System.out.println("Yhe name is invalid");
        
            
    }

    public void setSkillLevel(double skillLevel) {
        if(skillLevel>0)
        this.skillLevel = skillLevel;
                else 
            System.out.println("The skillLevel is invalid");
            
    }
    
    

    public String getName() {
        return name;
    }

    public double getSkillLevel() {
        return skillLevel;
    }
    

    
}
