package dahlke.br.catfact

import retrofit2.http.GET

interface CatFactApi {
    @GET("fact")
    suspend fun getCatFact() : CatFact
}