package kr.co.manty.edu.general;

import kr.co.manty.edu.configuration.MainProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainProperties mainProperties;

    @GetMapping("/")
    Flux<String> main() {
        return Flux.just(mainProperties.getAuthor());
    }
}
