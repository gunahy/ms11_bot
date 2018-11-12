
import com.viber.bot.api.ViberBot;
import com.viber.bot.profile.BotProfile;


public class FirstBot {

    private static final String URL = "https://ms11bot.herokuapp.com/";
    private static final String AUTH_TOKEN = "48bc74e0a2a7d422-30bba09a32317b03-745e8a830952ebfc";


    public static void main(String[] args) {

        ViberBot viberBot = new ViberBot(new BotProfile("ms11_bot", ""), AUTH_TOKEN);
        viberBot.onMessageReceived((event, message, response) -> response.send(message));

        }
    }
}
