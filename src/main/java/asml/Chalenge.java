package asml;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Chalenge {
    public static void main(String[] args) throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        Integer line = null;
        Integer numb;
        while ((line = in.read()) != null) {
            numb = line * line;
            System.out.println(line);
        }
    }
}
//
