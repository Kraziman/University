public class Application {
    private static void printPapers(Paper[] papers) {
        for (Paper paper : papers) {
            System.out.println(paper.getContent());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test Paper class
        Paper paper1 = new Paper("Hello, this is some content for paper 1.");
        System.out.println("Paper 1: " + paper1);

        // Test Machine class
        Machine machine = new Machine(100);
        Paper[] machinePapers = machine.createTracerPaper("Machine test content", 500);
        System.out.println("Machine Papers:");
        printPapers(machinePapers);

        // Test Printer class
        Printer printer = new Printer(150, 5);
        Paper[] printerPapers = printer.createTracerPaper("Printer test content", 1000);
        System.out.println("Printer Papers:");
        printPapers(printerPapers);

        // Test Duplicator class
        Duplicator duplicator = new Duplicator(200);
        duplicator.setPaperCount(20);
        duplicator.setCopyPaper(2);
        Paper[] duplicatorPapers = duplicator.createTracerPaper("Duplicator test content", 1500);
        System.out.println("Duplicator Papers:");
        printPapers(duplicatorPapers);
    }
}
