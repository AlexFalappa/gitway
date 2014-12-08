package af.way;

import static af.way.Operations.LIST;
import java.io.File;
import org.kohsuke.args4j.Option;

/**
 * Command line arguments.
 *
 * @author Alessandro Falappa <alex.falappa@gmail.com>
 */
public class CmdArgs {

    @Option(name = "-o", aliases = "--operation", required = true, usage = "Operation to perform. Mandatory.")
    Operations operation = LIST;

    @Option(name = "-w", aliases = "--workDir", usage = "Working directory path.")
    File workingDir;

    @Option(name = "-v", aliases = "--verbose", usage = "Print activity messages.")
    boolean verbose = false;
}
