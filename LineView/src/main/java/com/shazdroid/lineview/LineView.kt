package com.shazdroid.lineview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class LineView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {
    private var lineGap: Float = 10f
    private var linePaint: Paint? = null
    private var lineHeightGap: Int = 10

    init {
        linePaint = Paint()
        linePaint?.color = Color.BLACK
        linePaint?.isAntiAlias = true
        linePaint?.strokeWidth = 5f
    }

    override fun onDraw(canvas: Canvas?) {
       for (i in lineHeightGap..height step lineHeightGap){
            canvas?.drawLine(0f, i.toFloat(), width.toFloat(), i.toFloat(), linePaint!!)
        }
    }

    fun setLineHeight(lineHeight: Int) {
        lineHeightGap = lineHeight + 50
        invalidate()
    }

    fun setLineColor(color: Int) {
        linePaint?.color = color // invalidate()
    }

    fun setLineWidth(width: Float) {
        linePaint?.strokeWidth = width
    }
}