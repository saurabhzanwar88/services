package com.example.paul.controllers;

import com.example.paul.services.CustomerService;
import com.example.paul.services.TransactionService;
import com.example.paul.utils.CustomerInput;
import com.example.paul.utils.InputValidator;
import com.example.paul.utils.TransactionInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1")
public class CustomerRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerRestController.class);

    private static final String INVALID_TRANSACTION =
            "Account information is invalid or transaction has been denied for your protection. Please try again.";

    private CustomerService customerservice;

    @Autowired
    public CustomerRestController(CustomerService customerservice) {
        this.customerservice = customerservice;
    }

    @PostMapping(value = "/customerAdd",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addCustomer(
            @Valid @RequestBody CustomerInput customerinput) {
        
    		boolean isCustomerAdded = customerservice.addCustomer(customerinput);
    		System.out.println("hello"+customerinput.getEmail());
            return new ResponseEntity<>(isCustomerAdded, HttpStatus.OK);
        
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        return errors;
    }
}
