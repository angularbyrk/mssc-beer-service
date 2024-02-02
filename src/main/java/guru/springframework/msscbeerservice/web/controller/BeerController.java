package guru.springframework.msscbeerservice.web.controller;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer/")
public class BeerController {

    @GetMapping
    public ResponseEntity<BeerDto> listAllBeers(){
        return ResponseEntity.ok(null);
    }
    @PostMapping
    public ResponseEntity<BeerDto> saveNewBeer(@RequestBody BeerDto beerDto){
        return ResponseEntity.ok(beerDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID id){
        return ResponseEntity.ok(BeerDto.builder().beerName("abc").build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<BeerDto> updateBeer(@PathVariable UUID id, @RequestBody BeerDto beerDto){
        return ResponseEntity.ok(beerDto);
    }

}
