package Controller;

import Entity.Product;
import Entity.Warehouse;
import Interface.Communciate;
import Service.Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProductController {

    private final Communciate communciate;
    private final Service service;
    @PostMapping("/AddProduct")
    public String addProduct(Product product) throws Exception {
        Warehouse warehouse = communciate.check(product);
        return service.addProduct(product,warehouse);
    }

    @GetMapping("/GetProductByid/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }


}
