package LeetCodeAlgorithms_1.FirstBadVersion278;

public class VersionControl {

    public static boolean isBadVersion(int version) {
        if(version <= 0) {
            return false;
        }
        return version % 2 != 0;
    }
}
