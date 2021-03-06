package graal.demo.micronaut.app

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/conferences")
class ConferenceController(private val conferenceService: ConferenceService) {
    @Get("/random")
    fun randomConf(): Conference {
        return conferenceService.randomConf()
    }
}