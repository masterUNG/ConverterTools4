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

        unit1Strings = new String[3];
        unit1Strings[0] = "test";
        unit1Strings[1] = "test1";
        unit1Strings[2] = "tes2t";

        return unit1Strings;
    }

    public String[] getUnit2Strings() {

        unit2Strings = new String[3];
        unit2Strings[0] = "test";
        unit2Strings[1] = "test1";
        unit2Strings[2] = "tes2t";

        return unit2Strings;
    }

    public String[] getUnit3Strings() {

        unit3Strings = new String[3];
        unit3Strings[0] = "test";
        unit3Strings[1] = "test1";
        unit3Strings[2] = "tes2t";

        return unit3Strings;
    }

    public String[] getUnit4Strings() {

        unit4Strings = new String[3];
        unit4Strings[0] = "test";
        unit4Strings[1] = "test1";
        unit4Strings[2] = "tes2t";

        return unit4Strings;
    }
}   // MyConstant
