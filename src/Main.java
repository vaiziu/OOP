import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Book knyga = new Book ();
        knyga.setTitle("Nesbo");
        knyga.setPages(600);
        knyga.setReleaseYear(1990);
//        System.out.println(knyga.getTitle());
//        System.out.println(knyga.getPages());
//        System.out.println(knyga.getReleaseYear());

        Book knyga1 =new Book();
        knyga1.setTitle("Lietuvos istorija");
        knyga1.setPages(650);
        knyga1.setReleaseYear(1998);
//        System.out.println(knyga1.getTitle());
//        System.out.println(knyga1.getPages());


        Book knyga2 = new Book();
        knyga2.setTitle("20.000 myliu po vandeniu");
        knyga2.setTitle("20k loves underwater");
        knyga2.setPages(350);
        knyga2.setReleaseYear(1998);

Book newknyga = new Book ("pepe",0,0);
Book newknyga1 = new Book("ilgakojine",12,54);
Book newknyga2 = new Book("ai zodziu", 25,2024);

//        System.out.println(newknyga);
//        System.out.println(newknyga1);
//        System.out.println(newknyga2);


        ArrayList<Book> books = new ArrayList<>();
        books.add(knyga);
        books.add(knyga1);
        books.add(knyga2);
        books.add(newknyga);
        books.add(newknyga1);
        books.add(newknyga2);
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle()+  " " + books.get(i).getPages()+" " +  books.get(i).getReleaseYear());
        }

//        System.out.println(knyga.get(0));
//        System.out.println(knyga1.get(1));
//        System.out.println(knyga2.get(2));

// PLANTS PLANTS

        Plant plant = new Plant ();

        plant.setName("Klevas");
        plant.setOneYear(true);
        plant.setMainland("Lietuva");
        plant.setHeight(12.0);






    }


}