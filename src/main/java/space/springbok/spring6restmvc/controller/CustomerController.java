package space.springbok.spring6restmvc.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import space.springbok.spring6restmvc.model.Beer;
import space.springbok.spring6restmvc.model.Customer;
import space.springbok.spring6restmvc.services.CustomerService;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author John Spangenberg
 */
@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> handlePost(@RequestBody Customer customer) {
        log.debug("handlePost({})", customer);
        Customer savedCustomer = customerService.saveNewCustomer(customer);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/customer/" + savedCustomer.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }
    @GetMapping
    public List<Customer> listCustomers() {
        log.debug("listCustomers()");
        return customerService.listCustomers();
    }

    @GetMapping("/{customerId}")
    public Customer getCustomerById(@PathVariable("customerId") UUID id) {
        log.debug("getCustomerById({})", id);
        return customerService.getCustomerById(id);
    }
}
