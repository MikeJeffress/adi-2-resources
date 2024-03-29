package ly.generalassemb.drewmahrt.classes_lab;

/**
 * Created by michaeljeffress on 6/19/16.
 */
import java.io.Serializable;

public class Animal implements Serializable {

    // This static variable is required for Serializable to work. Don't worry about it for now.
    private static final long serialVersionUID = 7526472295622776147L;

    int mTopSpeed;
    boolean mIsEndangered;
    String mName;

    public Animal(int topSpeed, boolean isEndangered, String name){
        this.mTopSpeed = topSpeed;
        this.mIsEndangered = isEndangered;
        this.mName = name;
    }

    public int getTopSpeed() {
        return mTopSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.mTopSpeed = topSpeed;
    }

    public boolean isEndangered() {
        return mIsEndangered;
    }

    public void setIsEndangered(boolean isEndangered) {
        this.mIsEndangered = isEndangered;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }
}

