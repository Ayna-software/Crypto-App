package com.<your>.<application>
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
class Detail : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_detail)
		Glide.with(this).load("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/649dd75d-9b4b-4e27-be88-bb6d42554b3b").into(findViewById(R.id.rx6uemeajezq))
		Glide.with(this).load("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/092fedb8-3515-457a-81cf-848cfb62fee1").into(findViewById(R.id.ra46wb3seyrl))
		Glide.with(this).load("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/1aab21e1-0cbd-47d9-8d35-98155f0b7215").into(findViewById(R.id.ro5tva50vvoq))
		Glide.with(this).load("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/a24b91ce-a19f-4d19-a137-0f32b0c4f740").into(findViewById(R.id.r1fax6k0h4zy))
		Glide.with(this).load("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/0878c8e1-06f8-460a-95e5-6b11125ad426").into(findViewById(R.id.riz8s2mneafs))
		Glide.with(this).load("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/c3108ae6-8674-4c6d-9f49-acf8c079a189").into(findViewById(R.id.r86b7hdxikr9))
		Glide.with(this).load("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/b625b55f-901e-49b1-9ff9-a859f28394e8").into(findViewById(R.id.rjme3w8n4toc))
		Glide.with(this).load("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/866b3c3a-55ba-4509-90d1-233ed04a3d60").into(findViewById(R.id.rdrfthpvhkhn))
		Glide.with(this).load("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/d3eeae46-440d-4eef-8d70-df0483428f61").into(findViewById(R.id.rddf5nccxf4p))
		Glide.with(this).load("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/db3605e0-831e-4a57-a443-d0d511b9c61f").into(findViewById(R.id.r43yb3iyg44c))
		Glide.with(this).load("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/7c6dd09b-6b78-4df0-85d0-53189caaa61e").into(findViewById(R.id.rm5tpv1pq40d))
		Glide.with(this).load("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/c389c24e-4426-4f90-89cd-f316e7e7ac11").into(findViewById(R.id.rhoze6sdmw47))
		Glide.with(this).load("https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/2fa1a384-991a-4fde-aafc-ff258f68ed14").into(findViewById(R.id.ruy3u046qz6h))
		val button1: View = findViewById(R.id.rbbwmjt5cyxc)
		button1.setOnClickListener {
			println("Pressed")
		}
		val button2: View = findViewById(R.id.ron76uzcmx3)
		button2.setOnClickListener {
			println("Pressed")
		}
		val button3: View = findViewById(R.id.r4cerijjlw4c)
		button3.setOnClickListener {
			println("Pressed")
		}
		val button4: View = findViewById(R.id.r8k7fupap11q)
		button4.setOnClickListener {
			println("Pressed")
		}
	}
}