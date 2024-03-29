package com.github.pawelwilkosz.oodesignpatterns.strategy;

public class KnifeFighting implements IFightingStrategy {
    private final String LOG_MESSAGE = "Fight by Knife";

    @Override
    public String fight() {
        return LOG_MESSAGE;
    }
}
