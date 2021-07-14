package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DictionaryServiceImp implements DictionaryService{
    private static Map<String, String> dictionaries;

    static {
        dictionaries = new HashMap<>();
        dictionaries.put("one","mot");
        dictionaries.put("hello","xin chao");
        dictionaries.put("school","truong hoc");
        dictionaries.put("computer","may vi tinh");
        dictionaries.put("magic","ma thuat");
    }

    @Override
    public Map<String, String> findAll() {
        return new HashMap<>(dictionaries);
    }

    @Override
    public String translate(String keyWord){
        Set<String> keys = dictionaries.keySet();
        for (String key: keys){
            if (key.equals(keyWord)){
                return dictionaries.get(key);
            }
        }
        return "Not found";
    }
}
