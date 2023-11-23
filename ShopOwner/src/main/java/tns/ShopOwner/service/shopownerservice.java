package tns.ShopOwner.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tns.ShopOwner.entity.shopowner;
import tns.ShopOwner.repository.shopownerrepository;
/**Service class: All the business logic of the app is here
* Create service to add values to the database
* These classes are auto-detected by the spring context when the annotation-based configuration is used 
* along with class path scanningAutowired : SB creates an instance of EmployeeRepository and injects into 
* EmployeeService
*/
@Service
public class shopownerservice {
@Autowired
shopownerrepository shopownerrepository;
/**logic for saving an entity to the database: Here we are creating a save method in our service which will
* be calling the save method of the repository so all these methods are predefined in the repository so
* when you have your jpa repository it gives you awhole bunch of method for saving for updating for 
* fetching and for deleting so you don't have to write anything yourself so this is the beauty of
spring boot so i write this save method this is going to save an entity to my database 
*/
public shopowner save(shopowner shop)
{
return shopownerrepository.save(shop);
}
public shopowner getshopowner(int id)
{
return shopownerrepository.findById(id).get();
}
public shopowner update(int id,shopowner shopowners)
{
shopowner shop =shopownerrepository.findById(id).get();
shop.setName(shopowners.getName());
shop.setdob(shopowners.getdob());
return shopownerrepository.save(shop);
}
public String delete(int id)
{
shopownerrepository.deleteById(id);
return "Entity with this id is deleted"+id;
}
public List<shopowner> getshoplist()
{
return shopownerrepository.findAll();
}
}