public class Main {
    public static void main(String[] args) {
        Player1 player = new Player1("pubudu", "AK47", 1100);
//        System.out.println(player.getName());
//        System.out.println(player.getWeapon());
//        System.out.println(player.getHealth());
//        player.damageByGun1();
//        player.damageByGun2();
//        player.damageByGun2();

        Player2 betterPlayer = new Player2("Oshada", "Sniper", 100, true );
//        player.damageByGun1();
//        player.damageByGun2();
//        player.heal();
//        player.damageByGun2();
//        player.damageByGun2();
//
//        player.heal();

        betterPlayer.damageByGun1();
        betterPlayer.damageByGun2();
        betterPlayer.heal();
        betterPlayer.damageByGun2();
        betterPlayer.damageByGun2();
        betterPlayer.damageByGun1();

        betterPlayer.heal();


    }
}