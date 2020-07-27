import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

class DnDCharacter {
    private int strength, wisdom, dexterity, constitution, charisma, intelligence;

    public DnDCharacter() {
        this.strength = ability();
        this.wisdom = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.charisma = ability();
        this.intelligence = ability();
    }

    int ability() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            list.add((int) (Math.random() * 6 + 1));
        }
        list.remove(Collections.min(list));
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }
}
