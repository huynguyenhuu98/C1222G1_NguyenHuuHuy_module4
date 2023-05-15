package com.example.controller.service;

public class MoneyService implements IMoneyService {

    @Override
    public float money(float usd) {
        float vnd = usd * 23000;
        return vnd;
    }
}
