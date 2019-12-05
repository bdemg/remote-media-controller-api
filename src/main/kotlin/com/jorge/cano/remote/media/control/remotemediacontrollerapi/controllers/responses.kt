package com.jorge.cano.remote.media.control.remotemediacontrollerapi.controllers

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

/**
 * Created by Jorge A. Cano on 05/10/2019.
 */

object Responses {

    val defaultSuccess = ResponseEntity.ok("""{"status": "success"}""")
    val invalidStopType = ResponseEntity.status(HttpStatus.BAD_REQUEST).body("""{"errorMessage": "Invalid stop type. Allowed types are: [native, spacebar]"}""")
}