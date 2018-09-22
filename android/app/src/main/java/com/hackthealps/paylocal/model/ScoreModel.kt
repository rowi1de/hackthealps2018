package com.hackthealps.paylocal.model

data class ScoreModel( val scoreValue: ScoreValue,  val scoreCriteria: String) : Comparable<ScoreModel> {

    override fun compareTo(o: ScoreModel): Int {
        return o.scoreValue.ordinal - this.scoreValue.ordinal
    }
}
