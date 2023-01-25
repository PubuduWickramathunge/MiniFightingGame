public class Player2 extends Player1{


    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);

        this.armour = armour;

    }

    @Override
    public void damageByGun1() {
        if(armour){
        setHealth(getHealth()-20);
        if(getHealth() <= 0) {
            setHealth(0);
            System.out.println(getName() + " is dead!");
        }

        else System.out.println("Armour is on. Got hit by gun1. Health is reduces by 20. New health is " + getHealth());
        }
        else{
            setHealth(getHealth()-30);
            if(getHealth() <= 0){
                setHealth(0);
                System.out.println(getName()+" is dead!");
            }
            else System.out.println("Got hit by gun2. Health is reduces by 30. New health is " + getHealth());

        }
    }

    @Override
    public void damageByGun2() {
        if(armour){
            setHealth(getHealth()-40);
            if(getHealth() <= 0) {
                setHealth(0);
                System.out.println(getName() + " is dead!");
            }

            else System.out.println("Armour is on. Got hit by gun2. Health is reduces by 40. New health is " + getHealth());
        }else{
            setHealth(getHealth()-50);
            if(getHealth() <= 0){
                setHealth(0);
                System.out.println(getName()+" is dead!");
            }
            else System.out.println("Got hit by gun2. Health is reduces by 50. New health is " + getHealth());

        }
    }

    @Override
    public void heal() {
        super.heal();
    }
}
