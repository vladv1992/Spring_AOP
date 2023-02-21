package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.VehicleService;

@Component(value = "vehicleBean")
public class Vehicle {

    private String nameV="Toyota";
    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService1){
        this.vehicleService = vehicleService1;

    }

    public String getNameV() {
        return nameV;
    }
    public VehicleService getVehicleService() {
        return vehicleService;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "nameV='" + nameV + '\'' +
                ", vehicleService=" + vehicleService +
                '}';
    }
}