package co.com.novopangea.telegrambot;

import co.com.novopangea.telegrambot.configurations.BotConfigurations;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class TelegramBotApplication {

	public static void main(String[] args)
	{
		ApiContextInitializer.init();
		new BotConfigurations().config();
	}

}
