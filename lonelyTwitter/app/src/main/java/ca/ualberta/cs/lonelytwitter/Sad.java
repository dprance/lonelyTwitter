package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Duncan on 9/16/2016.
 */
public class Sad extends Mood {
    private Date date;

    public Sad(){
        this.date = new Date();;
    }

    public Sad(Date date){
        this.date = date;
    }

    public String getMood(){return "Sad";}

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
}