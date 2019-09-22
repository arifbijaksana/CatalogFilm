package com.arifbm.catalogfilm.data;

import com.arifbm.catalogfilm.R;

import java.util.ArrayList;
import java.util.List;

public class FilmRepository {

    private List<Film> films = new ArrayList<>();
    private static FilmRepository filmRepository;

    private FilmRepository() {}

    public static synchronized FilmRepository getInstance( ) {
        if (filmRepository == null)
            filmRepository = new FilmRepository();
        return filmRepository;
    }

    public List<Film> getFilmData() {
        films.add(new Film(
                "Aquaman",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne. ",
                R.drawable.poster_aquaman,
                2019,
                5));

        films.add(new Film(
                "Avenger Infinity War",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain. ",
                R.drawable.poster_avengerinfinity,
                2018,
                3.5f));

        films.add(new Film(
                "Bird Box ",
                "Five years after an ominous unseen presence drives most of society to suicide, a survivor and her two children make a desperate bid to reach safety.",
                R.drawable.poster_birdbox,
                2018,
                3.5f));

        films.add(new Film(
                "Bohemian Rhapsody",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                R.drawable.poster_bohemian,
                2018,
                5.0f));

        films.add(new Film(
                "Bumblebee",
                "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug. ",
                R.drawable.poster_bumblebee,
                2018,
                4));

        films.add(new Film(
                "Creed II",
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life. ",
                R.drawable.poster_creed,
                2018,
                3f));

        films.add(new Film(
                "Once Upon a Deadpool",
                "A kidnapped Fred Savage is forced to endure Deadpool's PG-13 rendition of Deadpool 2 as a Princess Bride-esque story that's full of magic, wonder & zero F's. ",
                R.drawable.poster_deadpool,
                2018,
                3.5f));

        films.add(new Film(
                "How to Train Your Dragon: The Hidden World",
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind. ",
                R.drawable.poster_dragon,
                2019,
                4.0f));

        films.add(new Film(
                "The Girl in the Spider's Web ",
                "In Stockholm, Sweden, hacker Lisbeth Salander is hired by Frans Balder, a computer engineer, to retrieve a program that he believes it is too dangerous to exist. ",
                R.drawable.poster_thegirl,
                2019,
                4.5f));

        films.add(new Film(
                "Glass ",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                R.drawable.poster_glass,
                2019,
                4.0f));

        films.add(new Film(
                "Hunter Killer ",
                "Captain Glass of the USS Arkansas discovers that a coup d'état is taking place in Russia, so he and his crew join an elite group working on the ground to prevent a war.",
                R.drawable.poster_hunterkiller,
                2018,
                3.0f));

        films.add(new Film(
                "Marry Popiins Return ",
                "In Depression-era London, a now-grown Jane and Michael Banks, along with Michael's three children, are visited by the enigmatic Mary Poppins following a personal loss. Through her unique magical skills, and with the aid of her friend Jack, she helps the family rediscover the joy and wonder missing in their lives.",
                R.drawable.poster_marrypopins,
                2018,
                4.5f));

        films.add(new Film(
                "Mortal Engine ",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                R.drawable.poster_mortalengine,
                2019,
                3.0f));

        films.add(new Film(
                "Preman Pensiun ",
                "After three years, the business of Muslihat (Epi Kusnandar), who has retired as a thug, has a problem. Sales decline. Muslihat also faces new problems when Safira (Safira Maharani), her only daughter, grows up in adolescence and begins to be visited by boys. A bigger problem: frictions between his former subordinates.",
                R.drawable.poster_preman,
                2018,
                5.0f));

        films.add(new Film(
                "Venom ",
                "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.",
                R.drawable.poster_venom,
                2019,
                5.0f));





        return films;
    }



}
