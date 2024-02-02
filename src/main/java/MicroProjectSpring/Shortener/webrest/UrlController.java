package MicroProjectSpring.Shortener.webrest;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import MicroProjectSpring.Shortener.logical.UrlService;
import MicroProjectSpring.Shortener.bdd.Url;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class UrlController {

    @Autowired
    UrlService service;

    @GetMapping("/getAllUrl")
    public List<Url> getAllUrl() {
        return service.getAllUrl();
    }
    
    @PostMapping("/createUrl")
    public String createUrl(@RequestBody Map<String, String> RequestBody) {
        String inUrl =RequestBody.get("inUrl");
        String temp = service.filterUrl(inUrl);
        
        return service.createUrl(temp,inUrl);
    }
    
    
}
