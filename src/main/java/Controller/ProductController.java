package Controller;

import Entity.Product;
import Entity.Warehouse;
import Interface.Communciate;
import Service.Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class ProductController {

    private final Communciate communciate;
    private final Service service;
    @PostMapping("/AddProduct")
    public String addProduct(@RequestBody Product product) {
        Warehouse warehouse = communciate.Check(product.getWarehouseId());
        return service.addProduct(product,warehouse);
    }

    @GetMapping("/GetProductByid/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }


}
