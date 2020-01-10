import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class KLAFbot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {

        //Message
        if (update.hasMessage() && update.getMessage().hasText()) {
            long chatId = update.getMessage().getChatId();
            String msgText = update.getMessage().getText();

            String res = msgText;

            if (msgText.equals("Salom"))
                res = "Assalomu alaykum, " + update.getMessage().getFrom().getFirstName();

            SendMessage sendMessage = new SendMessage().setChatId(chatId).setText(res);
            try {
                execute(sendMessage); //Send Message to user
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

            // PHOTO
        } else if (update.hasMessage() && update.getMessage().hasPhoto()) {


        }

    }

    public String getBotUsername() {
        //@KLAFbot
        return "KLAFbot";
    }

    public String getBotToken() {
        return "1042397955:AAECwVWREfYJy41UnPK3szIt1rmRG_W_ddE";
    }
}
