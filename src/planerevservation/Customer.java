/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planerevservation;

import java.util.Objects;

/**
 *
 * @author moayy
 */
public class Customer {
      private Integer id;
    private String name;
    private String surname;
    private String email;

    public Customer() {
    }

    public Customer(Integer id, String name, String surname, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        } 
        else if (object != null && this.getClass() == object.getClass()) {
            Customer customer = (Customer)object;
            return Objects.equals(this.id, customer.id) && Objects.equals(this.name, customer.name) &&
                   Objects.equals(this.surname, customer.surname) && this.email.equals(customer.email);
        } 
        else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.email});
    } 
}
