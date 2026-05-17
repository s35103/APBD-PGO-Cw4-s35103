public class Programista extends Pracownik {
    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista(String idPracownika, String imie, String nazwisko, double stawkaBazowa, String glownyJezyk, int liczbaRepozytoriow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    public void wypiszTechnologie() {
        System.out.println("Moja główna technologia to: " + glownyJezyk);
    }

    @Override
    public double obliczKosztMiesieczny() {
        double bonus = liczbaRepozytoriow * 100;
        return stawkaBazowa + bonus; 
    }

    @Override
    public String przedstawSie() {
        return "Nazywam się " + getImie() + " i piszę kod w " + glownyJezyk + ".";
    }

    @Override
    public String toString() {
        return super.toString() + " (Programista " + glownyJezyk + ")";
    }
}
