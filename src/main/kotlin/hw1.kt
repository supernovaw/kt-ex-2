fun main() {
	val status =
		"0421 043F 0438 0437 0434 0438 0432 0020 0441 0440 0430 043D 044B 0439 " +
				"0020 0442 0440 0430 043A 0442 043E 0440 002C 0020 0441 044A 04" +
				"51 0431 0443 044E 0020 0438 0437 0020 0440 0430 0448 043A 0438 002E"
	val picUrl =
		"https://sun9-60.userapi.com/impg/Zst0Lkf4Go6Z_gQSndvfo0HIfnSTNe2NrR0hEA/" +
				"Vyv1JnApndU.jpg?size=464x310&quality=96&sign=e29485e8b376e904a6034f607af600ee"
	val dude = Profile(312881127L, "supernovaw", "Dima", "Sigida", status, picUrl)
	println(dude.fullName)
}

class Profile(
	val id: Long,
	val username: String,
	val firstName: String,
	val lastName: String,
	val status: String,
	val profilePicture: String
) {
	var fullName = ""; get() = "$firstName $lastName"
}