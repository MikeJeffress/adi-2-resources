package ly.generalassemb.drewmahrt.oofundamentals;

/**
 * Created by drewmahrt on 1/26/16.
 */
public class Snake extends Reptile{
     boolean mIsPoisonous;

    public Snake(boolean isPoisonous){
        super(false,5,false,"Snake");
        mIsPoisonous = isPoisonous;
    }

    @Override
    public String makeNoise() {
        return "Hiss!!!";
    }

    @Override
    public String toString() {
        return "Snake" + (mIsPoisonous? " (Poisonous)" : "");
    }
}
