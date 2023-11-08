package Interface;

import Entity.Product;
import Entity.Warehouse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "TalktoWarehouse", url= "http://localhost:8083")
public interface Communciate {

    @GetMapping("/check")
     Warehouse check(int id);
}
