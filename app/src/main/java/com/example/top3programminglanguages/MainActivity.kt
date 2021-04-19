package com.example.top3programminglanguages

import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * <h1>Top 3 Programming Languages</h1>
 * 3 programming language and their description,
 * with next button changes the language and its description
 * with restart button the first language is
 * @version 1.0
 * @since 2014-04-13
 */


class MainActivity : AppCompatActivity() {


    //initialize all components
    private lateinit var nextButton: Button
    private lateinit var restartButton: Button
    private lateinit var language_textV: TextView
    private lateinit var language_description: TextView
    private lateinit var body: LinearLayout


    private val pLanguages = listOf(   //languages
            PLanguage(R.string.Swift),
            PLanguage(R.string.Sql),
            PLanguage(R.string.Kotlin)
    )

    private val pLanguagesDesc = listOf(     //descriptions
            PLanguage(R.string.Swift_description),
            PLanguage(R.string.Sql_description),
            PLanguage(R.string.Kotlin_description)
    )


    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
        nextButton = findViewById(R.id.button_next)
        restartButton = findViewById(R.id.button_restart)
        language_textV = findViewById(R.id.language_textView)
        language_description = findViewById(R.id.language_description)
        body = findViewById(R.id.body)

        language_textV.setTextColor(Color.BLACK)
        language_textV.setTextSize(TypedValue.COMPLEX_UNIT_SP,36.toFloat())
        language_description.setTextColor(Color.BLACK)

        nextButton.setBackgroundColor(Color.BLACK)
        nextButton.setTextColor(Color.BLACK)
        restartButton.setBackgroundColor(Color.BLACK)
        restartButton.setTextColor(Color.BLACK)
        body.setBackgroundColor(Color.parseColor("#dbffab"))



        nextButton.setOnClickListener{
            currentIndex = (currentIndex + 1) % pLanguages.size

            when (currentIndex) {

                // second programming language page; sql
                1 -> {
                    body.setBackgroundColor(Color.parseColor("#dbffab"))
                    nextButton.setBackgroundColor(Color.BLACK)
                    nextButton.setTextColor(Color.BLACK)
                    restartButton.setBackgroundColor(Color.BLACK)
                    restartButton.setTextColor(Color.BLACK)

                    language_textV.setTextColor(Color.BLACK)
                    language_description.setTextColor(Color.BLACK)

                }
                // 3. programming language page; kotlin
                2 -> {
                    body.setBackgroundColor(Color.parseColor("#dbffab"))
                    nextButton.setBackgroundColor(Color.parseColor("#dbffab"))
                    nextButton.setTextColor(Color.BLACK)
                    restartButton.setBackgroundColor(Color.parseColor("#dbffab"))
                    restartButton.setTextColor(Color.BLACK)

                    language_textV.setTextColor(Color.BLACK)
                    language_description.setTextColor(Color.BLACK)
                }
                // 1.  programming language page; swift
                else -> {
                    body.setBackgroundColor(Color.parseColor("#dbffab"))
                    nextButton.setBackgroundColor(Color.BLACK)
                    nextButton.setTextColor(Color.BLACK)
                    restartButton.setBackgroundColor(Color.BLACK)
                    restartButton.setTextColor(Color.BLACK)
                    language_textV.setTextColor(Color.BLACK)
                    language_description.setTextColor(Color.BLACK)
                }
            }
            updateDepartment()
        }

        restartButton.setOnClickListener{
            //all defines for changes return to as beginning part.
            currentIndex = 0
            body.setBackgroundColor(Color.parseColor("#dbffab"))
            nextButton.setBackgroundColor(Color.BLACK)
            nextButton.setTextColor(Color.BLACK)
            restartButton.setBackgroundColor(Color.BLACK)
            restartButton.setTextColor(Color.BLACK)

            language_textV.setTextColor(Color.BLACK)
            language_description.setTextColor(Color.BLACK)
            updateDepartment()
        }
        updateDepartment()
    }

    private fun updateDepartment(){
        val pLanguageTextResId = pLanguages[currentIndex].textResId
        val pLanguageDescTextResId = pLanguagesDesc[currentIndex].textResId
        language_textV.setText(pLanguageTextResId)
        language_description.setText(pLanguageDescTextResId)
    }














}