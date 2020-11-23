package Lab7AB;

import java.util.ArrayList;

public class Index {

    ArrayList<CordXY> GoldXY = new ArrayList<CordXY>();
    ArrayList<CordXY> SilverXY = new ArrayList<CordXY>();
    ArrayList<CordXY> JunkXY = new ArrayList<CordXY>();

    public void seekPrecious(MapTile[][] tempMap) {

        for (int i = 0; i < tempMap.length; i++) {

            for (int j = 0; j < tempMap.length; j++) {

                if (tempMap[i][j] == MapTile.GOLD) {

                    CordXY tempCords = new CordXY(i, j, tempMap[i][j]);
                    GoldXY.add(tempCords);
                    tempMap[i][j] = MapTile.SEARCHED;

                }

                if (tempMap[i][j] == MapTile.SILVER) {

                    CordXY tempCords = new CordXY(i, j, tempMap[i][j]);
                    SilverXY.add(tempCords);
                    tempMap[i][j] = MapTile.SEARCHED;

                }

                if (tempMap[i][j] == MapTile.JUNK) {

                    CordXY tempCords = new CordXY(i, j, tempMap[i][j]);
                    JunkXY.add(tempCords);
                    tempMap[i][j] = MapTile.SEARCHED;
                }
            }
        }

    }

    public static void main(String[] args) {
        // Index ind=new Index();
        //
        // MapTile[][] map = new MapTile[5][9];
        //
        // for (int i = 0; i < map.length; i++) {

        // for (int j = 0; j < map[0].length; j++) {
        // map[i][j] = MapTile.EMPTY;
        // }

        // map[3][1] = MapTile.GOLD;
        // }
        // ind.seekPrecious(map);

            Walker wlkr= new Walker();

            System.out.println(wlkr.walk());
    }

}
