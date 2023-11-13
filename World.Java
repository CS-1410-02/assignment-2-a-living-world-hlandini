import Java.util.ArrayList;
import Java.util.Random;

public class World {
    protected ArrayList[] creatures = new ArrayList[0];
    private ArrayList[] names = name.txt
    protected ArrayList[] totals = new ArrayList[];
    protected spawnRate;
    protected int numDead;
    protected int average;
    protected int created;
    private tempName;
    Random random = new Random();
    
    public void setSpawnRate(int s) {
        spawnRate = s;
    }

    public void yearPass () {
        if (totals.length() = 0) {
            average = 0;
        }
        for (int i = 0; i < creatures.Length(); i++) {
            if (Math.random() < 1/spawnRate) {
                spawn();
            }
            creatures[i].tick();
        }
        totals.add(creatures.Length());
        private int tempNum = 0;
        for (int i = 0; i < totals.Length(); i++) {
            tempNum += totals[i];
        }
        average = tempNum/totals.Length();
        System.out.println("Year " + yearCount + " results:");
        System.out.println("Total creatures: " + creatures.length() + "   Average: " + average + "   Created: " + created = "   deceased: " + numDead);
        if (Math.random() < .5) {
            //implement food, and party and stuff im to tired rn lol
        }
        created = 0;
        numDead = 0;
        average = 0;
    }

    protected void spawn() {
        created++;
        tempName = names[random.nextInt(1000)];
        creatures.add(new Creature(tempName, 0, creatures.length));
    }
}