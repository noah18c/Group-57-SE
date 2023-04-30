package assignment3.designpat.websearch;

/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */
/**
 * Watches the search queries
 */
public class Snooper {
    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;
        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("Oh yes! " + query);
            }
        }, new WebSearchModel.IQueryFilter() {

            @Override
            public boolean filter(String query) {
                if (query.contains("friend")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("So long.... " + query);
            }
        }, new WebSearchModel.IQueryFilter() {

            @Override
            public boolean filter(String query) {
                if (query.length() > 60) {
                    return true;
                } else {
                    return false;
                }
            }
        });

    }
}
