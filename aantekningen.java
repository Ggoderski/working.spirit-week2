class Demo{  
    public static void main(String[] args){
        System.out.println("Daar gaat ie");
        int a = 32;
        final long b = a;
        
        int c = (int)b;
        
        int d = 7;
        System.out.println(d);
        // declaratie verplicht 1 x
        int e;
            // initialisation
        // assignment oneindig minimaal 1 keer
        e = 35;
        
        int f = 55; // locale variable
                        // instantieren
        Fiets fiets = new Fiets();
        Fiets fiets2 = null;
        
        System.out.println(fiets2.snelheid);
        
        
        // byte short int long
        // float double
        // boolean
        // char
        
        // STRING
    }
}
class Fiets{
    int snelheid = 25;  // field  eigenschap attribuut property kenmerk object variable
    //returntype
    void fietsen() { // method  functie procedure (default package-private)
        System.out.println("Ik ben aan het fietsen");
    }
                    // parameter
    // Signature: Het aantal het type en de volgorde van de parameters (methodenaam)
                // overloading - als de signature ander is
    void fietsen(int a) {
        System.out.println("Ik ben nog meer aan het fietsen");
    }
}
// String Wrapper
class Persoon{
    // declaratie object variabele ReferenceType
    //  Has-A   relatie
    Fiets mijnFiets; //
}

// Is-A relatie  Inheritance   Covariant
class Vervoermiddel{
    
}
class Auto extends Vervoermiddel{  // Is-A relatie
    
}












