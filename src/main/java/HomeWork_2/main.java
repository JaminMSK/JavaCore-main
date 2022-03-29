/* Сделал Vladislav Torgashev
29.03.2022
 */


package HomeWork_2;

public class main {
    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1", "2", "345", "4"}, {"3", "1", "35", "3"}, {"4", "4", "14545", "4"}, {"5", "5", "4345", "7"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер превышен");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

}
