package components;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
@Log4j2

public class User {
    @Value("${name}")
    private String name;

    @Value("${lastName}")
    private String lastName;

    @Value("${group}")
    private String group;

    @PostConstruct
    public String init() {
        return "Name: " + this.name + "\nLast name: " + this.lastName
                + "\nGroup: " + this.group;
    }
}
