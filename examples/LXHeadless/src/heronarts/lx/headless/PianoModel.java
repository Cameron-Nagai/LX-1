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
			List<List<LXPoint>> channelPoints = new ArrayList<>();
			List<LXPoint> lastChannelPoints;
			List<LXFixture> strips = new ArrayList<>();
			StripModel strip;
			channelPoints.add(lastChannelPoints = new ArrayList<>());
			strips.add(strip = new StripModel(new StripModel.Metrics(28).setSpacing(1, 0, 0)));
			lastChannelPoints.addAll(strip.getPoints());

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
			List<List<LXPoint>> channelPoints = new ArrayList<>();
			List<LXPoint> lastChannelPoints;
			List<LXFixture> strips = new ArrayList<>();
			StripModel strip;
			channelPoints.add(lastChannelPoints = new ArrayList<>());
			strips.add(strip = new StripModel(new StripModel.Metrics(28).setSpacing(0, 0, 1)));
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

	public final BacksideModel backside;
	public final LidOutsideEdgeModel lidoutsideedgemodel;

	private final List<List<LXPoint>> channelPoints;

	private PianoModel(LXFixture[] fixtures, BacksideModel backside, LidOutsideEdgeModel lidoutsideedgemodel) {
		super(fixtures);

		this.backside = backside;
		this.lidoutsideedgemodel = lidoutsideedgemodel;
		channelPoints = new ArrayList<>();
		channelPoints.addAll(backside.getChannelPoints());
		channelPoints.addAll(lidoutsideedgemodel.getChannelPoints());

	}

	public List<List<LXPoint>> getChannelPoints(){
		return channelPoints;
	}

	public static PianoModel newModel() {
		BacksideModel backside = BacksideModel.newModel();
		LidOutsideEdgeModel lidoutsideedgemodel = LidOutsideEdgeModel.newModel();

		List<LXFixture> subModels = new ArrayList<LXFixture>();
		subModels.add(backside);
		subModels.add(lidoutsideedgemodel);
		return new PianoModel(subModels.toArray(new LXFixture[0]), backside, lidoutsideedgemodel);
	}
}