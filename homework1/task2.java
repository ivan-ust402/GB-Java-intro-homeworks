// Задание 2.
// Вывести все простые числа от 1 до 1000
public class task2 {
    public static void main(String[] args) {
        System.out.println("Простые числа от 1 до 1000: ");
        for(int i = 2; i < 1000; ++i){
            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){
              if(i % j == 0){
                ++count;
              }
            }
            if(count < 2)
               System.out.println(i);
          }
    }
}
