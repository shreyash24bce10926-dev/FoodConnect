import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StorageHelper {
    private String fileName = "donations.txt";

    public void saveToFile(List<FoodPacket> packets) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(packets);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("Error: Could not save data.");
        }
    }

    @SuppressWarnings("unchecked")
    public List<FoodPacket> readFromFile() {
        List<FoodPacket> list = new ArrayList<>();
        File f = new File(fileName);

        if (!f.exists()) {
            return list;
        }

        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (List<FoodPacket>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("Error: Could not load previous data.");
        }
        return list;
    }
}