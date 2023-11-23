package tns.ShopOwner.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tns.ShopOwner.entity.shopowner;
import tns.ShopOwner.service.shopownerservice;
/**
* @Rest controller : EmployeeController : Acts as Rest Controler
* "/employees" - All the end points should be prepended with employees
* (@RequestBody Employee employee) annotation known as request body it takes the json and it converts 
* the json to the employee so we* are going to pass the json from our postman and that json will be
* converted to the employee object
* @PostMapping : signifies that we want to create a new entity in our database
* @PathVariable : Get the value from URL
*/
@RestController
public class shopownercontroller {
@Autowired
shopownerservice shopownersservice;
// http://localhost:8071/student - Post
@RequestMapping("/shopowners")
@PostMapping
public shopowner addshopowner(@RequestBody shopowner shopowners)
{
return shopownersservice.save(shopowners);
}
// http://localhost:8075/customers/2 - Get
@GetMapping(path="/{id}")
public shopowner getshopowner(@PathVariable int id)
{
return shopownersservice.getshopowner(id);
}
// http://localhost:8075/customers/2 - Put
@PutMapping(path="/{id}")
public shopowner updateshopowner(@RequestBody shopowner shopowners, @PathVariable int id)
{
return shopownersservice.update(id,shopowners);
}
// http://localhost:8075/customers/2 - Delete
@DeleteMapping(path="/{id}")
public String deleteshopowner(@PathVariable int id)
{
return shopownersservice.delete(id); 
}
// http://localhost:8071/customers Get
@GetMapping
public List<shopowner> getAllshopowner()
{
return shopownersservice.getshoplist();
}
}