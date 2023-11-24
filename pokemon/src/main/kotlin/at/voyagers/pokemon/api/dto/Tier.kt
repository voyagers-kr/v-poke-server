package at.voyagers.pokemon.api.dto

enum class Tier(
    val krDisplayName: String,
) {
    BABY("평범한"), LEGENDARY("전설적인"), MYTHICAL("신화적인");
    companion object {
        fun of(
            baby: Boolean,
            legendary: Boolean,
            mythical: Boolean,
        ): Tier {
            if (mythical) return MYTHICAL
            if (legendary) return LEGENDARY
            return BABY
        }
    }
}