package af.algorithms;

import af.model.Pathway;
import java.util.Properties;

/**
 * Interface for route calculations algorithms.
 *
 * @author Alessandro Falappa <alex.falappa@gmail.com>
 */
public interface RouteCalculator {

    Pathway calcRoute(Pathway pw);

    void setCalcOptions(Properties props);
}
