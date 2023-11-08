package Interface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "TalktoWarehouse", url= "http://localhost8083")
public interface Communciate {

    @GetMapping("/check")
    public Warehouse
}
