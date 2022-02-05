/**
 * MultiplyNumbers.java
 * @author Keallan Saunders 219169357
 * DomainClass GETTER CLASS
 * 05 Feb 2022
 */
package za.ac.cput.Domain;

public class MultiplyNumbers {
    private String sname;
    private boolean boost = true;

    public MultiplyNumbers(String sname){
      this.sname= sname;
    }
    public String getSname(){
     return sname;
    }
    public boolean Boosting(){

        return boost;
    }
}
