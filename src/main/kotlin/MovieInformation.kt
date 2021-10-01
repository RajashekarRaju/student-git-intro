object MovieData {

    fun movieList(): ArrayList<Movie> = arrayListOf(
        Movie("Salt", 9.0),
        Movie("Changelings", 8.2),
        Movie("Kate", 7.0),
    )
}

fun main() {

    val movieList: ArrayList<Movie> = MovieData.movieList()

    movieList.add(Movie("Zodiac", 10.0))
    movieList.add(Movie("The Raid", 9.9))

    movieList.forEach { movie ->
        val title = movie.titleOfTheMovie
        println("Name of the movie is $title rated as ${movie.rating}")
    }
}