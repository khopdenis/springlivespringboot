package internship.springlivespringboot.controller;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    //8, 9 and 10 o'clock of every day
    @Scheduled(cron = "0 0 8-10 * * *")
    public void taskOne() {
        // do something
    }

    //every 5 seconds
    @Scheduled(fixedDelay = 5000L)
    public void taskOTwo() {
        // do something
    }
}