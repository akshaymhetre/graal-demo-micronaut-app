package graal.demo.micronaut.app

import io.micronaut.core.annotation.Introspected;

@Introspected
data class Conference(val name: String)