package af.way;

import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.Option;

import java.io.File;

import static af.way.Operations.LIST;

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

    @Option(name = "-d", usage = "Dry run mode. Do not really execute commands.")
    boolean dryRun = false;

    @Option(name = "-v", usage = "Print activity messages.")
    boolean verbose = false;

    @Argument(metaVar = "FILE", required = true, usage = "File to operate on.")
    File file;
}
