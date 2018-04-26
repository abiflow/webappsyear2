package models;
import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


public class Book{

private Long id;
private Long isbn;
private String genre;
private Long agegroup;
private Long stock;
private Double quantity;

//constructors
public Book(){

}
public Book( Long id,Long isbn,String genre,Long agegroup,Long stock,Double quantity) {
this.id= id;
this.isbn= isbn;
this.genre= genre;
this.agegroup= agegroup;
this.stock= stock;
this.quantity= quantity;

}
//accessor method
public  Long getId() {
return this.id;   
}
public void setId(Long id){
this.id=id;
}   

public  Long getIsbn() {
return this.isbn;   
}
public void setIsbn(Long isbn){
this.isbn=isbn;
}   
public String getGenre() {
return this.genre;   
}
public void setId(String genre){
this.genre=genre;
}   
public Long getAgegroup() {
return this.agegroup;   
}
public void setAgegroup(Long agegroup){
    this.agegroup=agegroup;
}
public Long getStock() {
    return this.stock;   
    }
    public void setStock(Long stock){
    this.stock=stock;
}   
    public Double getQuantity() {
        return this.quantity;   
        }
    public void setQuantity(Double quantity){
    this.quantity=quantity;
}   
            

}
