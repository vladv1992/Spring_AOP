package main;

import configuration.Config;
import interf.Song;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.VehicleService;

public class Result {
    public static void main(String[] args) {
        var comt = new AnnotationConfigApplicationContext(Config.class);
        var vehicleSerice =  comt.getBean(VehicleService.class);
        Song song = new Song();
        song.setTitle("MUsic");
        song.setTypeOfSingle("brednei Spir");
        boolean vehicleStarted = true;
        String playMus = vehicleSerice.playMusic(vehicleStarted,song);

//        String [] vehi = comt.getBeanNamesForType(Vehicle.class);
//        Vehicle veh = comt.getBean(Vehicle.class);
//        String [] prsi = comt.getBeanNamesForType(Person.class);
//        Person prs = comt.getBean(Person.class);


//        VehicleService vehicle1 = comt.getBean(VehicleService.class);
//        VehicleService vehicle2 = comt.getBean("vehicleService",VehicleService.class);
//        System.out.println(vehicle1.hashCode());
//        System.out.println(vehicle2.hashCode());
//
//        if(vehicle2 == vehicle1){
//            System.out.println("ok");
        }


//        prs.getVehicle().getVehicleService().playMusik();
    }
