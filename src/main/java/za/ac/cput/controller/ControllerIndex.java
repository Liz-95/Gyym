package za.ac.cput.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerIndex {

    @RequestMapping(value = {"/", "/gyym"})
    public ResponseEntity<String> home(){
        return new ResponseEntity<>("Welcome to the Gym application! Knock yourself out!", HttpStatus.OK);
    }


}
