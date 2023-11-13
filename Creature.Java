public class Creature extends World implements Live {
    protected int reproductionRate;
    protected int dieRate;
    
    protected String name;
    protected int age;
    protected int placement;

    public Creature(int n, int a, int p) {
        name = n;
        age = a;
        placement = p;
    }

    protected void reproduce() {
        spawn();
    }

    protected void die() {
        creatures.remove(placement);
        numDead++;
    }

    public void setRates(int r, int s, int d) {
        reproductionRate = r;
        setSpawnRate(s);
        dieRate = d;
    }

    protected void tick() {
        age++;
        if (math.Random() < 1/reproductionRate) {
            reproduce();
        }
        if (math.Random() < 1/dieRate) {
            die();
        } else {
            placement -= numDead;
        }
    }
}