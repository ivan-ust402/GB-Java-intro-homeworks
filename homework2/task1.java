package homework2;
// Задание 1.

// Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.

// Входная строка:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

// Выходная строка:
// select * from students where name = "Ivanov" and country = "Russia" and city = "Moscow"

public class task1 {
    public static void main(String[] args) {
        String input = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        StringBuilder result = new StringBuilder();
        result.append("select * from students where ");
        String inputClear = input
                .replace("\"", "")
                .replace("{", "")
                .replace("}", "");
        String[] strArr = inputClear.split(",");
        for (int i = 0; i < strArr.length; i++) {
            String[] singleValue = strArr[i].split(":");
            if (singleValue.length > 1 
                    && !singleValue[1].equals("null")) {
                String newValue = " " + singleValue[0] + " = " + singleValue[1];
                result.append(newValue);
            }

        }
        System.out.println(result);
    }
}
