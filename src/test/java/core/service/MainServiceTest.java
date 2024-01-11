package core.service;

import org.junit.jupiter.api.Test;
import org.mockito.Spy;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig
class MainServiceTest {

    @Spy
    MainService mainService;

    @Test
    void hello() {
        assertEquals(mainService.hello(),"hello world");
    }
}