package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Duncan on 9/16/2016.
 */
public class Happy extends Mood {
    private Date date;

    public Happy(){
        this.date = new Date();;
    }

    public Happy(Date date){
        this.date = date;
    }

    public String getMood(){return "Happy";}

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
}
