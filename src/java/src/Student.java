package src;

import javax.faces.bean.ManagedBean;
/**
 *
 * @author Edward Andres Moron Quintana
 */
@ManagedBean
public class Student {
    // fields
    private String firstName;
    private String lastName;
    private String country;
    
    //no-arg constructor
    public Student(){
    
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
}
