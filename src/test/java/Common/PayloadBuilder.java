package Common;

import java.util.HashMap;
import java.util.Map;

public class PayloadBuilder {

    public static Map<String, Object> createWeatherObject() {
        Map<String, Object> payload = new HashMap<>();
        payload.put("external_id", "DEMO_TEST001");
        payload.put("name", "Test Station");
        payload.put("latitude", -26.2041);
        payload.put("longitude", 28.0473);
        payload.put("altitude", 1753);
        return payload;
    }

    public static Map<String, Object> updateWeatherObject() {
        Map<String, Object> payload = new HashMap<>();
        payload.put("name", "Updated Test Station");
        payload.put("latitude", -26.2041);
        payload.put("longitude", 28.0473);
        payload.put("altitude", 1800);
        return payload;
    }

    public static Map<String, Object> deleteNewWeatherObject() {
        return new HashMap<>();
    }
}
