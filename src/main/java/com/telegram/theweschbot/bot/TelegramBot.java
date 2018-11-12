package com.telegram.theweschbot.bot;

import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

public class TelegramBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {

        

    }

    @Override
    public String getBotUsername() {
        return "TheWeschBot";
    }

    @Override
    public String getBotToken() {
        return "688806943:AAFo7HCOJDIGDI6GVcQI9e8fjYzTwzY0jts";
    }
}
