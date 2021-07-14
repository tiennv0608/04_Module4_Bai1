package service;

import java.util.Map;

public interface DictionaryService {
    Map<String, String> findAll();

    String translate(String keyWord);
}
