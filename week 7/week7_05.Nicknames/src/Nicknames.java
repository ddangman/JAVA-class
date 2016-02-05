
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put("matti", "mage");
        hash.put("mikael", "mixu");
        hash.put("arto", "arppa");
        System.out.println(hash.get("mikael"));
        
    }

}
