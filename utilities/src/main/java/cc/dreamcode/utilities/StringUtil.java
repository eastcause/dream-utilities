package cc.dreamcode.utilities;

import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@UtilityClass
public class StringUtil {
    public static String join(List<String> stringList) {
        return join(stringList.toArray(new String[0]), "", 0, stringList.size());
    }

    public static String join(List<String> stringList, String separator) {
        return join(stringList.toArray(new String[0]), separator, 0, stringList.size());
    }

    public static String join(List<String> stringList, String separator, int from, int to) {
        return join(stringList.toArray(new String[0]), separator, from, to);
    }

    public static String join(String[] array) {
        return join(array, "", 0, array.length);
    }

    public static String join(String[] array, String separator) {
        return join(array, separator, 0, array.length);
    }

    public static String join(String[] array, String separator, int from, int to) {
        final StringBuilder stringBuilder = new StringBuilder();
        for(int i = from; i < to; i++) {
            if(i > from) stringBuilder.append(separator);
            if(array[i] != null) stringBuilder.append(array[i]);
        }
        return stringBuilder.toString();
    }

    public static String getJoiningRangeAmount(int to) {
        return getJoiningRangeAmount(1, to);
    }

    public static String getJoiningRangeAmount(int from, int to) {
        return IntStream.rangeClosed(from, to + 1)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
