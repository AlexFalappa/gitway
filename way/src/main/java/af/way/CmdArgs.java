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

    @Option(name = "-o", aliases = "--operation", required = true)
    Operations operation = LIST;

    @Option(name = "-w", aliases = "--workDir")
    File workingDir;
}
