package af.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Pathway model POJO.
 *
 * @author Alessandro Falappa <alex.falappa@gmail.com>
 */
public class Pathway {

    private final String name;
    List<WayPoint> waypoints = new ArrayList<>();

    public Pathway(String name) {
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Path" + name + ":\n" +
               waypoints.stream()
                       .map(WayPoint::toString)
                       .collect(Collectors.joining());
    }
}
