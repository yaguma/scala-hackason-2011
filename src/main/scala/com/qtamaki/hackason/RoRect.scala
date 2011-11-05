package com.qtamaki.hackason

import processing.core.PApplet
import processing.core.PConstants

class RoRect extends PApplet {
    private val angle = 30
    private val box = 100
    private var i = 0

  override def setup() {
    size(400,400)
    colorMode(PConstants.RGB, 255)
    background(255,255,255)
    noStroke()
    frameRate(20)
    
  }

  override def draw() {
      translate(200,200)
      rotate(PApplet.radians(angle*i))
      fill(0,i*20,0)
      rect(0,0,box,box)
      
      i += 1
      if(i > 11) i = 0
  }
}