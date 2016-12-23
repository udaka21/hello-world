import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Created by udaka on 8/1/16.
 */
public class TestApp {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh = null;

        try {

            // This block configure the logger with handler and formatter
            fh = new FileHandler("MyLogFile.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            // the following statement is used to log any messages
            logger.info("My first log");

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            logger.info("Hi How r u?");
            fh.close();
        }
        



    }


}
