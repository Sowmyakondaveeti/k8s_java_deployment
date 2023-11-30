package uk.co.danielbryant.djshopping.Stockmanager;
 
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class healthcheck {
    @GetMapping("/healthcheckST")
    public String healthcheck() {
        return "Hello User this response from Stock Manager !! " + new Date();
    }
}
