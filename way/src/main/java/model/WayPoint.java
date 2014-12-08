package model;

/**
 * Waypoint POJO.
 *
 * @author Alessandro Falappa <alex.falappa@gmail.com>
 */
public class WayPoint {

    String name;
    double lat;
    double lon;

    public WayPoint(String name, double lat, double lon) {
        this.name = name;
        this.lat = lat;
        this.lon = lon;
    }

    public WayPoint(String name) {
        this(name, 42, 12);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
