package graal.demo.micronaut.app

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("graal.demo.micronaut.app")
		.start()
}

