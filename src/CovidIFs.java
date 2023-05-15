
public class CovidIFs {
    private static final int TEMPERATURE = 38;
    private static final String DIAGNOSTICO = "/diagnostico/";

    private static final String CUARENTENA = "/diagnostico/";
    private static final String DIAGN_GOOD = "/diagnostico_bueno/";
    public static String covid(float bodyTemperature, boolean difficultyBreathing,
                               boolean diabetes, boolean cancer, boolean isPregnant,
                               boolean isOver60yearsold, boolean hepatic,
                               boolean kidneyDisease, boolean respiratoryDisease, String provincia) {
        if (bodyTemperature >= TEMPERATURE) {
            if (difficultyBreathing || diabetes || cancer || isPregnant ||
                    isOver60yearsold || hepatic || kidneyDisease || respiratoryDisease) {
                return DIAGNOSTICO + provincia;
            } else {
                return CUARENTENA;
            }
        } else {
            return DIAGN_GOOD;
        }
    }
}
