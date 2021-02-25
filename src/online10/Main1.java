package online10;

public class Main1 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3,2);
        System.out.println(matrix.getRows());
        System.out.println(matrix.getColumns());
        matrix.setValueAt(0,0,2);
        matrix.setValueAt(0,1,1);

        matrix.setValueAt(1,0,1);
        matrix.setValueAt(1,1,3);

        matrix.setValueAt(2,0,3);
        matrix.setValueAt(2,1,6);
        System.out.println(matrix.getValueAt(0,0));
    }
}
