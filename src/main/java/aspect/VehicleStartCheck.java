package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
@Order(1)
public class VehicleStartCheck {

    private Logger logger = Logger.getLogger(VehicleStartCheck.class.getName());

    @Before("execution(*service.*.*(..)) && (args vehicleStart,..)")
    public void check(JoinPoint joinPoint, boolean vehicleStart) throws Throwable{
        if(!vehicleStart){
            throw new RuntimeException("Vehicle not start");
        }
    }
}
