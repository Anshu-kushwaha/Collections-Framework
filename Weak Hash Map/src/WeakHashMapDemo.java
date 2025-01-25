import java.util.Map;
import java.util.WeakHashMap;

            // NOT SO MUCH IMPORTANT FOR ANY PURPOSE

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        loadCache(imageCache);
        System.out.println(imageCache);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (some entries may be cleared): " + imageCache);
    }

    public static void loadCache(Map<String, Image> imageMap) {
        String k1 = new String("img1");
        String k2 = new String("img2");
        imageMap.put(k1, new Image("Image 1"));
        imageMap.put(k2, new Image("Image 2"));
    }

    private static void simulateApplicationRunning() {
        try {
            System.out.println("Simulation application running...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Image {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}