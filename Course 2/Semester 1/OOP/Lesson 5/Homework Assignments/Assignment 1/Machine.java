public class Machine {
    private double price;

    public Machine(double price) {
        this.price = price;
    }

    public Paper[] createTracerPaper(String context, int symbolsPerPage) {
        int pageCount = (int) Math.ceil((double) context.length() / symbolsPerPage);
        Paper[] pages = new Paper[pageCount];

        for (int i = 0; i < pageCount; i++) {
            pages[i] = new Paper();
            int start = i * symbolsPerPage;
            int end = Math.min((i + 1) * symbolsPerPage, context.length());
            String pageContent = context.substring(start, end);
            pages[i].setContent(pageContent);

            int readableCharacters = 0;
            for (char symbol : pageContent.toCharArray()) {
                if (symbol != ' ' && symbol != '\t' && symbol != '\n') {
                    readableCharacters++;
                }
            }
            pages[i].setFillRate(((double) readableCharacters / symbolsPerPage) * 100);
        }

        return pages;
    }
}

class Printer extends Machine {
    private int numberOfPages;

    public Printer(double price, int numberOfPages) {
        super(price);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public Paper[] createTracerPaper(String context, int symbolsPerPage) {
        super.createTracerPaper(context, 2500);
        int pageCount = (int) Math.ceil((double) context.length() / symbolsPerPage);
        Paper[] pages = new Paper[pageCount];

        for (int i = 0; i < pageCount; i++) {
            pages[i] = new Paper();
            int start = i * symbolsPerPage;
            int end = Math.min((i + 1) * symbolsPerPage, context.length());
            String pageContent = context.substring(start, end);
            pages[i].setContent(pageContent);

            int readableCharacters = 0;
            for (char symbol : pageContent.toCharArray()) {
                if (symbol != ' ' && symbol != '\t' && symbol != '\n') {
                    readableCharacters++;
                }
            }
            pages[i].setFillRate(((double) readableCharacters / symbolsPerPage) * 100);
        }

        return pages;
    }
}

class Duplicator extends Machine {
    private int paperCount;
    private int copyPaper;

    public Duplicator(double price) {
        super(price);
    }

    public int getPaperCount() {
        return paperCount;
    }

    public void setPaperCount(int paperCount) {
        this.paperCount = paperCount;
    }

    public int getCopyPaper() {
        return copyPaper;
    }

    public void setCopyPaper(int copyPaper) {
        this.copyPaper = copyPaper;
    }

    @Override
    public Paper[] createTracerPaper(String context, int symbolsPerPage) {
        super.createTracerPaper(context, 2500);
        if (paperCount > 0 && copyPaper > 0) {
            int pageCount = (int) Math.ceil((double) context.length() / symbolsPerPage);
            int totalCopies = pageCount * copyPaper;

            if (totalCopies <= paperCount) {
                Paper[] pages = new Paper[totalCopies];

                for (int i = 0; i < pageCount; i++) {
                    for (int copy = 0; copy < copyPaper; copy++) {
                        int pageIndex = i * copyPaper + copy;
                        pages[pageIndex] = new Paper();
                        int start = i * symbolsPerPage;
                        int end = Math.min((i + 1) * symbolsPerPage, context.length());
                        String pageContent = context.substring(start, end);
                        pages[pageIndex].setContent(pageContent);

                        int readableCharacters = 0;
                        for (char symbol : pageContent.toCharArray()) {
                            if (symbol != ' ' && symbol != '\t' && symbol != '\n') {
                                readableCharacters++;
                            }
                        }
                        pages[pageIndex].setFillRate(((double) readableCharacters / symbolsPerPage) * 100);
                    }
                }
                return pages;
            } else {
                System.out.println("Not enough paper to create requested copies.");
            }
        } else {
            System.out.println("Invalid paper count or copy paper count.");
        }

        return new Paper[0]; // Return an empty array in case of failure
    }

}
