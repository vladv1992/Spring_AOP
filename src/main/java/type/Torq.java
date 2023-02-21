package type;

import interf.Tyres;
import org.springframework.stereotype.Component;

@Component
public class Torq implements Tyres {

    @Override
    public String move() {
        return "the car is gone";
    }
}
