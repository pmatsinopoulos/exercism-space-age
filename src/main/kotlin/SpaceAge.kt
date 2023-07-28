private const val NUMBER_OF_SECONDS_PER_YEAR_IN_EARTH = 31_557_600

private val NUMBER_OF_EARTH_YEARS = mapOf(
    "JUPITER" to 11.862615,
    "MARS" to 1.8808158,
    "MERCURY" to 0.2408467,
    "NEPTUNE" to 164.79132,
    "SATURN" to 29.447498,
    "URANUS" to 84.016846,
    "VENUS" to 0.61519726
)

class SpaceAge(private val earthAgeInSeconds: Int) {
    fun onEarth(): Double = earthAgeInSeconds.div(NUMBER_OF_SECONDS_PER_YEAR_IN_EARTH.toDouble())
    fun onMercury(): Double = onEarth().div(NUMBER_OF_EARTH_YEARS.getValue("MERCURY"))
    fun onVenus(): Double = onEarth().div(NUMBER_OF_EARTH_YEARS.getValue("VENUS"))
    fun onMars(): Double = onEarth().div(NUMBER_OF_EARTH_YEARS.getValue("MARS"))
    fun onJupiter(): Double = onEarth().div(NUMBER_OF_EARTH_YEARS.getValue("JUPITER"))
    fun onSaturn(): Double = onEarth().div(NUMBER_OF_EARTH_YEARS.getValue("SATURN"))
    fun onUranus(): Double = onEarth().div(NUMBER_OF_EARTH_YEARS.getValue("URANUS"))
    fun onNeptune(): Double = onEarth().div(NUMBER_OF_EARTH_YEARS.getValue("NEPTUNE"))
}
