package effectivejava.ex03;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.unmodifiableList;

public class ex01 {
    private static final String[] COLORS = {"RED","GREEN","BLUE"};

    public static List<String> getColors(){
        return unmodifiableList(Arrays.asList(COLORS));
    }
}
