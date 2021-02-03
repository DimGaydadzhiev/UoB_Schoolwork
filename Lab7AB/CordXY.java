package Lab7AB;

public class CordXY {
    int x;
    int y;
    MapTile tile;

    CordXY(int x, int y, MapTile tile) {
        this.x = x;
        this.y = y;
        this.tile = tile;
    }

    public CordXY deepCopy() {

        return new CordXY(x, y, tile);
    }
}
