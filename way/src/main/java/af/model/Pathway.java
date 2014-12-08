package af.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Pathway model POJO.
 *
 * @author Alessandro Falappa <alex.falappa@gmail.com>
 */
public class Pathway {

    List<WayPoint> waypoints = new ArrayList<>();

    public void addWaypoint(WayPoint p) {
        waypoints.add(p);
    }

    public void delWaypoint(WayPoint p) {
        waypoints.remove(p);
    }

    public void clear() {
        waypoints.clear();
    }

    @Override
    public String toString() {
        return "Pathway{" + "waypoints=" + waypoints + '}';
    }

}
