import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public class Main {

    public static void main(String[] args) {

        //Initialize Api Context
        ApiContextInitializer.init();

        //Initialize Telegram Bot Api
        TelegramBotsApi botsApi = new TelegramBotsApi();

        //Register KLAF bot
        try {
            botsApi.registerBot(new KLAFbot());
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }

    }

}
