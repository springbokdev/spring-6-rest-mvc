package space.springbok.spring6restmvc.services;

import space.springbok.spring6restmvc.model.Beer;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author John Spangenberg
 */
public interface BeerService {

    List<Beer> listBeers();

    Beer getBeerById(UUID id);

    Beer saveNewBeer(Beer beer);
}
