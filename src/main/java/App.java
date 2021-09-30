import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        try {
//            FileOutputStream fos = new FileOutputStream("data2.txt", true);
//            PrintWriter writer = new PrintWriter(fos);
//            writer.println("1/6");
////            OutputStreamWriter osw = new OutputStreamWriter(fos);
////            BufferedWriter writer = new BufferedWriter(osw);
//            writer.flush();
//            writer.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        try {
            FileInputStream fos1 = new FileInputStream("data1.txt");
            FileInputStream fos2 = new FileInputStream("data2.txt");

            FileOutputStream fos = new FileOutputStream("data.txt");
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
//            Scanner sc1 = new Scanner(fos1);
//            while (sc1.hasNextLine()) {
//                String line = sc1.nextLine();
//                bw.write(line);
//            }
//            Scanner sc2 = new Scanner(fos2);
//            while (sc2.hasNextLine()) {
//                String line2 = sc2.nextLine();
//                bw.write(line2);
//            }
            InputStreamReader isr1 = new InputStreamReader(fos1);
            BufferedReader reader1 = new BufferedReader(isr1);
            String line1  = reader1.readLine();
            if (line1!=null) {
                bw.write(line1);
            }
            InputStreamReader isr2 = new InputStreamReader(fos2);
            BufferedReader reader2 = new BufferedReader(isr2);
            String line2 = reader2.readLine();
            if (line2 != null) {
                bw.write(line2);
            }
            bw.flush();
            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


//        try {
//            FileInputStream fis = new FileInputStream("data.txt");
//            InputStreamReader isr = new InputStreamReader(fis);
//            BufferedReader reader = new BufferedReader(isr);
//
//            String line  = reader.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = reader.readLine();
//            }
//            reader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            FileInputStream fis = new FileInputStream("data.txt");
//            Scanner scanner = new Scanner(fis);
//            while(scanner.hasNextLine()){
//                String line = scanner.nextLine();
//                System.out.println(line);
//            }
//            scanner.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }