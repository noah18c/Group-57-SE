package assignment3.designpat.websearch;

import java.io.File;

/**
 * Launch the web-search example
 */
public class Main {
    public static void main(String[] args) {
        // Source file (in the project's assignment3.data/ folder)
        File inputTextFile = new File("C:/Users/achil/Downloads/desing pat/Group-57-SE/src/assignment3/data/Hamlet.txt");

        // Build object graph
        WebSearchModel model = new WebSearchModel(inputTextFile);
        Snooper snoop = new Snooper(model);

        // Execute
        model.pretendToSearch();
    }
}
