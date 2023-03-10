package com.suhun.guessnumber

import android.content.res.Resources
import java.util.Random

class SecretNumber{
    var randomNumber:Int = Random().nextInt(100) + 1
    var count:Int = 0

    fun verifyUserInput(r:Resources, num:Int):String{
        count++
        if(randomNumber > num){
            return r.getString(R.string.bigger)
        }else if(randomNumber < num){
            return r.getString(R.string.smaller)
        }else{
            return r.getString(R.string.you_got_it)
        }
    }
}