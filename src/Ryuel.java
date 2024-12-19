class Artwork {
    String title;
    String medium;

    public Artwork(String title, String medium) {
        this.title = title;
        this.medium = medium;
    }

    public void displayDetails() {
        System.out.println("Artwork Title: " + title);
        System.out.println("Medium: " + medium);
    }
}

class Artist {
    String name;
    String specialization;

    public Artist(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void displayDetails() {
        System.out.println("Artist Name: " + name);
        System.out.println("Specialization: " + specialization);
    }
}

class Gallery {
    String name;
    String location;

    public Gallery(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void displayDetails() {
        System.out.println("Gallery Name: " + name);
        System.out.println("Location: " + location);
    }
}

public class Ryuel {
    public static void main(String[] args) {
        Artwork artwork1 = new Artwork("Atameken", "Oil on Canvas");
        Artwork artwork2 = new Artwork("Tangbaly Taz", "Oil on Canvas");

        Artist artist1 = new Artist("Shokan Ualihanov", "Kazakh National Artist");
        Artist artist2 = new Artist("Abylkhan Kasteev", "Kazakh National Artist");

        Gallery gallery1 = new Gallery("Kazakh National Museum", "Almaty");
        Gallery gallery2 = new Gallery("State Central Museum", "Astana");

        System.out.println("Artworks:");
        artwork1.displayDetails();
        System.out.println();
        artwork2.displayDetails();

        System.out.println("\nArtists:");
        artist1.displayDetails();
        System.out.println();
        artist2.displayDetails();

        System.out.println("\nGalleries:");
        gallery1.displayDetails();
        System.out.println();
        gallery2.displayDetails();
    }
}

