import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.DisplayMetrics
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myView = MyView(this)
        setContentView(myView)
    }

    internal inner class MyView(context: Context) : View(context) {
        private val paint = Paint()
        private val path = Path()
        /*
        private val strokeW1 = 20f
        private val strokeW2 = 40f

         */
        private val dp: Float

        init {
            // スクリーンサイズからdipのようなものを作る
            val metrics = DisplayMetrics()
            windowManager.defaultDisplay.getMetrics(metrics)

            dp = resources.displayMetrics.density
            Log.d("debug", "fdp=$dp")
        }

        override fun onDraw(canvas: Canvas) {
            // 背景色の設定　今の状態だと#ff00007d
            canvas.drawColor(Color.argb(255, 0, 0, 125))

            // カンバスの中心を求める
            val xc = (width / 2).toFloat()
            val yc = (height / 2).toFloat()
            /*
            // 円を生成１
            paint.color = Color.argb(255, 125, 125, 255)
            paint.strokeWidth = strokeW1.toFloat()
            paint.isAntiAlias = true
            paint.style = Paint.Style.STROKE
            // (x1,y1,r,paint) 中心x1座標, 中心y1座標, r半径
            canvas.drawCircle(xc - 15 * dp, yc - 55 * dp, xc / 2, paint)
            
            
            // 円を生成２
            paint.color = Color.YELLOW
            paint.strokeWidth = strokeW2
            paint.isAntiAlias = true
            paint.style = Paint.Style.STROKE
            // (x,y,r,paint) x座標, y座標, r半径
            canvas.drawCircle(220 * dp, 130 * dp, 40 * dp, paint)

            // 四角形を生成
            paint.color = Color.argb(255, 255, 0, 255)
            paint.style = Paint.Style.STROKE
            // (x1,y1,x2,y2,paint) 左上の座標(x1,y1), 右下の座標(x2,y2)
            canvas.drawRect(xc - 30 * dp, yc - 50 * dp,
                    xc + 120 * dp, yc + 100 * dp, paint)

            // 線を生成
            paint.strokeWidth = strokeW1
            paint.color = Color.argb(255, 0, 255, 0)
            // (x1,y1,x2,y2,paint) 始点の座標(x1,y1), 終点の座標(x2,y2)
            canvas.drawLine(xc + 20 * dp, yc - 30 * dp, xc - 70 * dp, yc + 70 * dp, paint)

            // 三角形を生成
            val tx1 = 230 * dp
            val ty1 = 370 * dp
            val tx2 = 100 * dp
            val ty2 = 500 * dp
            val tx3 = 350 * dp
            val ty3 = 500 * dp

            paint.strokeWidth = 10f
            paint.color = Color.WHITE
            path.moveTo(tx1, ty1)
            path.lineTo(tx2, ty2)
            path.lineTo(tx3, ty3)
            path.lineTo(tx1, ty1)
            canvas.drawPath(path, paint)

           　


             */

        }



    }
}
