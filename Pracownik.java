
public class Pracownik {
    private String idPracownika;
    private String imie;
    private String nazwisko;
    protected double stawkaBazowa;

    public Pracownik(String idPracownika, String imie, String nazwisko, double stawkaBazowa) {
        this.idPracownika = idPracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stawkaBazowa = stawkaBazowa;
    }

    public final String pobierzIdPracownika() {
        return idPracownika;
    }


    public double obliczKosztMiesieczny() {
        return stawkaBazowa; 
    }

    public String przedstawSie() {
        return "Nazywam się " + imie + " " + nazwisko + ", jestem pracownikiem.";
    }

    public String getImie() { return imie; }
    public String getNazwisko() { return nazwisko; }

    @Override
    public String toString() {
        return "[" + idPracownika + "] " + imie + " " + nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Pracownik pracownik = (Pracownik) o;
        return idPracownika.equals(pracownik.idPracownika);
    }
}
