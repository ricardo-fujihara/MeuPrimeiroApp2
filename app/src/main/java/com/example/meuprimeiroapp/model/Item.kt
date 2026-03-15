package com.example.meuprimeiroapp.model

/**
 * Represents a simple item with a unique identifier.
 *
 * @property id The unique identifier for the item.
 */
data class Item (
    val id: String,
    val value: ItemValue
)

/**
 * Detailed information about an item, including personal details and location.
 *
 * @property id The unique identifier for the item.
 * @property name The first name of the person.
 * @property surname The surname of the person.
 * @property profession The profession of the person.
 * @property imageUrl The URL for the person's image.
 * @property age The age of the person.
 * @property location The geographic location associated with the person.
 */
data class ItemValue(
    val id: String,
    val name: String,
    val surname: String,
    val profession: String,
    val imageUrl: String,
    val age: Int,
    val location: ItemLocation?
){
    val fullName: String
        get() = "$name $surname"
}

/**
 * Geographic location details.
 *
 * @property name The name of the location.
 * @property latitude The latitude coordinate of the location.
 * @property longitude The longitude coordinate of the location.
 */
data class ItemLocation(
    val name: String,
    val latitude: Double,
    val longitude: Double
)
