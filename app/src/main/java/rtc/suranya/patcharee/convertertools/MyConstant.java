package rtc.suranya.patcharee.convertertools;

/**
 * Created by masterUNG on 12/5/2016 AD.
 */

public class MyConstant {

    //Explicit
    private String[] categoryStrings, unit0Strings, unit1Strings,
            unit2Strings, unit3Strings, unit4Strings;


    public String[] getCategoryStrings() {

        categoryStrings = new String[6];
        categoryStrings[0] = "Length";
        categoryStrings[1] = "Weigh";
        categoryStrings[2] = "Area";
        categoryStrings[3] = "Temperature";
        categoryStrings[4] = "Measure";

        return categoryStrings;
    }

    public String[] getUnit0Strings() {

        unit0Strings = new String[6];
        unit0Strings[0] = "mm.";
        unit0Strings[1] = "cm.";
        unit0Strings[2] = "mm.";
        unit0Strings[3] = "mm.";
        unit0Strings[4] = "mm.";
        unit0Strings[5] = "mm.";

        return unit0Strings;
    }

    public String[] getUnit1Strings() {
        return unit1Strings;
    }

    public String[] getUnit2Strings() {
        return unit2Strings;
    }

    public String[] getUnit3Strings() {
        return unit3Strings;
    }

    public String[] getUnit4Strings() {
        return unit4Strings;
    }
}   // MyConstant
