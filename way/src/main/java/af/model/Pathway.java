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

    public List<WayPoint> getWaypoints() {
        return waypoints;
    }

    public void addWaypoint(WayPoint p) {
        waypoints.add(p);
    }

    public void delWaypoint(WayPoint p) {
        waypoints.remove(p);
    }

    public void clear() {
        waypoints.clear();
    }

    public void shuffle() {
        // TODO: implement waypoint shuffling
    }
}
