package af.way;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Entry point.
 *
 * @author Alessandro Falappa <alex.falappa@gmail.com>
 */
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        logger.info("App started");
        logger.info("App finished");
    }

}
