package Planes;

import models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane{

    private final MilitaryType type;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }

    public MilitaryType getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + type +
                '}');
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (this == o) {
            result = true;
        } else if (o instanceof MilitaryPlane) {
            if (super.equals(o)) {
                MilitaryPlane that = (MilitaryPlane) o;
                result = type == that.type;
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
