package builder;

public class Car {
    private String engine;
    private String transmission;
    private int seats;
    private boolean hasGPS;
    private boolean hasSunroof;
    private boolean hasBackupCamera;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.seats = builder.seats;
        this.hasGPS = builder.hasGPS;
        this.hasSunroof = builder.hasSunroof;
        this.hasBackupCamera = builder.hasBackupCamera;
    }

    public static class CarBuilder {
        private String engine;
        private String transmission;
        private int seats;
        private boolean hasGPS;
        private boolean hasSunroof;
        private boolean hasBackupCamera;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setGPS(boolean hasGPS) {
            this.hasGPS = hasGPS;
            return this;
        }

        public CarBuilder setSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public CarBuilder setBackupCamera(boolean hasBackupCamera) {
            this.hasBackupCamera = hasBackupCamera;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", seats=" + seats +
                ", hasGPS=" + hasGPS +
                ", hasSunroof=" + hasSunroof +
                ", hasBackupCamera=" + hasBackupCamera +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setEngine("V8")
                .setTransmission("Automatic")
                .setSeats(4)
                .setGPS(true)
                .setSunroof(true)
                .setBackupCamera(true)
                .build();

        System.out.println(car);
    }
}

