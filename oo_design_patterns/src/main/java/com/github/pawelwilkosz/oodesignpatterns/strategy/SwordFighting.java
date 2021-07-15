package com.github.pawelwilkosz.oodesignpatterns.strategy;

public class SwordFighting implements IFightingStrategy {
    private final String LOG_MESSAGE = "Fighting by Sword";

    @Override
    public String fight() {
        return LOG_MESSAGE;
    }
}
