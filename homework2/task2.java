package homework2;
//Задание 2 *.
// Дана json строка (можно сохранить в файл и читать из файла)
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

// Входная строка:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

// Выходная строка:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика. 

public class task2 {
    public static void main(String[] args) {
        String line = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"},{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}]";
        String inputLine = "empty";
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/homework2/database.txt");
        File dataBase = new File(pathFile);
        try {
            if (dataBase.createNewFile()) {
                BufferedWriter bufWriter = new BufferedWriter(new FileWriter(dataBase));
                System.out.println("file created");
                bufWriter.write(line);
                System.out.println("file filled");
                bufWriter.close();
            }
            BufferedReader bufReader = new BufferedReader(new FileReader(dataBase));
            System.out.println("file existed");
            inputLine = bufReader.readLine();
            bufReader.close();
            
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        } 
        inputLine = inputLine
                        .replace("[","")
                        .replace("]", "")
                        .replace("{", "")
                        .replace("\"", "")
                        .replaceFirst(".$", "");
        System.out.println(inputLine);
        String[] arrayStudents = inputLine.split("},");
        StringBuilder outString = new StringBuilder();
        for (int i = 0; i < arrayStudents.length; i++) {
            String[] singleStudent = arrayStudents[i].split(",");
            for (int j = 0; j < singleStudent.length; j++) {
                String[] itemArray = singleStudent[j].split(":");
                String key = itemArray[0];
                String value = itemArray[1];
                if (key.equals("фамилия")) {
                    outString.append("Студент ");
                } else if (key.equals("оценка")) {
                    outString.append("получил ");
                } else if (key.equals("предмет")) {
                    outString.append("по предмету ");
                } else {
                    outString.append(" ");
                    outString.append(key);
                    outString.append(" = ");
                }
                outString.append(value);
                outString.append(" ");
            }
            outString.append("\n");
        }
        System.out.println(outString);
    }
}
