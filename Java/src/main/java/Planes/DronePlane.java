package Planes;

import models.DegreeOfAutonomy;

import java.util.Objects;

public class DronePlane extends Plane {

    private final DegreeOfAutonomy degreeOfAutonomy;

    public DronePlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, DegreeOfAutonomy degreeOfAutonomy) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
            this.degreeOfAutonomy = degreeOfAutonomy;
    }

    public DegreeOfAutonomy getDegreeOfAutonomy() {
        return degreeOfAutonomy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DronePlane that = (DronePlane) o;
        return degreeOfAutonomy == that.degreeOfAutonomy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), degreeOfAutonomy);
    }

    @Override
    public String toString() {
        return "DronePlane{" +
                "degreeOfAutonomy=" + degreeOfAutonomy +
                '}';
    }
}
