package com.example.courseproject

data class Meal (
    val id: Long,
    val mealName: String,
    val mealCookingTime: String,
    val mealImageUrl: String
) {
    companion object {
        fun getMockMeals() = listOf(
            Meal(
                0,
                "Mac'n'Cheese",
                "30 minutes",
                "https://www.simplyrecipes.com/thmb/PX86gfsERjvjcnSqAvzAp32LoaM=/1800x1200/filters:fill(auto,1)/__opt__aboutcom__coeus__resources__content_migration__simply_recipes__uploads__2011__04__civil-war-mac-cheese-horiz-a-1800-ae31efb272d94a7bbb623b3be0feda88.jpg"
            ),

            Meal(
                1,
                "Pizza",
                "2 hours",
                "https://kartinkin.net/uploads/posts/2021-03/thumbs/1617158313_18-p-pitstsa-italyano-krasivo-24.jpg"
            ),

            Meal(
                2,
                "Seafood Pasta",
                "20 minutes",
                "https://avatars.mds.yandex.net/i?id=2e92f445a6e16b7d6be675457d4d8335-5858006-images-thumbs&n=13"
            ),

            Meal(
                3,
                "Sweet Pierogi",
                "1 hour",
                "http://www.howsweeteats.com/wp-content/uploads/2020/02/sweet-potato-pierogies-9.jpg"
            )
        )
    }
}
