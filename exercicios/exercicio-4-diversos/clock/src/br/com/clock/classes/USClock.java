package br.com.clock.classes;

public non-sealed class USClock extends Clock {

    private String  periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidday(){
        this.periodIndicator = "PM";
    }

    public void setBeforeMidday(){
        this.periodIndicator = "AM";
    }

    public void setHour(int hour) {
        setBeforeMidday();

        if ((hour > 12) && (hour < 24)){
            this.hour = hour - 12;
            setAfterMidday();

        } else if (hour >= 24){
            this.hour = 0;
        } else {
            this.hour = hour;
        }


    }

    @Override
    public Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        setHour(clock.getHour());
//        switch (clock){
//            case USClock usClock -> setHour(usClock.getHour());
//            case BRLClock brlClock -> this.hour = brlClock.getHour();
//        }
        return this;
    }

    @Override
    public String getTime(){
        return super.getTime() + " " + this.periodIndicator;
    }
}
