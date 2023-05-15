package com.example.ss2_dictionary.model;

public class Dictionary {
    private String englishWord;
    private String vietnamese;

    public Dictionary() {
    }

    public Dictionary(String englishWord, String vietnamese) {
        this.englishWord = englishWord;
        this.vietnamese = vietnamese;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getVietnamese() {
        return vietnamese;
    }

    public void setVietnamese(String vietnamese) {
        this.vietnamese = vietnamese;
    }
}
