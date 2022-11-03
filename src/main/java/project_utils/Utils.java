package project_utils;

public class Utils {
    public static boolean isNotNullAndNotEmpty(String str) {
        if (str != null) {
            return  (!str.trim().isEmpty());

            }

            return false;
        }
    }
