package kr.ac.kumoh.s20210298.w24w0401.service

import kr.ac.kumoh.s20210298.w24w0401.model.Song
import kr.ac.kumoh.s20210298.w24w0401.repository.SongRepository
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class SongService(val repository: SongRepository) {
    fun getAllSongs(): List<Song> {
        return repository.fetchSong()
    }

    fun getRandomSong(): Song {
        return repository.getSong(Random.nextInt(repository.songs.size))
    }
}