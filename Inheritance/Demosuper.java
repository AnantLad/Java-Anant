package Inheritance;
import java.security.PublicKey;

class Box {
    private double width;
    private double height;
    private double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }

    Box(double len) {
        width = height = depth = len;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    double volume() {
        return width * height * depth;
    }

    static class Boxweight extends Box {
        double weight;

        Boxweight(Boxweight ob) {
            super(ob);
            weight = ob.weight;
        }

        Boxweight(double w, double h, double d, double m) {
            super(w, h, d);
            weight = m;
        }

        Boxweight() {
            super();
            weight = -1;
        }

        Boxweight(double len, double m) {
            super(len); 
            weight = -1;
        }

    }
}

    class Demosuper {
        public static void main(String[] args) {
            Box.Boxweight mybox1 = new Box.Boxweight(10, 20, 15, 343);
            Box.Boxweight mybox2 = new Box.Boxweight(2, 3, 4, 0.076);
            Box.Boxweight mybox3 = new Box.Boxweight();

            Box.Boxweight mycube = new Box.Boxweight(3, 2);
            Box.Boxweight myclone = new Box.Boxweight(mybox1);
            double vol;
            vol = mybox1.volume();
            System.out.println("Volume of my box 1 is " + vol);
            System.out.println("weight of my box 1 is " + mybox1.weight);
            vol = mybox2.volume();
            System.out.println("Volume of my box 2 is " + vol);
            System.out.println("weight of my box 2 is " + mybox2.weight);
            vol = mybox3.volume();
            System.out.println("Volume of my box 3 is " + vol);
            System.out.println("weight of my box 3 is " + mybox3.weight);
            vol = mycube.volume();
            System.out.println("Volume of my cube is " + vol);
            System.out.println("weight of my cube is " + mycube.weight);
            vol = myclone.volume();
            System.out.println("Volume of my clone is " + vol);
            System.out.println("weight of my clone is " + myclone.weight);
        }
    }

    class Shipment extends Box.Boxweight {
        double cost;

        Shipment(Shipment ob) {
            super(ob);
            cost = ob.cost;
        }

        Shipment(double w, double h, double d, double m, double c) {
            super(w, h, d, m);
            cost = c;
        }

        Shipment() {
            super();
            cost = -1;
        }

        Shipment(double len, double m, double c) {
            super(len, m);
            cost = c;
        }
    }
        class DemoShipment {
            public static void main(String[] Args)
            {
                Shipment shipment1 = new Shipment(10, 20, 15, 343, 3.41);
                Shipment shipment2 = new Shipment(2, 3, 4, 0.076, 1.28);
                double vol;
                vol = shipment1.volume();
                System.out.println("vol of shipment1 " + vol);
                System.out.println("weight of shipment1 =" + shipment1.weight);
                System.out.println("Shipping cost $ "+shipment1.cost);
                vol = shipment2.volume();
                System.out.println("vol of shipment2 " + vol);
                System.out.println("weight of shipment2 =" + shipment2.weight);
                System.out.println("Shipping cost $ "+shipment2.cost);
            }
        }













//

