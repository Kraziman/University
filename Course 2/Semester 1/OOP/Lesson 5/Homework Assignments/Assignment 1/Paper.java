public class Paper {
    private double fillRate;
    private String content;

    public Paper() {
    }

    public Paper(String content) {
        this.content = content;
    }

    public double getFillRate() {
        return fillRate;
    }

    public void setFillRate(double fillRate) {
        this.fillRate = fillRate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "fillRate=" + String.format("%.2f", fillRate) +
                "%}";
    }
}