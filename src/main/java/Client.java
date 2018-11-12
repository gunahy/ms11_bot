import com.viber.bot.api.ApiException;

import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class Client {

    private static final String BASE_URL = "https://chatapi.viber.com/pa/";
    protected String token;
    protected String botURL;
    private Map<String, String> httpInit = new HashMap<String, String>();

    public Client(String token, String botURL) {
        if (token == '') {
            throw new ApiException("No token provided");
        }

        this.token = token;
        httpInit.put("base_uri", BASE_URL);

        this.botURL = botURL;
    }
}
