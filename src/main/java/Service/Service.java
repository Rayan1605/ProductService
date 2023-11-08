package Service;

import Entity.Product;
import Entity.Warehouse;

import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Service
public class Service {
    Map<Integer,Product> products = new HashMap<>();
    public String addProduct(Product product, Warehouse warehouse){

        if (warehouse.getCapacity() < product.getQuantity()){
            return "No space available to add Product";
        }
        products.put(product.getProductid(),product);
        return "Product added";


    }

    public Product getProductById(int id) {
        if (products.containsKey(id)){
            return products.get(id);
        }
        return new Product(id,"Product Not Found",0,0);
    }

}
