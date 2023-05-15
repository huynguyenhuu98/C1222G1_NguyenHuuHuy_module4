package com.example.ss2_dictionary.repository;

import com.example.ss2_dictionary.model.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryRepository {
    private static Map<Integer, Dictionary> dictionaryMap = new HashMap<>();
    static {
        dictionaryMap.put(1, new Dictionary("one","một"));
        dictionaryMap.put(2, new Dictionary("two","hai"));
        dictionaryMap.put(3, new Dictionary("three","ba"));
        dictionaryMap.put(4, new Dictionary("four","bốn"));
        dictionaryMap.put(5, new Dictionary("five","năm"));
    }
    public List<Dictionary> findAll() {
        return new ArrayList<>(dictionaryMap.values());
    }
}
