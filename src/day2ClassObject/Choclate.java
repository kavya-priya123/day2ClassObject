package day2ClassObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Choclate {
	
	@Getter
	@Setter
	 private String description;
	@Getter
	@Setter
	 private double weight;
	@Getter
	@Setter
	 private  double price;
	@Getter
	@Setter
	 private String packing;
	@Getter
	@Setter
	 private boolean sugarFree;
   /*   
       public Choclate() {
    	   
       }
       public Choclate(String description,double weight,double price,String packing, boolean b) {
           this.description = description;
           this.weight = weight;
           this.price = price;
           this.packing = packing;
           this.sugarFree = sugarFree;
       }
       
       public String getDescription() {
    	   return description;
       }
       
       public double getWeight() {
    	   return weight;
       }
       
       public void setWeight(double weight) {
    	   this.weight = weight;
       }
       
       public double getPrice() {
    	   return price;
       }
       
       public void setPacking(String packing) {
    	   this.packing = packing;
       }
       
       public void setSugarFree(boolean sugarFree) {
    	   this.sugarFree = sugarFree;
       }
    
       @Override
       public String toString() {
    	   return "Choclate [description="+description+",weight="+weight+",price="+price+",packing="+packing+"]";
       }
   */
       
       }
       