package space.springbok.spring6restmvc.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import space.springbok.spring6restmvc.model.Beer;
import space.springbok.spring6restmvc.services.BeerService;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author John Spangenberg
 */
@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    @GetMapping
    public List<Beer> listBeers() {
        log.debug("listBeers()");
        return beerService.listBeers();
    }

    @GetMapping("/{beerId}")
    public Beer getBeerById(@PathVariable("beerId") UUID id) {
        log.debug("getBeerById({})", id);
        return beerService.getBeerById(id);
    }
}
