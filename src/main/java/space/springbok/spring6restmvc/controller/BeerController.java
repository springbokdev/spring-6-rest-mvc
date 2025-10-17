package space.springbok.spring6restmvc.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import space.springbok.spring6restmvc.model.Beer;
import space.springbok.spring6restmvc.services.BeerService;

import java.util.UUID;

/**
 *
 * @author John Spangenberg
 */
@Controller
@RequiredArgsConstructor
@Slf4j
public class BeerController {

    private final BeerService beerService;

    public Beer getBeerById(UUID id) {
        log.debug("getBeerById({})", id);
        return beerService.getBeerById(id);
    }
}
