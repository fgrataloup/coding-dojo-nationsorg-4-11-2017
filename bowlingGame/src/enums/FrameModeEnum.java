package enums;

/**
 * Created by fgrataloup on 04/11/2017.
 */
public enum FrameModeEnum {


    STRIKE(2),
    SPARE(1);

    private int number;

    FrameModeEnum(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}
