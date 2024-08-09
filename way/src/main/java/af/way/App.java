package af.way;

import af.model.Pathway;
import af.model.WayPoint;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ResourceBundle;

/**
 * Entry point.
 *
 * @author Alessandro Falappa <alex.falappa@gmail.com>
 */
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);
    private static final CmdArgs cla = new CmdArgs();
    private static final ResourceBundle rb = ResourceBundle.getBundle("af.way.message");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        logger.info("App started");
        CmdLineParser clp = new CmdLineParser(cla);
        logger.info(rb.getString("some"));
        logger.info(rb.getString("very"));
        try {
            clp.parseArgument(args);
            if (cla.verbose) {
                logger.info("Verbose mode on");
            }
            if (cla.dryRun) {
                logger.info("Dry run mode on");
            }
            logger.info("Operation: {}", cla.operation);
            if (cla.file.exists()) {
                logger.warn("File {} exists.", cla.file);
            } else {
                logger.info("File: {}", cla.file);
            }
            switch (cla.operation) {
                case CREATE:
                    logger.debug("Creating...");
                    Pathway pw = new Pathway();
                    pw.addWaypoint(new WayPoint("first", 10, 20));
                    pw.addWaypoint(new WayPoint("second", 11, 21));
                    break;
                case DELETE:
                    logger.debug("Deleting...");
                    break;
                case LIST:
                    logger.debug("Listing...");
                    Pathway pw2 = new Pathway();
                    pw2.addWaypoint(new WayPoint("first", 10, 20));
                    pw2.addWaypoint(new WayPoint("second", 11, 21));
                    for (WayPoint wp : pw2.getWaypoints()) {
                        System.out.printf("%s: [%f ; %f]%n", wp.getName(), wp.getLat(), wp.getLon());
                    }
                    break;
                case MODIFY:
                    logger.debug("Modifying...");
                    Pathway pw3 = new Pathway();
                    pw3.addWaypoint(new WayPoint("first", 10, 20));
                    pw3.addWaypoint(new WayPoint("third", 12, 22));
                    break;
                default:
                    throw new IllegalArgumentException("Unknown operation: " + cla.operation);
            }
        } catch (CmdLineException ex) {
            System.err.println(ex.getMessage());
            System.out.print("Usage:\n\twayApp ");
            clp.printSingleLineUsage(System.out);
            System.out.println("\nWhere:");
            clp.printUsage(System.out);
        }
        logger.info(rb.getString("another"));
        logger.info("App finished");
    }

}
