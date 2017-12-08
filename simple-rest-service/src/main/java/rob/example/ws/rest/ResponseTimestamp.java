package rob.example.ws.rest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ResponseTimestamp is a class holding some information about when a response
 * was generated.
 *
 * @author Rob Benton
 */
public class ResponseTimestamp
{
    private final Date date;

    public ResponseTimestamp()
    {
        this.date = new Date();
    }

    public String getDate()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        return sdf.format(this.date);
    }

    public String getTime()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        return sdf.format(this.date);
    }
}
