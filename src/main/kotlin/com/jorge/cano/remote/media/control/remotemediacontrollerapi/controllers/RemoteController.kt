package com.jorge.cano.remote.media.control.remotemediacontrollerapi.controllers

import commands.MediaKeys
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

/**
 * Created by Jorge A. Cano on 05/10/2019.
 */

@Controller
class RemoteController {

    val mediaKeys = MediaKeys()

    @GetMapping("/playPause/{type}")
    fun playPause(@PathVariable("type") type: String?): ResponseEntity<String> {

        when (type) {
            "native" -> mediaKeys.songPlayPause()
            "spacebar" -> mediaKeys.pressSpacebar()
            else -> return Responses.invalidStopType
        }
        return Responses.defaultSuccess
    }

    @GetMapping("/nextTrack")
    fun nextTrack(): ResponseEntity<String> {

        mediaKeys.songNext()
        return Responses.defaultSuccess
    }

    @GetMapping("/previousTrack")
    fun previousTrack(): ResponseEntity<String> {

        mediaKeys.songPrevious()
        return Responses.defaultSuccess
    }

    @GetMapping("/mediaForward")
    fun mediaForward(): ResponseEntity<String> {

        mediaKeys.mediaForward()
        return Responses.defaultSuccess
    }

    @GetMapping("/mediaBackward")
    fun mediaBackward(): ResponseEntity<String> {

        mediaKeys.mediaBackward()
        return Responses.defaultSuccess
    }

    @GetMapping("/mute")
    fun mute(): ResponseEntity<String> {

        mediaKeys.volumeMute()
        return Responses.defaultSuccess
    }

    @GetMapping("/volumeUp")
    fun volumeUp(): ResponseEntity<String> {

        mediaKeys.volumeUp()
        return Responses.defaultSuccess
    }

    @GetMapping("/volumeDown")
    fun volumeDown(): ResponseEntity<String> {

        mediaKeys.volumeDown()
        return Responses.defaultSuccess
    }
}