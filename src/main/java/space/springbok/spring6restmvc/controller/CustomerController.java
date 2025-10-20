package space.springbok.spring6restmvc.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
