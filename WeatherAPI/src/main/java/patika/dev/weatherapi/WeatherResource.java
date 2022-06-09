package patika.dev.weatherapi;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class WeatherResource {


            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();




            @GetMapping()
            public String getData()
            {
                String apiurl = "https://api.openweathermap.org/data/2.5/weather?q=İstanbul,TR&callback=test&appid=d242d3f8e8e8c6a75a0067640f6b9f11";
                String key ="d242d3f8e8e8c6a75a0067640f6b9f11";

                headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
                HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
                ResponseEntity<String> response = restTemplate.exchange(apiurl, HttpMethod.GET, entity, String.class);


                return response.getBody();
            }

            @GetMapping()
            public String getCityData(String city)
            {
                String apiURL = "https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=d242d3f8e8e8c6a75a0067640f6b9f11";
                headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
                HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
                ResponseEntity<String>  response = restTemplate.exchange(apiURL, HttpMethod.GET, entity, String.class);


                return response.getBody();

            }


        }
