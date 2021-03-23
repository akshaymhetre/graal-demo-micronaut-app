package graal.demo.micronaut.app

import java.util.*
import javax.inject.Singleton;

@Singleton
class ConferenceService {
    fun randomConf(): Conference {
        return CONFERENCES[Random().nextInt(CONFERENCES.size)]
    }

    companion object {
        private val CONFERENCES = listOf(
                Conference("Greach"),
                Conference("GR8Conf EU"),
                Conference("Micronaut Summit"),
                Conference("Devoxx Belgium"),
                Conference("Oracle Code One"),
                Conference("CommitConf"),
                Conference("Codemotion Madrid")
        )
    }
}