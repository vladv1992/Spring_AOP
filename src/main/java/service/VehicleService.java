package service;

import interf.Song;
import interf.Speakrs;
import interf.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class VehicleService {

   private Logger logger = Logger.getLogger(VehicleService.class.getName());


    @Autowired
    private Speakrs speakrs;
    private Tyres tyres;


    public String playMusic(boolean vehicleStarted ,Song song){
       Instant start = Instant.now();
       logger.info("methid execut stat");
       String music = null;
       if(vehicleStarted){
           music = speakrs.sound(song);
       }else {
           logger.log(Level.SEVERE,"not perform operations");
       }
        logger.info("mrthod execut end");
       Instant finish = Instant.now();
       long timeElapsed = Duration.between(start,finish).toMillis();
       logger.info("time looks exact" + timeElapsed);

        return music;
    }





//    public void playMusik(){
//        String musc = speakrs.sound();
//        System.out.println(musc);
//    }
//
//    public void moveCar(){
//        String mov = tyres.move();
//        System.out.println(mov);
//    }
//
//    public Tyres getTyres() {
//        return tyres;
//    }
//
//    public Speakrs getSpeakrs() {
//        return speakrs;
//    }
//
//     @Autowired
//    public void setTyres(Tyres tyres) {
//        this.tyres = tyres;
//    }
//
//    public void setSpeakrs(Speakrs speakrs) {
//        this.speakrs = speakrs;
//    }
}
