import java.util.ArrayList;
import java.util.List;

class Parabola {
    private final int a;
    private final int b;
    private final int c;

    public Parabola(int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String toString() {
        return "f(x) = " + a + "x^2+" + b + "x+" + c;
    }

    public Integer return_a(){
        return a;
    }

    public Integer return_b(){
        return b;
    }

    public Integer return_c(){
        return c;
    }

    public void varf_parabola(Parabola p){
        int x, y;

        x = -(p.return_b()/(2*p.return_a()));
        y = (-(p.return_b()*p.return_b()) + 4*p.return_a()*p.return_c())/4*p.return_a();

        System.out.println("Varful parabolei: (" + x + ", " + y + ")");
    }
}

class MainApp {
    public static void main(String[] args) {
        List<Parabola> parabole = new ArrayList<Parabola>();
        parabole.add(new Parabola(1, 6, 4));

        System.out.println("Lab 3: ");
        for (Parabola p:parabole) {
            System.out.println(p);
            p.varf_parabola(p);

        }
    }
}
