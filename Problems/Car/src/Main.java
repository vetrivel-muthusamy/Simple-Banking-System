class Car {

    int yearModel;
    String make;
    int speed;

    void accelerate() {
        speed += 5;
    }

    void brake() {
        if (speed - 5 < 0) {
            speed = 0;
        } else {
            speed -= 5;
        }
    }
}