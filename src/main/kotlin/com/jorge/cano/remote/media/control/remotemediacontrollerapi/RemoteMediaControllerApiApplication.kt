package com.jorge.cano.remote.media.control.remotemediacontrollerapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RemoteMediaControllerApiApplication{

	companion object {
		@JvmStatic fun main(args: Array<String>) {
			runApplication<RemoteMediaControllerApiApplication>(*args)
		}
	}
}

