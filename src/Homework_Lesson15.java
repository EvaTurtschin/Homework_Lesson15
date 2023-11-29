public class Homework_Lesson15
{
    public static void main(String[] args) {
        /* Task1
Написать метод, принимающий массив целых чисел и проверяющий равна ли сумма всех
имеющихся там чисел 10 тридцати.
Метод возвращает false если нет и true если да.
т.е. для массива 10, 15, 10, 1, 25, 10 -> true
для массива 10, 15, 10, 1, 25, 45 -> false
Фактически, в общем виде метод проверяет равна ли сумма всех элементов массива, равных n числу m.*/

        int[] array = {10, 5, 10, 40, 10, 15};
        System.out.println("Statement, that the sum of 10s in array = 30 is " + countSumOfTens(array));
    }
        public static boolean countSumOfTens (int[] array)
        {
            int m = 30;
            int n = 10;
            int sum = 0;
            for (int i=0; i< array.length; i++)
            {
                if (array[i] == n)
                {
                    sum = sum+array[i];
                }
            }
            if (m == sum)
            {
                return true;
            }
            else return false;
        }
}
