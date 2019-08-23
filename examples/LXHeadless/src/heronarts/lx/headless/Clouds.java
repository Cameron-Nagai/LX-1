
package heronarts.lx.headless;

import heronarts.lx.LX;
import heronarts.lx.LXPattern;
import heronarts.lx.model.LXPoint;
import heronarts.lx.color.LXColor;
import heronarts.lx.modulator.LXModulator;
import heronarts.lx.modulator.SawLFO;
import heronarts.lx.modulator.SinLFO;
import heronarts.lx.parameter.CompoundParameter;

public class Clouds extends LXPattern {
    
  public final CompoundParameter speed = new CompoundParameter("speed", 469, 1, 500)
    .setDescription("Speed of the clouds");

  public final CompoundParameter noisiness = new CompoundParameter("noisiness", 500, 5, 1000)
    .setDescription("Noisiness of the background");

  public final CompoundParameter saturation_one = new CompoundParameter("saturation_one", 0.5, 0.0, 1.0)
    .setDescription("saturation_one");

  public final CompoundParameter saturation_two = new CompoundParameter("saturation_two", 48, 0, 100)
    .setDescription("saturation_two");

  public final CompoundParameter zoom = new CompoundParameter("zoom", 100, 1, 100)
    .setDescription("Look into the clouds");

  private final NoiseHelper noiseHelper = new NoiseHelper();

  private final long startTime;

  public Clouds(LX lx) {
    super(lx);
//    System.out.println("clouds init");

    startTime = System.currentTimeMillis();

    //addParameter("axis", this.axis);
    //addParameter("pos", this.pos);
    addParameter("speed", this.speed);
    addParameter("noisiness", this.noisiness);
    addParameter("saturation_one", this.saturation_one);
    addParameter("saturation_two", this.saturation_two);
    addParameter("zoom", this.zoom);
  }
  
  public void run(double deltaMs) {
    // System.out.println("numpoints " + model.points.length);
    float speed = this.speed.getValuef() / 1000000;
    float noisiness = this.noisiness.getValuef();
    float saturation_one = this.saturation_one.getValuef();
    float saturation_two = this.saturation_two.getValuef();
    float zoom = this.zoom.getValuef() / 1000;

    long millis = System.currentTimeMillis() - startTime;
    // NOTE(hike): using "noise" requires a PApplet instance, which headless LX doesn't have; if you need noise you can copy it from NoiseHelper in SLStudio or find an open source version online (google for "improved perlin noise java")
    // also gradle builds work now, integrated with IntelliJ
    float hue = (noiseHelper.noise(millis * speed) * 200) % 360;
    float dx = millis * speed;

    for (LXPoint p : model.points) {
      float n = noisiness * (noiseHelper.noise(dx + p.x * zoom, p.y * zoom, p.z * zoom) * saturation_one);

      colors[p.index] = LXColor.hsb(hue, saturation_two, n);
    }
  }
}
