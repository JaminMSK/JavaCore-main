package Lesson2;

public class CalculateSquare {
    public static void main(String[] args) {

        int square = 0;
        try {
            square = calcRectangSquare(-1, 3);
        } catch (OneOrBothRectanglSideIsNegativeException e) {
            e.printStackTrace();
        }

        System.out.println(square);
    }

    private static int calcRectangSquare(int sideA, int sideB) throws OneOrBothRectanglSideIsNegativeException {

        if (sideA <= 0 || sideB <= 0 ){
            throw new OneOrBothRectanglSideIsNegativeException(
                    "Одна или обе стороны прямоугольника отрицательные: сторона A = " + sideA + " сторона B = " + sideB);
        }
        return sideA * sideB;
    }
}
