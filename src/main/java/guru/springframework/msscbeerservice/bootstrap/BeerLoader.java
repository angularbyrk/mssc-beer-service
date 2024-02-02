package guru.springframework.msscbeerservice.bootstrap;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.respositories.BeerRepository;
import guru.springframework.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {
    @Autowired
    BeerRepository beerRepository;
    @Override
    public void run(String... args) throws Exception {
        loadBeers();
    }

    private void loadBeers() {
        beerRepository.save(Beer.builder()
                .beerName("Mango Bobs")
                .beerStyle(BeerStyleEnum.ALE)
                .quantityToBrew(200)
                .minOnHand(12)
                .upc(337010000001L)
                .price(new BigDecimal("12.95"))
                .build());

        beerRepository.save(Beer.builder()
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.LAGER)
                .quantityToBrew(200)
                .minOnHand(12)
                .upc(337010000002L)
                .price(new BigDecimal("11.95"))
                .build());
        System.out.println("Loaded beers "+beerRepository.count());
    }
}
