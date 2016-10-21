package pt.ipleiria.estg.booksapp.models;


import java.util.ArrayList;
import java.util.List;

import pt.ipleiria.estg.booksapp.R;

public class ExampleData {

    private static List<Book> books;

    public static List<Book> getBooks() {
        if (books == null) {

            books = new ArrayList<>();
            books.add(new Book("Among Thieves", "Tales of the Kin, #1", "Douglas Hulick", "2011", "9780330536202", "Drothe is a Nose, an informant who finds and takes care of trouble inside the criminal organization he's a part of. He also smuggles imperial relics on the side. When his boss sends him to Ten Ways to track down who's been leaning on his organization's people, Drothe discovers hints of a much bigger mystery.", 0.0f, R.drawable.amongthieves));
            books.add(new Book("Children of Dune", "Dune, #3", "Frank Herbert", "1987", "9780441104024", "The desert planet of Arrakis has begun to grow green and lush. The life-giving spice is abundant. The nine-year-old royal twins, possesing their father's supernatural powers, are being groomed as Messiahs.", 0.0f, R.drawable.childrenofdune));
            books.add(new Book("A Darkness At Sethanon", "The Riftwar Saga, #4", "Raymond E. Feist", "2007", "9780007229437", "An evil wind blows through Midkemia. Dark legions have risen up to crush the Kingdom of the Isles and enslave it to dire magics. The final battle between Order and Chaos is about to begin in the ruins of the city called Sethanon.", 0.0f, R.drawable.darknessatsethanon));
            books.add(new Book("Dune", "Dune, #1", "Frank Herbert", "2005", "9780441013593", "Set on the desert planet Arrakis, Dune is the story of the boy Paul Atreides, who would become the mysterious man known as Muad'Dib. He would avenge the traitorous plot against his noble family--and would bring to fruition humankind's most ancient and unattainable dream.A stunning blend of adventure and mysticism, environmentalism and politics.", 0.0f, R.drawable.dune));
            books.add(new Book("Ender's Game", "The Ender Quintet, #1", "Orson Scott Card", "2013", "9780765370624", "Andrew \"Ender\" Wiggin thinks he is playing computer simulated war games; he is, in fact, engaged in something far more desperate. Ender may be the military genius Earth desperately needs in a war against an alien enemy seeking to destroy all human life. The only way to find out is to throw Ender into ever harsher training, to chip away and find the diamond inside, or destroy him utterly. Ender Wiggin is six years old when it begins. He will grow up fast.", 0.0f, R.drawable.endersgame));
            books.add(new Book("Magician", "The Riftwar Saga, #1 e #2", "Raymond E. Feist", "2009", "9780586217832", "At Crydee, a frontier outpost in the tranquil Kingdom of the Isles, an orphan boy, Pug, is apprenticed to a master magician – and the destinies of two worlds are changed forever.", 0.0f, R.drawable.magician));
            books.add(new Book("Silverthorn", "The Riftwar Saga, #3", "Raymond E. Feist", "2008", "9780007229420", "For nearly a year peace has reigned in the Kingdom of the Isles, but mischief is stirring again in the city of Krondor and new challenges await Prince Arutha when Jimmy the Hand - the youngest thief in the Guild of Mockers - stumbles upon a sinister Nighthawk poised to assassinate him.", 0.0f, R.drawable.silverthorn));
            books.add(new Book("Starbound", "Lightship Chronicles, #2", "Dave Bara", "2016", "9780091956424", "The Lightship H.M.S. Impulse is gone, sacrificed in a battle against First Empire ships. And though the fragile galactic alliance has survived the unexpected invasion, the Union forces might not prove victorious against a full onslaught by this legendary enemy", 0.0f, R.drawable.starbound));
            books.add(new Book("Tales of Heresy", "The Horus Heresy, #10", "Dan Abnett", "2009", "9781844166824", "When Horus the Warmaster rebelled against the Emperor, the ensuing civil war nearly destroyed the Imperium. War raged across galaxy, pitting Astartes against their battle-brothers in a struggle where death was the only victor.", 0.0f, R.drawable.talesofheresy));
            books.add(new Book("The Beating of His Wings", "The Left Hand of God #3", "Paul Hoffman", "2013", "9780718155223", "Since discovering that his brutal military training has been for one purpose—to destroy God’s greatest mistake, mankind itself—Cale has been hunted by the very man who made him into the Angel of Death: Pope Redeemer Bosco.", 0.0f, R.drawable.thebeatingofhiswings));
            books.add(new Book("The Last Four Things", "The Left Hand of God, #2", "Paul Hoffman", "2011", "9780718155216", "To the warrior-monks known as the Redeemers, who rule over massive armies of child slaves, \"the last four things\" represent the culmination of a faithful life. Death. Judgement. Heaven.", 0.0f, R.drawable.thelastfourthings));
            books.add(new Book("The Left Hand of God", "The Left Hand of God #1", "Paul Hoffman", "2010", "9780718155186", "The Sanctuary of the Redeemers is a vast and desolate place—a place without joy or hope. Most of its occupants were taken there as boys and for years have endured the brutal regime of the Lord Redeemers whose cruelty and violence have one singular purpose—to serve in the name of the One True Faith.", 0.0f, R.drawable.thelefthandofgod));
        }

        return books;
    }

    public static Integer[] getAllCovers() {
        Integer covers[] = new Integer[getBooks().size()];

        int i = 0;
        for (Book book : getBooks()) {
            covers[i++] = book.getCover();
        }

        return covers;
    }
}
