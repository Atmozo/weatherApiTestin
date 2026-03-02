package Common;

import io.github.cdimascio.dotenv.Dotenv;

public class BasePaths {
    private static final Dotenv dotenv = Dotenv.configure()
            .directory(System.getProperty("user.dir"))
            .ignoreIfMissing()
            .load();

    public static String ReqRes_baseURL = dotenv.get("REQRES_BASE_URL", "https://reqres.in");
    public static String Weather_baseURL = dotenv.get("WEATHER_BASE_URL", "https://api.openweathermap.org");
    public static String DogsAPI_baseURL = dotenv.get("DOGS_BASE_URL", "https://dog.ceo/api");
    public static String appid = dotenv.get("OPENWEATHER_API_KEY");
    public static String apiKey = dotenv.get("OPENWEATHER_API_KEY");
    public static String StationID;
    public static String json_contentType = "application/json";
}
