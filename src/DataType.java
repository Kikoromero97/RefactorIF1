import java.util.ArrayList;

public class DataType {
    public static void main(String[] args) {
        System.out.println(DataType.gd(20));
        System.out.println(DataType.gd(702));
        System.out.println(DataType.gd(0));
    }

    public static String gd(int code) {
        int[] casoDate = {702, 1082, 1083, 1114, 1184, 1266, 12403};
        int[] casoDate2 = {20, 21, 23, 24, 26, 700, 701, 790, 1700, 2202, 2203, 2204, 2205, 2206, 3734, 3769, 12396};
        String codigo = "";
        for (int k : casoDate) {
            if (k == code) {
                codigo = "DATE";
                break;
            } else {
                for (int i : casoDate2) {
                    if (i == code) {
                        codigo = "NUMERIC";
                        break;
                    } else {
                        codigo = "STRING";
                    }
                }
            }
        }
        return codigo;
    }
}
