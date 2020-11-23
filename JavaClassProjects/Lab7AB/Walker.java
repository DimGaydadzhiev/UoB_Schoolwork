package Lab7AB;

import java.util.Random;

public class Walker {

    private Random rand = new Random();

    private Compass[] path = new Compass[15];

    public int walk() {

        int tempDir, crntPos = 0;

        for (int i = 0; i < path.length; i++) {

            tempDir = rand.nextInt(4);

            switch (tempDir) {
                case 0:
                    path[i] = Compass.EAST;
                    break;
                case 1:
                    path[i] = Compass.WEST;
                    break;
                case 2:
                    path[i] = Compass.NORTH;
                    break;
                case 3:
                    path[i] = Compass.SOUTH;
                    break;

                default: // This should never happen but you never know
                    System.out.println("MORON"); // This is for testing purposes.
                    break;

            }

            crntPos = crntPos + path[i].dir;
        }
        return crntPos;
    }

}
