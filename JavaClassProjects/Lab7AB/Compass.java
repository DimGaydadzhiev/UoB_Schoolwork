package Lab7AB;

/**
 * Only supports the basic 4 cardinal directions. WEST and EAST are 0's as we
 * don't care about horizontal movement
 */
enum Compass {
    NORTH(1), SOUTH(-1), WEST(0), EAST(0);

    int dir;

    Compass(int d) {
        dir = d;
    }
}
