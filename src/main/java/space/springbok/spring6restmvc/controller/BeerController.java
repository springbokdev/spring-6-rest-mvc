package space.springbok.spring6restmvc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import space.springbok.spring6restmvc.services.BeerService;

/**
 *
 * @author John Spangenberg
 */
@Controller
@RequiredArgsConstructor
public class BeerController {

    private final BeerService beerService;
}
