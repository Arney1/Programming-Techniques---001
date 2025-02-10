public class App {
    public static void main(String[] args) {
        int i = 42;
        String s = (i < 40) ? "life" : (i > 50) ? "universe" : "everything";
        System.out.println(s);
    }
}

/*
 * Output:
 * everything
 * 
 * Teknik yang digunakan:
 * Algoritma ini menggunakan Operasi Ternary
 * Operasi ternary bekerja seperti if else
 * syntax: variable = (condition) ? expressionTrue : expressionFalse
 * jika condition = true, maka variable = expressionTrue
 * jika condition = false, maka variable = expressionFalse
 */
