import java.util.*;

public class ItemTool {
    public static List<InventoryItem> getAllInventoryItemsLighterThan(List<InventoryItem> items, double weight) {
        List<InventoryItem> result = new ArrayList<>(); 
        for (InventoryItem item : items) {
            if (item.getWeight() < weight) {
                result.add(item); 
            }
        }
        return result; 
    }

    public static List<Magazine> getAllMagazines(InventoryItem[] items) {
        List<Magazine> result = new ArrayList<>();
        for (InventoryItem item : items) {
            if (item instanceof Magazine) {
                Magazine m = (Magazine) item; 
                result.add(m); 
            }
        }
        return result;
    }

    public static List<InventoryItem> getAllNonBooksOfCategory(InventoryItem[] items, char category) {
        List<InventoryItem> result = new ArrayList<>();
        for (InventoryItem item : items) {
            if (!(item instanceof Book) && (item.getCategory() == category)) {
                result.add(item);
            }
        }
        return result; 
        
    }

    public static Laptop[] getAllLaptopsWithNumCpuGreaterThan(Map<String,InventoryItem> map, int numCpu) {

        List<Laptop> temp = new ArrayList<>(); 
        Set<String> keys = map.keySet();
        for (String key : keys) {
            if (map.get(key) instanceof Laptop) {
                Laptop laptop = (Laptop) map.get(key);
                if (laptop.getNumCpu() > numCpu) {
                    temp.add(laptop);
                }
            }
        }

        int newArrayLength = temp.size(); 
        Laptop[] result = new Laptop[newArrayLength]; 
        for (int i = 0; i < newArrayLength; i++) {
            result[i] = temp.get(i);
        }

        return result; 

    }
}

