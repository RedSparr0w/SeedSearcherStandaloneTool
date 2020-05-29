package sassa.util;

import amidst.mojangapi.world.World;

public class Stuff {
    static Singleton singleton = Singleton.getInstance();
    public static int rejectedCount = 0;
    public static int totalRejectedCount = 0;
    public static int acceptedCount = 0;
    private static Util util = new Util();

    public static void incrementRejectedCount() {
        rejectedCount++;
        singleton.getCRejSeed().setText(""+rejectedCount);
    }

    public static void resetRejectedCount() {
        rejectedCount = 0;
        singleton.getCRejSeed().setText(""+rejectedCount);
    }

    public static void incrementTotalRejectedCount() {
        totalRejectedCount++;
        singleton.getTRejSeed().setText(""+totalRejectedCount);
    }

    public static void resetTotalRejectedCount() {
        totalRejectedCount = 0;
        singleton.getTRejSeed().setText(""+totalRejectedCount);
    }

    public static int addAcceptedWorld(World acceptedWorld) {
        acceptedCount++;
        util.console(acceptedCount + ": " + acceptedWorld.getWorldSeed().getLong() + " (rejected "
                        + rejectedCount + ")");
        return acceptedCount;
    }

    public static int resetAcceptedCount() {
        acceptedCount = 0;
        return acceptedCount;
    }
}
