package modele;

public class Plat {
    private String nom;
    private String image;
    private Double prix;

    public Plat(String nom, String image, Double prix) {
        this.nom = nom;
        this.image = image;
        this.prix = prix;
    }

    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }

    public String getImage(){
        return image;
    }
    public void setImage(String image){
        this.image=image;
    }

    public Double getPrix(){
        return prix;
    }
    public void setPrix(Double prix){
        this.prix=prix;
    }
}