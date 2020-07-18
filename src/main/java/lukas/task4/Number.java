package lukas.task4;

import java.io.*;
import java.util.Scanner;



    /*
Задание 4
Создайте класс для числа. В классе должна быть ре-
ализована следующая функциональность:
Запись и чтение значения;
Перевод числа в восьмеричную систему исчисления;
Перевод числа в шестнадцатеричную систему исчис-
ления;
Перевод числа в двоичную систему исчисления.
Протестируйте все возможности созданного класса
с использованием JUnit.
 */


public class Number {


        // запись числа в файл
        public static void writeFile() throws Exception {
            FileWriter file = new FileWriter("number.txt");
            file.write("345");

            System.out.println("The file was written");
            System.out.println();
            file.close();

        }

        // чтение данных из файла
        public String readFromFile(String testFile) throws Exception {
            FileReader fileReader = new FileReader(testFile);
            Scanner scanner = new Scanner(fileReader);
            String read = scanner.nextLine();

            while (scanner.hasNextLine()) {
                System.out.println("Data read from file: " + read);
            }
            fileReader.close();
            return read;
        }

        // перевод полученного числа из файла в 8-ю систему исчисления
        public String changeNumberEight(String test) throws IOException {
            int number = 0;

            Scanner scanner = new Scanner(new File("number.txt"));
            while (scanner.hasNext()) {
                number = scanner.nextInt(); // запись в переменную данных из файла
            }
            scanner.close();

            System.out.println();
            System.out.println("Octal number system: " + Integer.toOctalString(number));
            String octalString = Integer.toOctalString(number);
            return octalString;
        }

        // перевод полученного числа из файла в 16-ю систему исчисления
        public String changeNumberSixteen(String test) throws IOException {
            int number = 0;

            Scanner scanner = new Scanner(new File("number.txt"));
            while (scanner.hasNext()) {
                number = scanner.nextInt();
            }
            scanner.close();
            System.out.println();
            System.out.println("Hexadecimal number system: " + Integer.toHexString(number));
            String hexString = Integer.toHexString(number);
            return hexString;
        }

        // перевод полученного числа из файла в двоичную систему исчисления
        public String changeNumberBinary(String test) throws FileNotFoundException {
            int number = 0;

            Scanner scanner = new Scanner(new File("number.txt"));
            while (scanner.hasNext()) {
                number = scanner.nextInt();
            }
            scanner.close();
            System.out.println();
            System.out.println("Binary number system: " + Integer.toBinaryString(number));
            String binaryString = Integer.toBinaryString(number);
            return binaryString;
        }

    }
