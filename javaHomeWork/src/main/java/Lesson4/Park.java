package Lesson4;

public class Park {

    private Entertainment[] entertainments;

    public Park(Entertainment[] entertainments) {
        this.entertainments = entertainments;
    }

    public void info() {
        if (entertainments == null || entertainments.length == 0) {
            System.err.println("No entertainments for processing");
        } else {
            System.out.println("Entertainments: ");
            for (Entertainment entertainment : entertainments) {
                System.out.println(entertainment);
            }
        }
    }

    public static class Entertainment {
        private double price;
        private String name;
        private int time;

        public Entertainment(double price, String name, int time) {
            this.price = price;
            this.name = name;
            this.time = time;
        }

        @Override
        public String toString() {
            return "Entertainment - " +
                    "price: " + price +
                    ", name: " + name +
                    ", time: " + time;
        }
    }
}
