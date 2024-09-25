package kr.ac.kumoh.s20210298.w24w0401.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController {
    val title = listOf(
        "supernova",
        "talking",
        "chemical"
    )

    @GetMapping("/song/list")
    fun getSongList() = title
}