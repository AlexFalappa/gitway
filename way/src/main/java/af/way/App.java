package af.way;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Entry point.
 *
 * @author Alessandro Falappa <alex.falappa@gmail.com>
 */
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);
    private static CmdArgs cla = new CmdArgs();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        logger.info("App started");
        CmdLineParser clp = new CmdLineParser(cla);
        try {
            clp.parseArgument(args);
        } catch (CmdLineException ex) {
            System.err.println(ex.getMessage());
            System.out.print("Usage:\n\twayApp ");
            clp.printSingleLineUsage(System.out);
            System.out.println("\nWhere:");
            clp.printUsage(System.out);
        }
        logger.info("App finished");
    }

}
