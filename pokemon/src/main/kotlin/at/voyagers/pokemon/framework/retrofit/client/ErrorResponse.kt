package at.voyagers.pokemon.framework.retrofit.client

class ErrorResponse(val code: Int, message: String) : Throwable("($code) $message")
