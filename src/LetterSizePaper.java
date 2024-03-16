public class LetterSizePaper {
    public static void main(String[] args) {
        final double INCH_TO_MM = 25.4;
        final double WIDTH_INCHES = 8.5;
        final double HEIGHT_INCHES = 11.0;
        double width_mm = WIDTH_INCHES * INCH_TO_MM;
        double height_mm = HEIGHT_INCHES * INCH_TO_MM;
        double perimeter_mm = 2 * (width_mm + height_mm);
        double diagonal_mm = Math.sqrt(width_mm * width_mm + height_mm * height_mm);

        System.out.println("Width: " + width_mm + " mm");
        System.out.println("Height: " + height_mm + " mm");
        System.out.println("Perimeter: " + perimeter_mm + " mm");
        System.out.println("Length of diagonal: " + diagonal_mm + " mm");
    }
}
