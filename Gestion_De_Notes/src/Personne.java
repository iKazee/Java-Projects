public abstract class Personne {
    private String nom;
    private String prenom;

    public Personne(String nom, String prenom){
  
        if ( nom ==  null || nom.trim().isEmpty() && prenom == null || prenom.trim().isEmpty()) {
            throw new IllegalArgumentException("Erreur de Saisie");
        }

        if (!nom.equals(nom.toUpperCase())) {
        throw new IllegalArgumentException("Le nom doit être entièrement en majuscules.");
        }   

        this.nom = nom;
        this.prenom = prenom;

    };

    public String getNom(){
        return this.nom;
    };
    public String getPrenom(){
        return this.prenom;
    };
    public String getRole(){
        return "";
    };
    public String toString(){
        return getPrenom() + " " + getNom();
    };
}
