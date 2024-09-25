package kr.ac.kumoh.s20210298.w24w0401.repository

import kr.ac.kumoh.s20210298.w24w0401.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    val songs = listOf(
        Song(1, "supernova", "aespa"),
        Song(2, "Bruno", "talking"),
        Song(3, "Post", "Chemi"),
    )

    fun fetchSong() = songs;
}