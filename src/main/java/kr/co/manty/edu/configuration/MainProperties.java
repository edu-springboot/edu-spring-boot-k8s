package kr.co.manty.edu.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

@ConfigurationProperties(prefix = "kr.co.manty")
@Getter
@Setter
public class MainProperties {
    private final String author;

    @ConstructorBinding
    public MainProperties(String author) {
        this.author = author;
    }
}
