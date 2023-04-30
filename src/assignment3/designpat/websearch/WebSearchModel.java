package assignment3.designpat.websearch;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */
/**
 * Perform "web search" (from a file), notify the interested observers of each
 * query.
 */
public class WebSearchModel {
    private final File sourceFile;
    private final Map<QueryObserver, iQueryFilter> hashmap = new HashMap<QueryObserver, iQueryFilter>();

    public interface QueryObserver {
        void onQuery(String query);
    }

    public interface iQueryFilter {
        boolean filter(String query);
    }

    public WebSearchModel(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public void pretendToSearch() {
        // Source:
        // https://stackoverflow.com/questions/5868369/how-can-i-read-a-large-text-file-line-by-line-using-java
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                notifyAllObservers(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addQueryObserver(QueryObserver queryObserver, iQueryFilter queryFilter) {
        hashmap.put(queryObserver, queryFilter);
    }

    private void notifyAllObservers(String line) {
        for (QueryObserver obs : hashmap.keySet()) {
            iQueryFilter filter = hashmap.get(obs);
            if (filter.filter(line)) {
                obs.onQuery(line);
            }

        }
    }
}
