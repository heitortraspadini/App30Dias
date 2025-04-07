
package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.titulo1, R.string.texto1, R.drawable.img1),
            Affirmation(R.string.titulo2, R.string.texto2, R.drawable.img2),
            Affirmation(R.string.titulo3, R.string.texto3, R.drawable.img3),
            Affirmation(R.string.titulo4, R.string.texto4, R.drawable.img4),
            Affirmation(R.string.titulo5, R.string.texto5, R.drawable.img5),
            Affirmation(R.string.titulo6, R.string.texto6, R.drawable.img6),
            Affirmation(R.string.titulo7, R.string.texto7, R.drawable.img7),
            Affirmation(R.string.titulo8, R.string.texto8, R.drawable.img8),
            Affirmation(R.string.titulo9, R.string.texto9, R.drawable.img9),
            Affirmation(R.string.titulo10, R.string.texto10, R.drawable.img10))
    }
}
