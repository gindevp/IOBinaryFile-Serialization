import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductFile {
    public static void writeFile(List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream("product.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            fos.close();
            oos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<Product> readFile() {
        try {
            FileInputStream fis = new FileInputStream("product.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object ob = ois.readObject();
            List<Product> products = (List<Product>) ob;
            fis.close();
            ois.close();
            return products;
        } catch (IOException e) {
            throw new RuntimeException();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

    }
}
