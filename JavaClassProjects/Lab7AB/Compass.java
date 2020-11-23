package Lab7AB;

enum Compass { // West and East are of values 0 as we don't care about horizontal movement
    NORTH(1), SOUTH(-1), WEST(0), EAST(0);

    int dir;

    Compass(int d) {
        dir = d;
    }
}
