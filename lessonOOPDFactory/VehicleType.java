package lessonOOPDFactory;

public enum VehicleType {
  TRUCK {
    public Vehicle getVehicle() {
      return new Truck();

    }
  },
  CAR{
    public Vehicle getVehicle() {
      return new Car();

    }
  },
  BUS{
    public Vehicle getVehicle() {
      return new Bus();

    }
  },
  ELECTRIC_CAR{
    public Vehicle getVehicle() {
      return new ElecticCar();

    }
  };

  abstract Vehicle getVehicle();

}
