// The public class for the file
public abstract class Item {
    protected String name;
    protected String description;
    protected int quantity;
    protected boolean isStackable;
    protected String rarity;

    // Set up for the Item constructor
    public Item(String name, String description, int quantity, boolean isStackable, String rarity) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.isStackable = isStackable;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isStackable() {
        return isStackable;
    }

    public String getRarity() {
        return rarity;
    }

    public abstract void useItem();
}

// The weapon class is a package-private and extends the item class
// Same goes for the potion, armor, and key items classes below.
class Weapon extends Item {
    private int damage;
    private double weight;
    private String weaponType;
    private int durability;

    public Weapon(String name, String description, int quantity, boolean isStackable, String rarity, int damage, double weight, String weaponType, int durability) {
        super(name, description, quantity, isStackable, rarity);
        this.damage = damage;
        this.weight = weight;
        this.weaponType = weaponType;
        this.durability = durability;
    }

    public int getDamage() {
        return damage;
    }

    public double getWeight() {
        return weight;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public int getDurability() {
        return durability;
    }

    public void useItem() {
        if (durability > 0) {
            System.out.println(name + " used. Damage dealt: " + damage);
            durability--;
        } else {
            System.out.println(name + " is broken!");
        }
    }
}

class Potion extends Item {
    private String effect;
    private int potency;
    private double duration;

    public Potion(String name, String description, int quantity, boolean isStackable, String rarity, String effect, int potency, double duration) {
        super(name, description, quantity, isStackable, rarity);
        this.effect = effect;
        this.potency = potency;
        this.duration = duration;
    }

    public String getEffect() {
        return effect;
    }

    public int getPotency() {
        return potency;
    }

    public double getDuration() {
        return duration;
    }

    public void useItem() {
        System.out.println(name + " used. Effect: " + effect + " for " + duration + " seconds.");
    }
}

class Armor extends Item {
    private int defenseRating;
    private double weight;
    private String armorType;
    private int durability;

    public Armor(String name, String description, int quantity, boolean isStackable, String rarity, int defenseRating, double weight, String armorType, int durability) {
        super(name, description, quantity, isStackable, rarity);
        this.defenseRating = defenseRating;
        this.weight = weight;
        this.armorType = armorType;
        this.durability = durability;
    }

    public int getDefenseRating() {
        return defenseRating;
    }

    public double getWeight() {
        return weight;
    }

    public String getArmorType() {
        return armorType;
    }

    public int getDurability() {
        return durability;
    }

    public void useItem() {
        if (durability > 0) {
            System.out.println(name + " equipped. Defense: " + defenseRating);
            durability--;
        } else {
            System.out.println(name + " is broken!");
        }
    }
}

class KeyItem extends Item {
    private String purpose;
    private boolean isQuestRelated;

    public KeyItem(String name, String description, int quantity, boolean isStackable, String rarity, String purpose, boolean isQuestRelated) {
        super(name, description, quantity, isStackable, rarity);
        this.purpose = purpose;
        this.isQuestRelated = isQuestRelated;
    }

    public String getPurpose() {
        return purpose;
    }

    public boolean isQuestRelated() {
        return isQuestRelated;
    }

    public void useItem() {
        System.out.println(name + " used for: " + purpose);
    }
}
