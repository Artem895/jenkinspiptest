package core.rest;

import core.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainRest {

    private final MainService mainService;

    @GetMapping("/hello")
    public String hello(){
        return mainService.hello();
    }
}
