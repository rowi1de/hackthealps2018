package com.hackthealps.paylocal.model

data class ScoreModel( val scoreValue: ScoreValue,  val scoreCriteria: List<String>) : Comparable<ScoreModel> {

    override fun compareTo(o: ScoreModel): Int {
        return this.scoreValue!!.ordinal - o.scoreValue!!.ordinal
    }
}
