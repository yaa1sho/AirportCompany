package Planes;

import java.util.Objects;

public class PassengerPlane extends Plane{

    //=================FIELDS=================
    private final int passengersCapacity;

    //=================CONSTRUCTORS=================
    public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }


    //=================METHODS=================
    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", passengersCapacity=" + passengersCapacity +
                '}');
    }

//    @Override
//    public String toString() {
//        return super.toString().replace("}",
//                ", passengersCapacity=" + passengersCapacity +
//                        '}');
//    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (this == o) {
            result = true;
        } else if (o instanceof PassengerPlane) {
            if (super.equals(o)) {
                PassengerPlane plane = (PassengerPlane) o;
                result = passengersCapacity == plane.passengersCapacity;
            }
        }
        return result;
    }

    /**
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }
}
