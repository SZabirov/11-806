package ru.kpfu.itis.textsimilarity;

import java.util.List;

public class SearchEngineImpl implements SearchEngine {
    @Override
    public List<TextProvider> getSortedByRelevanceList(TextProvider target, List<TextProvider> sources) {
        //FIXME
        return sources;
    }
}
