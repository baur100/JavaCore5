package HW20;

public interface Mammals extends Vertebrates {

    void moveFast();
}

abstract class Carnivoes{

   static class Lion{

        public void breath(){
            System.out.println("They can breath");
        }

    }

    static class Wolf{


        public void feed(){
            System.out.println("I can feed");
        }

    }

    static class BlueWhale{

        public void reproduce(){
            System.out.println("I can reproduce");
        }




    }
}

abstract class Primates{


}

abstract class Seals{

}

abstract class Rodents{

}

abstract class Whales{

}

abstract class Herbivores{

}


