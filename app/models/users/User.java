package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


public class User extends Models {

    //@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY) 
	//public Long id;
	
	@Constraints.Required
    @Id
    private String email;

    @Column(insertable=false, updatable=false)
    private String role;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String password;


    // Default constructor
    public  User() {
    }
    // Constructor to initialise object
    public  User(String email, String role, String name, String password) {
        this.email = email;
        this.role = role;
        this.name = name;
        this.password = password;
    }

	//Generic query helper for entity User with unique id String
    public static Finder<String,User> find = new Finder<String,User>(User.class);
    //find all users on the database
    public static List<User> findAll() {
     return User.find.all();


    }
    
    public	static User authenticate(String email, String password) {
        // If found return the user object with matching username and password
        return find.query().where().eq("email", email).eq("password", password).findUnique();
    }

    // Check if a user is logged in (by id - email address)
    public static User getLoggedIn(String id) {
        if (id == null)
                return null;
        else
            // Find user by id and return object
            return find.byId(id);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}