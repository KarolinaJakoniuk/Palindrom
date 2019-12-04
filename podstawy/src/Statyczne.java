public class Statyczne {
    private String umaszczenie;
    private long dlugoscOgona;

    public Statyczne(String umaszczenie, long dlugoscOgona) {
        this.umaszczenie = umaszczenie;
        this.dlugoscOgona = dlugoscOgona;
    }

    public String getUmaszczenie() {
        return umaszczenie;
    }

    public void setUmaszczenie(String umaszczenie) {
        this.umaszczenie = umaszczenie;
    }

    public long getDlugoscOgona() {
        return dlugoscOgona;
    }

    public void setDlugoscOgona(long dlugoscOgona) {
        this.dlugoscOgona = dlugoscOgona;
    }
}
