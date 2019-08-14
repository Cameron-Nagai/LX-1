package heronarts.lx.headless;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import heronarts.lx.model.LXPoint;
import heronarts.lx.model.LXModel;
import heronarts.lx.model.LXFixture;
import heronarts.lx.model.StripModel;



public class PianoModel extends LXModel {
 
  public static class BacksideModel extends LXModel{
    private final List<List<LXPoint>> channelPoints;

    public static BacksideModel newModel(){
      List<List<LXPoint>> channelPoints = new ArrayList<List<LXPoint>>();
      List<LXPoint> lastChannelPoints;
      List<LXFixture> strips = new ArrayList<LXFixture>();
      StripModel strip;
   
      channelPoints.add(lastChannelPoints = new ArrayList<LXPoint>());
      strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, 1, 0).setOrigin((19.2f*5f) - 6, 0, 22)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, -1, 0).setOrigin(19.2f*4f, 58, 22)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, 1, 0).setOrigin(19.2f*3f, 0, 22)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, -1, 0).setOrigin(19.2f*2f, 58, 22)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, 1, 0).setOrigin(19.2f, 0, 22)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, -1, 0).setOrigin(0 + 6, 58, 22)));
      lastChannelPoints.addAll(strip.getPoints());

      // strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, 1, 0)));
      // lastChannelPoints.addAll(strip.getPoints());
      // strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, -1, 0).setOrigin(19.2, 58, 22)));
      // lastChannelPoints.addAll(strip.getPoints());
      // strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, 1, 0).setOrigin(19.2*2, 0, 22)));
      // lastChannelPoints.addAll(strip.getPoints());
      // strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, -1, 0).setOrigin(19.2*3, 58, 22)));
      // lastChannelPoints.addAll(strip.getPoints());
      // strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, 1, 0).setOrigin(19.2*4, 0, 22)));
      // lastChannelPoints.addAll(strip.getPoints());
      // strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, -1, 0).setOrigin(19.2*5, 58, 22)));
      // lastChannelPoints.addAll(strip.getPoints());

      channelPoints.add(lastChannelPoints = new ArrayList<LXPoint>());
      strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, -1, 0).setOrigin((19.2f*4)-2f, 58, 22)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, 1, 0).setOrigin((19.2f*3)+2f, 0, 22)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, -1, 0).setOrigin((19.2f*2)-2f, 58, 22)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, 1, 0).setOrigin(19.2f+2f, 0, 22)));
      lastChannelPoints.addAll(strip.getPoints());


      // strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, -1, 0).setOrigin(19.2-2, 58, 22)));
      // lastChannelPoints.addAll(strip.getPoints());
      // strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, 1, 0).setOrigin((19.2*2)-2, 0, 22)));
      // lastChannelPoints.addAll(strip.getPoints());
      // strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, -1, 0).setOrigin((19.2*3)-2, 58, 22)));
      // lastChannelPoints.addAll(strip.getPoints());
      // strips.add(strip = new StripModel(new StripModel.Metrics(58).setSpacing(0, 1, 0).setOrigin((19.2*4)-2, 0, 22)));
      // lastChannelPoints.addAll(strip.getPoints());


      return new BacksideModel(strips.toArray(new LXFixture[0]), channelPoints);

    }

    private BacksideModel(LXFixture[] fixtures, List<List<LXPoint>> channelPoints) {
      super(fixtures);
      this.channelPoints = channelPoints;
    }
    public List<List<LXPoint>> getChannelPoints(){
      return channelPoints;
    }
  }


  public static class LidOutsideEdgeModel extends LXModel{
    private final List<List<LXPoint>> channelPoints;

    public static LidOutsideEdgeModel newModel(){
      List<List<LXPoint>> channelPoints = new ArrayList<List<LXPoint>>();
      List<LXPoint> lastChannelPoints;
      List<LXFixture> strips = new ArrayList<LXFixture>();
      StripModel strip;
      channelPoints.add(lastChannelPoints = new ArrayList<LXPoint>());
      strips.add(strip = new StripModel(new StripModel.Metrics(96).setSpacing(-1, 0, 0).setOrigin(19.2f*5f, 81, 22)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(22).setSpacing(0, 0, -1).setOrigin((19.2f*5f)-96f, 81, 22)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(80).setSpacing(1, 0, 0).setOrigin((19.2f*5f)-96+8f, 81, 0)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(22).setSpacing(0, 0, 1).setOrigin((19.2f*5f), 81, 0)));
      lastChannelPoints.addAll(strip.getPoints());

      return new LidOutsideEdgeModel(strips.toArray(new LXFixture[0]), channelPoints);

    }




    private LidOutsideEdgeModel(LXFixture[] fixtures, List<List<LXPoint>> channelPoints) {
      super(fixtures);
      this.channelPoints = channelPoints;
    }
    public List<List<LXPoint>> getChannelPoints(){
      return channelPoints;
    }
  }


    public static class KeyboardDownlightsModel extends LXModel{

    private static final float keyboardheight = 58f*.5f;
      
    private final List<List<LXPoint>> channelPoints;

    public static KeyboardDownlightsModel newModel(){
      List<List<LXPoint>> channelPoints = new ArrayList<List<LXPoint>>();
      List<LXPoint> lastChannelPoints;
      List<LXFixture> strips = new ArrayList<LXFixture>();
      StripModel strip;

      //keyboard downlights/above knee downlights (both one channel split)
      channelPoints.add(lastChannelPoints = new ArrayList<LXPoint>());
      strips.add(strip = new StripModel(new StripModel.Metrics(78).setSpacing(1, 0, 0).setOrigin((19.2f*5f)-96f+7.5f, keyboardheight, 0)));
      lastChannelPoints.addAll(strip.getPoints());

      strips.add(strip = new StripModel(new StripModel.Metrics(78).setSpacing(1, 0, 0).setOrigin((19.2f*5f)-96f+7.5f, keyboardheight-5, 0)));
     

     //side keys downlight
      channelPoints.add(lastChannelPoints = new ArrayList<LXPoint>());
      strips.add(strip = new StripModel(new StripModel.Metrics(8).setSpacing(0, 0, -1).setOrigin(96/2, keyboardheight, 0)));
      lastChannelPoints.addAll(strip.getPoints());

      strips.add(strip = new StripModel(new StripModel.Metrics(8).setSpacing(0, 0, -1).setOrigin(0, keyboardheight, 0)));
      
      strips.add(strip = new StripModel(new StripModel.Metrics(8).setSpacing(0, 0, -1).setOrigin(96, keyboardheight, 0)));
     
     //side knees downlight
      channelPoints.add(lastChannelPoints = new ArrayList<LXPoint>());
      strips.add(strip = new StripModel(new StripModel.Metrics(17).setSpacing(0, 0, -1).setOrigin(0, keyboardheight-6, 0)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(17).setSpacing(0, 0, -1).setOrigin(96, keyboardheight-6, 0)));
      lastChannelPoints.addAll(strip.getPoints());

      return new KeyboardDownlightsModel(strips.toArray(new LXFixture[0]), channelPoints);

    }




    private KeyboardDownlightsModel(LXFixture[] fixtures, List<List<LXPoint>> channelPoints) {
      super(fixtures);
      this.channelPoints = channelPoints;
    }
    public List<List<LXPoint>> getChannelPoints(){
      return channelPoints;
    }
  }

  public static class HarpLightingModel extends LXModel{

    private static final float keyboardheight = 58f*.5f;
      
    private final List<List<LXPoint>> channelPoints;

    public static HarpLightingModel newModel(){
      List<List<LXPoint>> channelPoints = new ArrayList<List<LXPoint>>();
      List<LXPoint> lastChannelPoints;
      List<LXFixture> strips = new ArrayList<LXFixture>();
      StripModel strip;

      channelPoints.add(lastChannelPoints = new ArrayList<LXPoint>());
      strips.add(strip = new StripModel(new StripModel.Metrics(76).setSpacing(0, 1, 0).setOrigin(96-4, 0, 22)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(87).setSpacing(-1, 0, 0).setOrigin(87f+4.5f, 76, 22)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(76).setSpacing(0, -1, 0).setOrigin(0+4, 76, 22)));
      lastChannelPoints.addAll(strip.getPoints());

      return new HarpLightingModel(strips.toArray(new LXFixture[0]), channelPoints);

    }




    private HarpLightingModel(LXFixture[] fixtures, List<List<LXPoint>> channelPoints) {
      super(fixtures);
      this.channelPoints = channelPoints;
    }
    public List<List<LXPoint>> getChannelPoints(){
      return channelPoints;
    }
  }


  public static class ActionLightingModel extends LXModel{

    private static final float keyboardheight = 58f*.5f;
      
    private final List<List<LXPoint>> channelPoints;

    public static ActionLightingModel newModel(){
      List<List<LXPoint>> channelPoints = new ArrayList<List<LXPoint>>();
      List<LXPoint> lastChannelPoints;
      List<LXFixture> strips = new ArrayList<LXFixture>();
      StripModel strip;

      channelPoints.add(lastChannelPoints = new ArrayList<LXPoint>());
      //these need a dummy strip in the middle
      strips.add(strip = new StripModel(new StripModel.Metrics(27).setSpacing(0, 1, 0).setOrigin(4, 0, 10)));
      lastChannelPoints.addAll(strip.getPoints());

      strips.add(strip = new StripModel(new StripModel.Metrics(29).setSpacing(0, 1, 0).setOrigin(4, 37, 10)));
      lastChannelPoints.addAll(strip.getPoints());


      strips.add(strip = new StripModel(new StripModel.Metrics(27).setSpacing(0, 1, 0).setOrigin(96-4, 0, 10)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(27).setSpacing(0, 1, 0).setOrigin(96-4, 37, 10)));
      lastChannelPoints.addAll(strip.getPoints());

      channelPoints.add(lastChannelPoints = new ArrayList<LXPoint>());
      strips.add(strip = new StripModel(new StripModel.Metrics(85).setSpacing(-1, 0, 0).setOrigin(96f-5.5f, keyboardheight, 10)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(74).setSpacing(1, 0, 0).setOrigin(11, 0, 10)));
      lastChannelPoints.addAll(strip.getPoints());

      //uprights
      channelPoints.add(lastChannelPoints = new ArrayList<LXPoint>());
      strips.add(strip = new StripModel(new StripModel.Metrics(88).setSpacing(0, 1, 0).setOrigin(13.714f*1f, 78, 23)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(88).setSpacing(0, 1, 0).setOrigin(13.714f*1f, 78, 23)));

      strips.add(strip = new StripModel(new StripModel.Metrics(88).setSpacing(0, 1, 0).setOrigin(13.714f*2f, 78, 23)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(88).setSpacing(0, 1, 0).setOrigin(13.714f*2f, 78, 23)));

      strips.add(strip = new StripModel(new StripModel.Metrics(88).setSpacing(0, 1, 0).setOrigin(13.714f*3f, 78, 23)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(88).setSpacing(0, 1, 0).setOrigin(13.714f*3f, 78, 23)));

      strips.add(strip = new StripModel(new StripModel.Metrics(88).setSpacing(0, 1, 0).setOrigin(13.714f*4f, 78, 23)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(88).setSpacing(0, 1, 0).setOrigin(13.714f*4f, 78, 23)));

      strips.add(strip = new StripModel(new StripModel.Metrics(88).setSpacing(0, 1, 0).setOrigin(13.714f*5f, 78, 23)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(88).setSpacing(0, 1, 0).setOrigin(13.714f*5f, 78, 23)));

      strips.add(strip = new StripModel(new StripModel.Metrics(88).setSpacing(0, 1, 0).setOrigin(13.714f*6f, 78, 23)));
      lastChannelPoints.addAll(strip.getPoints());
      strips.add(strip = new StripModel(new StripModel.Metrics(88).setSpacing(0, 1, 0).setOrigin(13.714f*6f, 78, 23)));



      return new ActionLightingModel(strips.toArray(new LXFixture[0]), channelPoints);

    }




    private ActionLightingModel(LXFixture[] fixtures, List<List<LXPoint>> channelPoints) {
      super(fixtures);
      this.channelPoints = channelPoints;
    }
    public List<List<LXPoint>> getChannelPoints(){
      return channelPoints;
    }
  }


  public final BacksideModel backside;
  public final LidOutsideEdgeModel lidoutsideedgemodel;
  public final KeyboardDownlightsModel keyboarddownlightsmodel;
  public final HarpLightingModel harplightingmodel;
  public final ActionLightingModel actionlightingmodel;

  private final List<List<LXPoint>> channelPoints;

  private PianoModel(LXFixture[] fixtures, BacksideModel backside, LidOutsideEdgeModel lidoutsideedgemodel, KeyboardDownlightsModel keyboarddownlightsmodel,
    HarpLightingModel harplightingmodel, ActionLightingModel actionlightingmodel) {
    super(fixtures);

    this.backside = backside;
    this.lidoutsideedgemodel = lidoutsideedgemodel;
    this.keyboarddownlightsmodel = keyboarddownlightsmodel;
    this.harplightingmodel = harplightingmodel;
    this.actionlightingmodel = actionlightingmodel;
    channelPoints = new ArrayList<List<LXPoint>>();
    channelPoints.addAll(backside.getChannelPoints());
    channelPoints.addAll(lidoutsideedgemodel.getChannelPoints());
    channelPoints.addAll(keyboarddownlightsmodel.getChannelPoints());
    channelPoints.addAll(harplightingmodel.getChannelPoints());
    channelPoints.addAll(actionlightingmodel.getChannelPoints());


  }

  public List<List<LXPoint>> getChannelPoints(){
    return channelPoints;
  }






  public static PianoModel newModel() {
    BacksideModel backside = BacksideModel.newModel();
    LidOutsideEdgeModel lidoutsideedgemodel = LidOutsideEdgeModel.newModel();
    KeyboardDownlightsModel keyboarddownlightsmodel = KeyboardDownlightsModel.newModel();
    HarpLightingModel harplightingmodel = HarpLightingModel.newModel();
    ActionLightingModel actionlightingmodel = ActionLightingModel.newModel();

    List<LXFixture> subModels = new ArrayList<LXFixture>();
    subModels.add(backside);
    subModels.add(lidoutsideedgemodel);
    subModels.add(keyboarddownlightsmodel);
    subModels.add(harplightingmodel);
    subModels.add(actionlightingmodel);
    return new PianoModel(subModels.toArray(new LXFixture[0]), backside, lidoutsideedgemodel, keyboarddownlightsmodel, harplightingmodel, actionlightingmodel);
  }
}
