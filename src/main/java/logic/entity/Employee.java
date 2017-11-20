package logic.entity;

import java.util.Set;

public class Employee {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNr;
    private Set<Role> roles;

    public Employee(int id, String email, String password, String firstName, String lastName, String phoneNr, Set<Role> roles) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNr = phoneNr;
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
