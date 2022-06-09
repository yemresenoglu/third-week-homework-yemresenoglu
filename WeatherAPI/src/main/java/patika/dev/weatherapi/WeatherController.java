package patika.dev.weatherapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WeatherController {


    WeatherResource weatherResource;

    @GetMapping("test/{city}")
    public String getCityData(@PathVariable String city){

        return weatherResource.getCityData(city);

    }


}
