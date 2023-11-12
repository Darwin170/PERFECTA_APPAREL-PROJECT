package Models;

public class SharedData {
    private static boolean acbStatus = false;

    public static boolean isACBStatus() {
        return acbStatus;
    }

    public static void setACBStatus(boolean status) {
        acbStatus = status;
    }
}
