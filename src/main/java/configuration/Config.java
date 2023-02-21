package configuration;

import bean.Person;
import bean.Vehicle;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"type","service"})
@ComponentScan(basePackageClasses = {Vehicle.class, Person.class})
@EnableAspectJAutoProxy
public class Config {


}