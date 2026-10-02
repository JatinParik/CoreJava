sealed class Aoi permits Boi, Coi, Choi{  //Only Boi, Coi and Choi are permitted to extend Aoi and they must extend Aoi

}

//Any class permitted to extend a sealed class must be final, sealed or non-sealed
non-sealed class Boi extends Aoi { 
    
}

final class Coi extends Aoi {

}

sealed class Choi extends Aoi permits Dhoi{

}

class Doi extends Boi {  // can't extend Aoi as its not permitted but can extend Boi as its non-sealed

}

final class Dhoi extends Choi{

}

sealed interface Xoxo permits Coxo {

}

non-sealed interface Coxo extends Xoxo {

}

public class SealedClass {
    
    public static void main(String[] args) {
        
    }
}
