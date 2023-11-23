package tns.ShopOwner.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class shopowner {
@Id
@GeneratedValue
int id;
String name;
String dob ;
String address;
int shop_id; 
public shopowner() {
super();
// TODO Auto-generated constructor stub
}
public shopowner(int id,String name,String dob,String address,int shop_id) {
super();
this.id = id;
this.name = name;
this.dob = dob;
this.address = address;
this.shop_id = shop_id;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getdob() {
return dob;
}
public void setdob(String dob) {
this.dob = dob;
}
public String getaddress() {
return address;
}
public void setaddress(String address) {
this.address = address;
}
public int getshop_id() {
return shop_id;
}
public void setshop_id(int shop_id) {
this.shop_id = shop_id;
}

}