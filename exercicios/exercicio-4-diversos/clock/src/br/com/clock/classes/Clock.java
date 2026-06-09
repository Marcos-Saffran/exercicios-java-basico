package br.com.clock.classes;

public sealed abstract class Clock permits BRLClock, USClock {

    protected int hour;
    protected int minute;
    protected int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 24){
            this.hour = 0;
            return;
        }
        if (hour <= 0) {
            this.hour = 0;
            return;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 60){
            this.minute = 60;
            return;
        }
        if (minute <= 0) {
            this.minute = 0;
            return ;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 60){
            this.second = 60;
            return;
        }
        if (second <= 0) {
            this.second = 0;
            return ;
        }

        this.second = second;
    }

    public String getTime(){
        return (hour <= 9 ? "0" + hour : hour) + ":" + (minute <= 9 ? "0" + minute : minute) + ":" + (second <= 9 ? "0" + second : second);
    }

    public abstract Clock convert(Clock clock);
}
