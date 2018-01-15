package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

final class Utils {
    private static final FilenameFilter ALL_FILES_FILTER = new C02691();

    static class C02691 implements FilenameFilter {
        C02691() {
        }

        public boolean accept(File dir, String filename) {
            return true;
        }
    }

    private Utils() {
    }

    static int capFileCount(File directory, int maxAllowed, Comparator<File> sortComparator) {
        return capFileCount(directory, ALL_FILES_FILTER, maxAllowed, sortComparator);
    }

    static int capFileCount(File directory, FilenameFilter filter, int maxAllowed, Comparator<File> sortComparator) {
        int i = 0;
        File[] sessionFiles = directory.listFiles(filter);
        if (sessionFiles == null) {
            return 0;
        }
        int numRetained = sessionFiles.length;
        Arrays.sort(sessionFiles, sortComparator);
        int length = sessionFiles.length;
        while (i < length) {
            File file = sessionFiles[i];
            if (numRetained <= maxAllowed) {
                return numRetained;
            }
            file.delete();
            numRetained--;
            i++;
        }
        return numRetained;
    }
}
