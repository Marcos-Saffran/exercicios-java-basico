package br.com.clock;

import br.com.clock.classes.BRLClock;
import br.com.clock.classes.Clock;
import br.com.clock.classes.USClock;

public class Main {

    public static void main(String[] args) {

        Clock brlClock = new BRLClock();
        brlClock.setSecond(10);
        brlClock.setMinute(20);
        brlClock.setHour(22);

        System.out.println(brlClock.getTime());

        Clock usClock = new USClock();
        usClock.convert(brlClock);
        System.out.println(usClock.getTime());

        brlClock.convert(usClock);

        System.out.println(brlClock.getTime());


    }
}
