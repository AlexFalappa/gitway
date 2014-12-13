package af.way;

import static af.way.Operations.LIST;
import java.io.File;
import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;

/**
 * Command line arguments.
 *
 * @author Alessandro Falappa <alex.falappa@gmail.com>
 */
public class CmdArgs {

    @Option(name = "-o", required = true, usage = "Operation to perform. Mandatory.")
    Operations operation = LIST;

    @Option(name = "-w", metaVar = "DIR", usage = "Working directory path.")
    File workingDir;

    @Option(name = "-v", usage = "Print activity messages.")
    boolean verbose = false;

    @Argument(metaVar = "FILE", required = true, usage = "File to operate on.")
    File file;
}
