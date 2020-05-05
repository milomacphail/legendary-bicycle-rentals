package com.bicyclerentals.legendary.resources;
import com.bicyclerentals.legendary.models.Bicycle;
import com.bicyclerentals.legendary.models.CatalogItem;
import com.bicyclerentals.legendary.models.UserRating;
import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class BicycleCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

        UserRating ratings = restTemplate.getForObject("http://bicycle-ratings-service/ratingsdata/users/" + userId, UserRating.class);

        return ratings.getUserRating().stream().map(bicycleRating -> {
            Bicycle bicycle = restTemplate.getForObject("http://bicycle-info-service/bicycles/" + bicycleRating.getBicycleId(), Bicycle.class);
            return new CatalogItem(bicycle.getName(), "Desc", bicycleRating.getBicycleRating());
        }).collect(Collectors.toList());

        /*return ratings.getUserRating().stream().map(bicycleRating -> {
            //for each ID, call info service and get details
            Bicycle bicycle = restTemplate.getForObject("http://localhost:8082/bicycles/" + bicycleRating.getBicycleId(), Bicycle.class);
            //assemble
            return new CatalogItem(bicycle.getName(), "A great bike for road races", bicycleRating.getBicycleRating());
        }).collect(Collectors.toList());*/
    }
}

            /*
            Bicycle bicycle = webClientBuilder.build()
                    .get()
                    .uri("http://localhost:8082/bicycles/" + bicycleRating.getBicycleId(), Bicycle.class)
                    .retrieve()
                    .bodyToMono(Bicycle.class)
                    .block();
            */
