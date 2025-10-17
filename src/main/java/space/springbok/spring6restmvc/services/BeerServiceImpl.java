package space.springbok.spring6restmvc.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import space.springbok.spring6restmvc.model.Beer;
import space.springbok.spring6restmvc.model.BeerStyle;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author John Spangenberg
 */
@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID id) {
        log.debug("getBeerById({})", id);
        return Beer.builder()
                .id(id)
                .version(1)
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("123456")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(100)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
    }
}
