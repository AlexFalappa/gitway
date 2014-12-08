package af.algorithms;

import af.model.Pathway;
import af.model.WayPoint;
import java.util.Properties;

public class ShortRouteCalculator implements RouteCalculator {

    Properties props;

    @Override
    public Pathway calcRoute(Pathway pw) {
        pw.addWaypoint(new WayPoint("one", 0, 0));
        pw.addWaypoint(new WayPoint("two", 0, 0));
        return pw;
    }

    @Override
    public void setCalcOptions(Properties props) {
        this.props = props;
    }

}
