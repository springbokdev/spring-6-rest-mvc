package space.springbok.spring6restmvc.services;

import space.springbok.spring6restmvc.model.Beer;

import java.util.UUID;

/**
 *
 * @author John Spangenberg
 */
public interface BeerService {

    Beer getBeerById(UUID id);
}
