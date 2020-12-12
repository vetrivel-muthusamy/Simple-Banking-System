class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        if (minutes + 1 == 60 && hours + 1 > 12) {
            hours = 1;
            minutes = 0;
        } else if (minutes + 1 == 60) {
            hours++;
            minutes = 0;
        } else {
            minutes++;
        }
    }
}