package kr.ac.kumoh.s20210298.w24w0401.controller

import kr.ac.kumoh.s20210298.w24w0401.model.Song
import kr.ac.kumoh.s20210298.w24w0401.service.SongService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController(val service: SongService) {
    /*    val title = listOf(
            "supernova",
            "talking",
            "chemical"
        )*/


    @GetMapping("/song/list")
//    fun getSongList() = title
    fun getSongList(): List<Song> {
        return service.getAllSongs()
    }
}