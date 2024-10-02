package kr.ac.kumoh.s20210298.w24w0401.repository

import kr.ac.kumoh.s20210298.w24w0401.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    val songs = listOf(
        Song(1, "supernova", "aespa"),
        Song(2,  "talking","Bruno"),
        Song(3,  "Chemi","Post"),
    )

    fun fetchSong() = songs;
    fun getSong(index: Int) = songs[index]
}