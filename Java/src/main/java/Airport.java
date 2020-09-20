import Planes.ExperimentalPlane;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;
import models.MilitaryType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

// version: 1.1
// made by Vitali Shulha
// 4-Jan-2019

public class Airport {
    private final List<? extends Plane> planes;


    public List<PassengerPlane> getPassengerPlane() {
        List<? extends Plane> planes = this.planes;
        List<PassengerPlane> passengerPlane = new ArrayList<>();
        for (Plane p : planes) {if (p instanceof PassengerPlane) {passengerPlane.add((PassengerPlane) p);}}
        return passengerPlane;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane)
                militaryPlanes.add((MilitaryPlane) plane);
        }
        return militaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlane();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (PassengerPlane passengerPlane : passengerPlanes)
            if (passengerPlane.getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity())
                planeWithMaxCapacity = passengerPlane;

        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (MilitaryPlane plane : militaryPlanes) {

            if (plane.getType() == MilitaryType.TRANSPORT)
                transportMilitaryPlanes.add(plane);

        }
        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (MilitaryPlane plane : militaryPlanes) {

            if (plane.getType() == MilitaryType.BOMBER)
                bomberMilitaryPlanes.add(plane);

        }
        return bomberMilitaryPlanes;

    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane)
                experimentalPlanes.add((ExperimentalPlane) plane);

        }
        return experimentalPlanes;
    }

    public Airport sortByMaxDistance() {
        planes.sort((Comparator<Plane>) (firstPlane, secondPlane) ->
                firstPlane.getMaxFlightDistance() - secondPlane.getMaxFlightDistance());
        return this;
    }


    /**
     * Sorts by max speed
     * @return Airport
     */
    public Airport sortByMaxSpeed() {
        planes.sort((Comparator<Plane>) (firstPlane, secondPlane)
                -> firstPlane.getMaxSpeed() - secondPlane.getMaxSpeed());
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        planes.sort((Comparator<Plane>) (firstPlane, secondPlane)
                -> firstPlane.getMinLoadCapacity() - secondPlane.getMinLoadCapacity());
        return this;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    private void print(Collection<? extends Plane> collection) {
        for (Plane plane : collection)
            System.out.println(plane);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }

    //Constructor
    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

}
