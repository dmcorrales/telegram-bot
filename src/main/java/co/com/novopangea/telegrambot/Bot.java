package co.com.novopangea.telegrambot;


import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public final class Bot extends TelegramLongPollingBot {

    private static final String API_TOKEN="905514168:AAH7PFoGyng8OqJgxEtT58SiVnXIiKuZivI";
    public static final String BOT_NAME="pangea_alfredo_bot";


    @Override
    public void onUpdateReceived(Update update) {
        SendMessage message = new SendMessage();
        String msg = update.getMessage().getText();

        if(msg.matches("roberto"))
            message.setText("Texto personalizado");
        else
            message.setText("Hola! Este es el chat de soporte");

        message.setChatId(update.getMessage().getChatId());

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }

    @Override
    public String getBotToken() {
        return API_TOKEN;
    }
}
