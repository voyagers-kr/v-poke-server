package at.voyagers.pokemon.client

class ErrorResponse(val code: Int, message: String) : Throwable("($code) $message")
