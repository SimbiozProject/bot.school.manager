package com.example.telegramBot.user.keyboard.inline;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.example.telegramBot.user.repositiry.TestAnswerOptions.ANSWER_OPTIONS;


public class UserInlineKeyboardSource {

    public UserInlineKeyboardSource() {
    }

    public InlineKeyboardMarkup getAnswerOptionsInlineMarkup(Integer number) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        InlineKeyboardButton firstKeyboardButton = new InlineKeyboardButton().setText(ANSWER_OPTIONS[number][0]);
        InlineKeyboardButton secondKeyboardButton = new InlineKeyboardButton().setText(ANSWER_OPTIONS[number][1]);
        InlineKeyboardButton thirdKeyboardButton = new InlineKeyboardButton().setText(ANSWER_OPTIONS[number][2]);
        InlineKeyboardButton fourthKeyboardButton = new InlineKeyboardButton().setText(ANSWER_OPTIONS[number][3]);

        firstKeyboardButton.setCallbackData("english" + ANSWER_OPTIONS[number][0]);
        secondKeyboardButton.setCallbackData("english" + ANSWER_OPTIONS[number][1]);
        thirdKeyboardButton.setCallbackData("english" + ANSWER_OPTIONS[number][2]);
        fourthKeyboardButton.setCallbackData("english" + ANSWER_OPTIONS[number][3]);

        List<InlineKeyboardButton> keyboardFirstRow = new ArrayList<>();
        keyboardFirstRow.add(firstKeyboardButton);
        keyboardFirstRow.add(secondKeyboardButton);

        List<InlineKeyboardButton> keyboardSecondRow = new ArrayList<>();
        keyboardSecondRow.add(thirdKeyboardButton);
        keyboardSecondRow.add(fourthKeyboardButton);

        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(keyboardFirstRow);
        keyboard.add(keyboardSecondRow);

        inlineKeyboardMarkup.setKeyboard(keyboard);

        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup getStartTest() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        InlineKeyboardButton firstKeyboardButton = new InlineKeyboardButton().setText("Start test");
        firstKeyboardButton.setCallbackData("english");
        List<InlineKeyboardButton> keyboardFirstRow = new ArrayList<>();
        keyboardFirstRow.add(firstKeyboardButton);
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(keyboardFirstRow);
        inlineKeyboardMarkup.setKeyboard(keyboard);

        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup getMainMenuKeyboard() {

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        InlineKeyboardButton firstButton = new InlineKeyboardButton().setText("1.Начальная проверка уровня").setCallbackData("initial.level.check");
        InlineKeyboardButton secondButton = new InlineKeyboardButton().setText("2.Запись на пробное занятие").setCallbackData("sign.up.for.trial.lesson");
        InlineKeyboardButton thirdButton = new InlineKeyboardButton().setText("3.Информация о курсе").setCallbackData("course.information");
        InlineKeyboardButton fourthButton = new InlineKeyboardButton().setText("4.Купить курс").setCallbackData("buy.course");

        List<InlineKeyboardButton> firstKeyboard = new ArrayList<>();
        firstKeyboard.add(firstButton);
        List<InlineKeyboardButton> secondKeyboard = new ArrayList<>();
        secondKeyboard.add(secondButton);
        List<InlineKeyboardButton> thirdKeyboard = new ArrayList<>();
        thirdKeyboard.add(thirdButton);
        List<InlineKeyboardButton> fourthKeyboard = new ArrayList<>();
        fourthKeyboard.add(fourthButton);

        List<List<InlineKeyboardButton>> keyboardRows = new ArrayList<>();
        keyboardRows.add(firstKeyboard);
        keyboardRows.add(secondKeyboard);
        keyboardRows.add(thirdKeyboard);
        keyboardRows.add(fourthKeyboard);

        inlineKeyboardMarkup.setKeyboard(keyboardRows);

        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup getSelectCourseBoardLevelZero() {

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        InlineKeyboardButton firstButton = new InlineKeyboardButton().setText("Level 0. More info").setCallbackData("level.zero");
        InlineKeyboardButton secondButton = new InlineKeyboardButton().setText("Купить").setCallbackData("buy.course.level.zero");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        keyboardButtonsRow1.add(firstButton);
        keyboardButtonsRow1.add(secondButton);

        List<List<InlineKeyboardButton>> keyboardRow1 = new ArrayList<>();
        keyboardRow1.add(keyboardButtonsRow1);

        inlineKeyboardMarkup.setKeyboard(keyboardRow1);

        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup getSelectCourseBoardLevelAdvanced() {

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        InlineKeyboardButton thirdButton = new InlineKeyboardButton().setText("Level advanced. More info").setCallbackData("level.advanced");
        InlineKeyboardButton forthButton = new InlineKeyboardButton().setText("Купить").setCallbackData("buy.course.level.advanced");

        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        keyboardButtonsRow2.add(thirdButton);
        keyboardButtonsRow2.add(forthButton);

        List<List<InlineKeyboardButton>> keyboardRow2 = new ArrayList<>();
        keyboardRow2.add(keyboardButtonsRow2);

        inlineKeyboardMarkup.setKeyboard(keyboardRow2);

        return inlineKeyboardMarkup;
        //return new SendMessage().setChatId(chatId).setText("Пример").setReplyMarkup(inlineKeyboardMarkup);
    }
}

