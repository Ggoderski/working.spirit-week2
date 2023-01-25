class Demo{
    static public void main(String[] ab){
        Dier dier = new Konijn();
        dier.voortbewegen();
        AAA c = new CCC();
        c.xxx();
    }
}



class AAA{
    void xxx() {
        System.out.println("a");
    }
}

class BBB extends AAA{

    
}
class CCC extends BBB{
    @Override
    void xxx() {
        System.out.println("c");
    }
}






class FietsWinkel{
    Fiets kopen(int geld){
        return new Fiets();
    }
}
class MountainBikeWinkel{
    MountainBike kopen(int geld){
        return new MountainBike();
    }
}

class Fiets{}
class MountainBike extends Fiets{}



class Dier{
    int aantalogen;
    void voortbewegen() {
        System.out.println("bewegen in dier");
    }
}
class Konijn extends Dier{
    int staart;
    void springen() {
        System.out.println("springen in dier");
    }
    void voortbewegen() { // override  1 signature hetzelfde zijn 
                            // 2 returntype moet covariant zijn
                                // 3 accessmodifier mag niet vernauwen
                                    // 4 throws clausule mag een covariant bevatten of niets
        System.out.println("bewegen in konijn");
        
    }
}