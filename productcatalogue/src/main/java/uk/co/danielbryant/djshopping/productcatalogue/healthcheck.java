package uk.co.danielbryant.djshopping.productcatalogue;
 
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class healthcheck {
    @GetMapping("/healthcheckPD")
    public String example() {
        return "Hello User this response from Productcatalogue !! " + new Date();
    }
}
