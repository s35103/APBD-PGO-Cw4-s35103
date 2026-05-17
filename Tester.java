public class Tester extends Pracownik {
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    public void uruchomRaportTestow() {
        System.out.println("Uruchomiono raport dla " + liczbaScenariuszy + " scenariuszy.");
    }

    @Override
    public double obliczKosztMiesieczny() {
        if (czyAutomatyzujacy) {
            return stawkaBazowa * 1.20;
        }
        return stawkaBazowa;
    }

    @Override
    public String przedstawSie() {
        String typ = czyAutomatyzujacy ? "automatyzującym" : "manualnym";
        return "Nazywam się " + getImie() + " i jestem testerem " + typ + ".";
    }

    @Override
    public String toString() {
        return super.toString() + " (Tester" + (czyAutomatyzujacy ? " Automatyczny)" : " Manualny)");
    }
}
