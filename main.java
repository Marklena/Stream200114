package ru.geekbrains.homework_6;

import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        InputStream in;
        OutputStream out;

        try {
            PrintStream ps = new PrintStream(new FileOutputStream("test", true));
            ps.println("text1");
            ps.close();


            Scanner sc = new Scanner(new FileInputStream("test"));
            while (sc.hasNext()){
                System.out.println(sc.nextLine());

    public static void getText (ps, sc);
    getText = new getText ("text1" + sc.nextLine());
                System.out.println(getText);

            // int b;
            // while ((b = fis.read()) != -1){
            //System.out.println((char) (b));
            // }


            }

        }catch (IOException e){
            throw new RuntimeException(e);

        }
    }


}
 {
}
