
package heronarts.lx.headless;
import heronarts.lx.LX;
import heronarts.lx.LXPattern;
import heronarts.lx.model.LXPoint;
import heronarts.lx.modulator.LXModulator;
import heronarts.lx.modulator.SawLFO;
import heronarts.lx.modulator.SinLFO;
import heronarts.lx.parameter.CompoundParameter;
import heronarts.lx.color.LXColor;

import java.time.*; 
public class CloudsPattern extends LXPattern {
 

  public final CompoundParameter speed = new CompoundParameter("speed", 50, 1, 500)
    .setDescription("Speed of the clouds");

  public final CompoundParameter noisiness = new CompoundParameter("noisiness", 500, 5, 1000)
    .setDescription("Noisiness of the background");

  public final CompoundParameter saturation_one = new CompoundParameter("saturation_one", 0.5, 0.0, 1.0)
    .setDescription("saturation_one");

  public final CompoundParameter saturation_two = new CompoundParameter("saturation_two", 100, 0, 100)
    .setDescription("saturation_two");

  public final CompoundParameter zoom = new CompoundParameter("zoom", 10, 1, 100)
    .setDescription("Look into the clouds");


  public CloudsPattern(LX lx) {
    super(lx);
    //addParameter("axis", this.axis);
    //addParameter("pos", this.pos);
    addParameter("speed", this.speed);
    addParameter("noisiness", this.noisiness);
    addParameter("saturation_one", this.saturation_one);
    addParameter("saturation_two", this.saturation_two);
    addParameter("zoom", this.zoom);
  }
  static public double noise(double x, double y, double z) {
      int X = (int)Math.floor(x) & 255,                  // FIND UNIT CUBE THAT
          Y = (int)Math.floor(y) & 255,                  // CONTAINS POINT.
          Z = (int)Math.floor(z) & 255;
      x -= Math.floor(x);                                // FIND RELATIVE X,Y,Z
      y -= Math.floor(y);                                // OF POINT IN CUBE.
      z -= Math.floor(z);
      double u = fade(x),                                // COMPUTE FADE CURVES
             v = fade(y),                                // FOR EACH OF X,Y,Z.
             w = fade(z);
      int A = p[X  ]+Y, AA = p[A]+Z, AB = p[A+1]+Z,      // HASH COORDINATES OF
          B = p[X+1]+Y, BA = p[B]+Z, BB = p[B+1]+Z;      // THE 8 CUBE CORNERS,
 
      return lerp(w, lerp(v, lerp(u, grad(p[AA  ], x  , y  , z   ),  // AND ADD
                                     grad(p[BA  ], x-1, y  , z   )), // BLENDED
                             lerp(u, grad(p[AB  ], x  , y-1, z   ),  // RESULTS
                                     grad(p[BB  ], x-1, y-1, z   ))),// FROM  8
                     lerp(v, lerp(u, grad(p[AA+1], x  , y  , z-1 ),  // CORNERS
                                     grad(p[BA+1], x-1, y  , z-1 )), // OF CUBE
                             lerp(u, grad(p[AB+1], x  , y-1, z-1 ),
                                     grad(p[BB+1], x-1, y-1, z-1 ))));
   }
  public void run(double deltaMs) {
   
    float speed = this.speed.getValuef() / 1000000;
    float noisiness = this.noisiness.getValuef();
    float saturation_one = this.saturation_one.getValuef();
    float saturation_two = this.saturation_two.getValuef();
    float zoom = this.zoom.getValuef() / 1000;
    long millis = System.currentTimeMillis();
    float hue = (noise(millis * speed) * 200) % 360;
    float dx = millis * speed;

    for (LXPoint p : model.points) {
      float n = noisiness * (noise(dx + p.x * zoom, p.y * zoom, p.z * zoom) * saturation_one);

      colors[p.index] = LXColor.hsb(hue, saturation_two, n); 
    }
  }
}