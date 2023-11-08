package Controller;

import Product.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @PostMapping
    public String addProduct(Product product) throws Exception {

        return  "No space available to add Product";
    }


}
