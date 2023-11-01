public class Covid19Data {
    private String region;
    private String aldersGruppe;
    private String bekræftedeTilfældeIAlt;
    private String døde;
    private String indlagtePåIntensivAfdeling;
    private String indlagte;
    private String dato;

    public Covid19Data(String region, String aldersGruppe, String bekræftedeTilfældeIAlt, String døde, String indlagtePåIntensivAfdeling, String indlagte, String dato){
        this.region = region;
        this.aldersGruppe = aldersGruppe;
        this.bekræftedeTilfældeIAlt = bekræftedeTilfældeIAlt;
        this.døde = døde;
        this.indlagtePåIntensivAfdeling = indlagtePåIntensivAfdeling;
        this.indlagte = indlagte;
        this.dato = dato;
    }


    public String getRegion() {
        return region;
    }

    public String getBekræftedeTilfældeIAlt() {
        return bekræftedeTilfældeIAlt;
    }

    public String getAldersGruppe() {
        return aldersGruppe;
    }

    public String getDøde(){
        return døde;
    }

    public String getIndlagtePåIntensivAfdeling() {
        return indlagtePåIntensivAfdeling;
    }

    public String getIndlagte() {
        return indlagte;
    }

    public String getDato() {
        return dato;
    }

    @Override
    public String toString() {
        return "Covid19Data{" +
                "region='" + region + '\'' +
                ", aldersGruppe='" + aldersGruppe + '\'' +
                ", bekræftedeTilfældeIAlt=" + bekræftedeTilfældeIAlt +
                ", døde=" + døde +
                ", indlagtePåIntensivAfdeling=" + indlagtePåIntensivAfdeling +
                ", indlagte=" + indlagte +
                ", dato='" + dato + '\'' +
                '}';
    }
}


